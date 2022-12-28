package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "stock")
public class Stock {
    @EmbeddedId
    private StockPK stockPK;

    @JsonIgnore
    @ManyToOne
    @MapsId("productId")
    private Product product;

    @JsonIgnore
    @ManyToOne
    @MapsId("colorId")
    private Color color;

    @JsonIgnore
    @ManyToOne
    @MapsId("sizeId")
    private Size size;

    private int quantity;

    public StockPK getStockPK() {
        return stockPK;
    }

    public void setStockPK(StockPK stockPK) {
        this.stockPK = stockPK;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
