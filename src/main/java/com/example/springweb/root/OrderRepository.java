package com.example.springweb.root;

import com.example.springweb.root.persistence.Order;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class OrderRepository {

    private Map<Integer, Order> orders = new HashMap<>();
    private static AtomicInteger idCounter = new AtomicInteger(0);

    public Order findById(int id) {
        return orders.get(id);
    }

    public List<Order> getAll() {
        return new ArrayList<>(orders.values());
    }

    public Order addOrder(Order order) {
        order.setId(idCounter.incrementAndGet());
        orders.put(order.getId(), order);
        return order;
    }
}









