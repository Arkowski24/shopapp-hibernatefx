package pl.edu.agh.hibernate.example.dao;

import pl.edu.agh.hibernate.example.model.order.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class OrderDAO {
    private EntityManager em;

    public OrderDAO(EntityManager em) {
        this.em = em;
    }

    public void saveOrder(Order order) {
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(order);
        et.commit();
    }
}