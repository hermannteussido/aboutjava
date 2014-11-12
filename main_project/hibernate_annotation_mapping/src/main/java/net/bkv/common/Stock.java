package net.bkv.common;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "stock", catalog = "mkyong", uniqueConstraints = {
        @UniqueConstraint(columnNames = "STOCK_NAME"),
        @UniqueConstraint(columnNames = "STOCK_CODE") })
public class Stock implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    private Integer stockId;

    @Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
    private String stockCode;

    @Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
    private String stockName;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
