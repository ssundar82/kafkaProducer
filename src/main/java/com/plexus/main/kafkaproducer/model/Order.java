package com.plexus.main.kafkaproducer.model;

public class Order {
    String orderID;
    String customerName;
    String orderDesc;
    String orderDate;
    String orderLocation;

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Order(String orderID, String customerName, String orderDesc, String orderDate, String orderLocation) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.orderDesc = orderDesc;
        this.orderDate = orderDate;
        this.orderLocation = orderLocation;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderLocation() {
        return orderLocation;
    }

    public void setOrderLocation(String orderLocation) {
        this.orderLocation = orderLocation;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", customerName='" + customerName + '\'' +
                ", orderDesc='" + orderDesc + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderLocation='" + orderLocation + '\'' +
                '}';
    }

}
