package com.natwest.receiverAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

    @Id
    @JsonProperty("Account Number")
    private Long accountNumber;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Amount")
    private Double amount;
    @JsonProperty("Currency")
    private String currency;
    @JsonProperty("Account From")
    private Long accountFrom;

    public Transaction() {
    }

    public Transaction(Long accountNumber, String type, Double amount, String currency, Long accountFrom) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.accountFrom = accountFrom;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Long getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Long accountFrom) {
        this.accountFrom = accountFrom;
    }

    @Override
    public String toString() {
        return "{\"Account Number\":\""+accountNumber+"\",\"Type\":\""+type+"\",\"Amount\":\""+amount+"\",\"Currency\":\""+currency+"\",\"Account From\":\""+accountFrom+"\"}";
    }
}
