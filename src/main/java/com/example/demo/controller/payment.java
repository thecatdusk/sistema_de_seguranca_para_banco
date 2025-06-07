package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.classes.checkingAccount;

public class payment {
    @RestController
	public class paymentController {
		@PostMapping("/payment")
		//add request body aqui
		public String payment(checkingAccount userCheckingAccount, double valueToPay){ 
			
			if(userCheckingAccount.getBalance() <= valueToPay) {
				return "<h1>Saldo insuficiente!</h1>";
			}else{
				userCheckingAccount.setBalance(userCheckingAccount.getBalance() - valueToPay);
				//atualizar no banco de dados o saldo do usuário
				return "<h1>Pagamento realizado com sucesso!</h1>";
			}	
		}
	}
}

