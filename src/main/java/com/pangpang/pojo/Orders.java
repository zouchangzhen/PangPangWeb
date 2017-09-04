package com.pangpang.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/4.
 */
public class Orders implements Serializable {

    private int id;
    private String buyer;
    private String product;
    private int number;
    private double salePrice;
    private double hkPrice;
    private Date purchaseDate;
    private Date operDate;
    private int state;

    //id, buyer, product, number, salePrice,hkPrice,purchaseDate,state


    public Orders() {
    }

    public Orders(int id, String buyer, String product, int number, double salePrice, double hkPrice, Date purchaseDate, int state) {
        this.id = id;
        this.buyer = buyer;
        this.product = product;
        this.number = number;
        this.salePrice = salePrice;
        this.hkPrice = hkPrice;
        this.purchaseDate = purchaseDate;
        this.state = state;
    }

    public Orders(String buyer, String product, int number, double salePrice, double hkPrice, Date purchaseDate) {
        this.buyer = buyer;
        this.product = product;
        this.number = number;
        this.salePrice = salePrice;
        this.hkPrice = hkPrice;
        this.purchaseDate = purchaseDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getHkPrice() {
        return hkPrice;
    }

    public void setHkPrice(double hkPrice) {
        this.hkPrice = hkPrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", buyer='" + buyer + '\'' +
                ", product='" + product + '\'' +
                ", number=" + number +
                ", salePrice=" + salePrice +
                ", hkPrice=" + hkPrice +
                ", purchaseDate=" + purchaseDate +
                ", operDate=" + operDate +
                ", state=" + state +
                '}';
    }
}
