package repository;

import entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Integer> {
    @Query(value = "SELECT * FROM orders WHERE MONTH(NOW()) = MONTH(orderDate)", nativeQuery = true)
    public List<Order> getOrdersInMonth();

    @Query(value = "SELECT * FROM orders WHERE id = (SELECT orderId FROM (SELECT orderId, SUM(amount) AS total FROM (SELECT orderId, (quantity * unitPrice) AS amount FROM order_detail ) base GROUP BY orderId HAVING total >= 100000) sub)", nativeQuery = true)
    public List<Order> getOrdersWithTotalFrom100000();
}
