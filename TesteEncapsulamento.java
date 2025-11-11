package Encapsulamento;

public class TesteEncapsulamento {

	public static void main(String[] args) {
		   ContaBancaria conta = new ContaBancaria();

	        // 1) Tentativa de acesso direto (comentadas para compilar)
	        // Se descomentar as linhas abaixo, o compilador dará erro porque 'saldo' é private:
	        //
	        // conta.saldo = 500.0;   // ERRO de compilação: saldo has private access in ContaBancaria
	        // System.out.println(conta.saldo); // ERRO de compilação

	        // 2) Inicializando numeroConta e titular via setters
	        conta.setNumeroConta("98765-4");
	        conta.setTitular("Emanuel Henrique");

	        // 3) Tentativas inválidas de set (serão rejeitadas com mensagem)
	        conta.setNumeroConta("");   // inválido
	        conta.setTitular(null);     // inválido

	        // 4) Operações de depósito e saque (válidas e inválidas)
	        conta.depositar(1000.00);   // válido
	        conta.depositar(-50.00);    // inválido

	        conta.sacar(200.00);        // válido
	        conta.sacar(1000.00);       // inválido: mais que o saldo
	        conta.sacar(-10.00);        // inválido

	        // 5) Imprime saldo final usando getter
	        System.out.printf("Saldo final da conta %s (titular: %s): R$ %.2f%n",
	                conta.getNumeroConta(), conta.getTitular(), conta.getSaldo());
	    }
	

	}


