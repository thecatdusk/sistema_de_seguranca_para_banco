package com.example.demo.classes;

//criado somente para ter getters e setters
public class BillPayment {
    private checkingAccount account;
    private String billCode; //código da conta para pagar
    private double value;
    
    // Getters e Setters
    public checkingAccount getAccount() { return account; }
    public void setAccount(checkingAccount account) { this.account = account; }
    
    public String getBillCode() { return billCode; }
    public void setBillCode(String billCode) { this.billCode = billCode; }
    
    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }
}

