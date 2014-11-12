package net.bkv;



import net.bkv.stock.Stock;
import net.bkv.stock.StockDetail;
import net.bkv.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by balin.k.v on 12.11.2014.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hibernate one to one (Annotation)");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Stock stock = new Stock();

        stock.setStockCode("1111");
        stock.setStockName("AAAAA");

        session.save(stock);
        session.getTransaction().commit();

        System.out.println("Done");


        session.beginTransaction();

        Stock stock = new Stock();

        stock.setStockCode("1111");
        stock.setStockName("AAAAA");

        StockDetail stockDetail = new StockDetail();
        stockDetail.setCompName("PADINI Holding Malaysia");
        stockDetail.setCompDesc("one stop shopping");
        stockDetail.setRemark("vinci vinci");
        stockDetail.setListedDate(new Date());

        stock.setStockDetail(stockDetail);
        //stockDetail.setStock(stock);

        session.save(stock);
        session.getTransaction().commit();

        System.out.println("Done");
    }
}
