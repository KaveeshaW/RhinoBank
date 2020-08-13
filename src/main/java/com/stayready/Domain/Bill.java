package com.stayready.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bill {

    @Id
    @GeneratedValue
    @Column(name = "BILL_ID")
    private Long id;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "PAYEE")
    private String payee;

    @Column(name = "NICKNAME")
    private String nickNamee;

    @Column(name = "CREATION_DATE")
    private Long creationDate;

    @Column(name = "PAYMENT_DATE")
    private String paymentDate;

    @Column(name = "RECCURING_DATE")
    private Double reccuringDate;

    @Column(name = "UPCOMING_PAYMENT_DATE")
    private String upcomingPaymentDate;

    @Column(name = "PAYMENT_AMOUNT")
    private double paymentAmount;

    @Column(name = "ACCOUNT_ID")
    private Long account_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getNickNamee() {
        return nickNamee;
    }

    public void setNickNamee(String nickNamee) {
        this.nickNamee = nickNamee;
    }

    public Long getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Long creationDate) {
        this.creationDate = creationDate;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Double getReccuringDate() {
        return reccuringDate;
    }

    public void setReccuringDate(Double reccuringDate) {
        this.reccuringDate = reccuringDate;
    }

    public String getUpcomingPaymentDate() {
        return upcomingPaymentDate;
    }

    public void setUpcomingPaymentDate(String upcomingPaymentDate) {
        this.upcomingPaymentDate = upcomingPaymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }


}
