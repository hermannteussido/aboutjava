package net.bkv.stock;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by balin.k.v on 12.11.2014.
 */
@Entity
@Table(name = "stock_detail", catalog = "mkyongdb")
public class StockDetail implements java.io.Serializable {

    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "stock"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    private Integer stockId;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Stock stock;

    @Column(name = "COMP_NAME", nullable = false, length = 100)
    private String compName;

    @Column(name = "COMP_DESC", nullable = false)
    private String compDesc;

    @Column(name = "REMARK", nullable = false)
    private String remark;

    @Temporal(TemporalType.DATE)
    @Column(name = "LISTED_DATE", nullable = false, length = 10)
    private Date listedDate;

    public StockDetail() {
    }

    public StockDetail(Stock stock, String compName, String compDesc,
                       String remark, Date listedDate) {
        this.stock = stock;
        this.compName = compName;
        this.compDesc = compDesc;
        this.remark = remark;
        this.listedDate = listedDate;
    }

    public Integer getStockId() {
        return this.stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Stock getStock() {
        return this.stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public String getCompName() {
        return this.compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getCompDesc() {
        return this.compDesc;
    }

    public void setCompDesc(String compDesc) {
        this.compDesc = compDesc;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getListedDate() {
        return this.listedDate;
    }

    public void setListedDate(Date listedDate) {
        this.listedDate = listedDate;
    }
}
