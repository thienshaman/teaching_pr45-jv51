import entity.Order;
import entity.OrderDetail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repository.OrderDetailRepository;
import repository.OrderRepository;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        OrderRepository orderRepository = (OrderRepository) context.getBean("orderRepository");
        OrderDetailRepository orderDetailRepository = (OrderDetailRepository) context.getBean("orderDetailRepository");

//        Order order = new Order();
//        order.setOrderDate(LocalDate.now());
//        order.setCustomerName("Nhat Luan");
//        order.setCustomerAddress("Quang Nam");
//
//        orderRepository.save(order);
//
//        OrderDetail orderDetail1 = new OrderDetail();
//        orderDetail1.setProductName("Oshi");
//        orderDetail1.setQuantity(2);
//        orderDetail1.setUnitPrice(5000);
//        orderDetail1.setOrder(order);
//        orderDetailRepository.save(orderDetail1);
//
//        OrderDetail orderDetail2 = new OrderDetail();
//        orderDetail2.setProductName("Apple");
//        orderDetail2.setQuantity(4);
//        orderDetail2.setUnitPrice(5000);
//        orderDetail2.setOrder(order);
//        orderDetailRepository.save(orderDetail2);

//        List<Order> orders = (List<Order>) orderRepository.findAll();
//        for (Order o : orders) {
//            System.out.println("=================================");
//            System.out.println("Order ID: " + o.getId());
//            System.out.println("Cus name: " + o.getCustomerName());
//            System.out.println("------Details-------");
//            for (OrderDetail detail : o.getOrderDetails()) {
//                System.out.println("Product: " + detail.getProductName());
//            }
//        }

//        Order orderById = (Order) orderRepository.findById(7).get();
//        System.out.println("=================================");
//        System.out.println("Order ID: " + orderById.getId());
//        System.out.println("------Details-------");
//        for (OrderDetail detail : orderById.getOrderDetails()) {
//            System.out.println("Product: " + detail.getProductName());
//        }

//        List<Order> ordersInMonth = (List<Order>) orderRepository.getOrdersInMonth();
//        for (Order o : ordersInMonth) {
//            System.out.println("=================================");
//            System.out.println("Order ID: " + o.getId());
//            System.out.println("Cus name: " + o.getCustomerName());
//            System.out.println("------Details-------");
//            for (OrderDetail detail : o.getOrderDetails()) {
//                System.out.println("Product: " + detail.getProductName());
//            }
//        }

        List<Order> orders2 = (List<Order>) orderRepository.getOrdersWithTotalFrom100000();
        for (Order o : orders2) {
            System.out.println("=================================");
            System.out.println("Order ID: " + o.getId());
            System.out.println("Cus name: " + o.getCustomerName());
            System.out.println("------Details-------");
            for (OrderDetail detail : o.getOrderDetails()) {
                System.out.println("Product: " + detail.getProductName());
            }
        }
    }
}
