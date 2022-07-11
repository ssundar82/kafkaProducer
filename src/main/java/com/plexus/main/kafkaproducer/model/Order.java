package com.plexus.main.kafkaproducer.model;

import java.security.SecureRandom;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import kafka.utils.Json;
import kafka.utils.json.JsonObject;
import org.apache.kafka.clients.consumer.StickyAssignor;
import org.apache.kafka.common.protocol.types.Field.Str;
import org.springframework.boot.configurationprocessor.json.JSONObject;

public class Order {
    String OrderId;
    String CustomerID;
    Date OrderDate;
    String CurrencyCode;
    String FirstName;
    String LastName;
    String Address1;
    String Address2;
    String Address3;
    String City;
    String State;
    String Zip;
    String Country;
    String County;
    String Email;
    String Phone;
    String Notes;
    Integer Total;
    String ItemCode;
    String Itemdescription;
    Integer quantity;
    Integer Price;
    Integer TotalPrice;
    Integer tax;
    Integer Weight;

    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Order(String orderId, String customerID, Date orderDate, String currencyCode, String firstName,
            String lastName, String address1, String address2, String address3, String city, String state, String zip,
            String country, String county, String email, String phone, String notes, Integer total, String itemCode,
            String itemdescription, Integer quantity, Integer price, Integer totalPrice, Integer tax, Integer weight) {
        this.OrderId = orderId;
        this.CustomerID = customerID;
        this.OrderDate = orderDate;
        this.CurrencyCode = currencyCode;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Address1 = address1;
        this.Address2 = address2;
        this.Address3 = address3;
        this.City = city;
        this.State = state;
        this.Zip = zip;
        this.Country = country;
        this.County = county;
        this.Email = email;
        this.Phone = phone;
        this.Notes = notes;
        this.Total = total;
        this.ItemCode = itemCode;
        this.Itemdescription = itemdescription;
        this.quantity = quantity;
        this.Price = price;
        this.TotalPrice = totalPrice;
        this.tax = tax;
        this.Weight = weight;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        this.OrderId = orderId;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        this.CustomerID = customerID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.OrderDate = orderDate;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.CurrencyCode = currencyCode;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        this.Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getAddress3() {
        return Address3;
    }

    public void setAddress3(String address3) {
        Address3 = address3;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setItemCode(String itemCode) {
        ItemCode = itemCode;
    }

    public String getItemdescription() {
        return Itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        Itemdescription = itemdescription;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Integer getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        TotalPrice = totalPrice;
    }

    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    @Override
    public String toString() {
        return "Order{'" +
                "OrderId='" + OrderId + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", OrderDate=" + OrderDate +
                ", CurrencyCode='" + CurrencyCode + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Address1='" + Address1 + '\'' +
                ", Address2='" + Address2 + '\'' +
                ", Address3='" + Address3 + '\'' +
                ", City='" + City + '\'' +
                ", State='" + State + '\'' +
                ", Zip='" + Zip + '\'' +
                ", Country='" + Country + '\'' +
                ", County='" + County + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Notes='" + Notes + '\'' +
                ", Total=" + Total +
                ", ItemCode='" + ItemCode + '\'' +
                ", Itemdescription='" + Itemdescription + '\'' +
                ", quantity=" + quantity +
                ", Price=" + Price +
                ", TotalPrice=" + TotalPrice +
                ", tax=" + tax +
                ", Weight=" + Weight +
                '}';
    }
}
