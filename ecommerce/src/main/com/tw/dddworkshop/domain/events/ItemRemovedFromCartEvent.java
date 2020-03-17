package com.tw.dddworkshop.domain.events;

import com.tw.dddworkshop.domain.Product;

public class ItemRemovedFromCartEvent implements DomainEvent {
    private Product product;
    private int quantity;

    public ItemRemovedFromCartEvent(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
