package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.classes.checkingAccount;

@RestController
public class getBalanceController {
 
    //traz as infos de saldo (balance)
    @GetMapping("/getBalance/{accountId}")
    public double getBalance(@PathVariable int accountId) {
        checkingAccount acc = findAccount(accountId);
        if(acc != null) {
            return acc.getBalance();
        } else {
            throw new IllegalArgumentException("Account not found");
        }
    }
     private checkingAccount findAccount(int accountId) {
        // Simula uma conta para teste
        return new checkingAccount("teste", "teste@email.com", "123", 1000.0);
    }
}
