package net.bkv.common;

import net.bkv.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by bkv on 04.11.2014.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Stock stock = new Stock();

        stock.setStockCode("11");
        stock.setStockName("ca");

        session.save(stock);
        session.getTransaction().commit();
    }
}
