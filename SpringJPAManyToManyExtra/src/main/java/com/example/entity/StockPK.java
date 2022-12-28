package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class StockPK implements Serializable {
    @Column(name = "product_id")
    private long productId;
    @Column(name = "color_id")
    private long colorId;
    @Column(name = "size_id")
    private long sizeId;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public long getColorId() {
        return colorId;
    }

    public void setColorId(long colorId) {
        this.colorId = colorId;
    }

    public long getSizeId() {
        return sizeId;
    }

    public void setSizeId(long sizeId) {
        this.sizeId = sizeId;
    }
}
