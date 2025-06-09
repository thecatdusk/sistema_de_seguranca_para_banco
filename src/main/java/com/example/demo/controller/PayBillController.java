package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.classes.BillPayment;

@RestController
public class PayBillController {
    
    // Endpoint para realizar o pagamento de uma conta
    @PostMapping("/payBill")
    public String payBill(@RequestBody BillPayment payment) {
        
        // Verifica se tem saldo suficiente
        if (payment.getAccount().getBalance() < payment.getValue()) {
            return "Saldo insuficiente";
        }
        
        // Realiza o pagamento
        payment.getAccount().setBalance(
            payment.getAccount().getBalance() - payment.getValue()
        );
        
        return "Pagamento realizado com sucesso";
    }
}