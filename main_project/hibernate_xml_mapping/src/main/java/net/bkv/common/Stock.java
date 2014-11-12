package net.bkv.common;

import java.io.Serializable;

/**
 * Created by bkv on 04.11.2014.
 */
public class Stock implements Serializable {
    private static final long serialVersionID = 1L;

    private Integer stockId;
    private String stockCode;
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
