package Encapsulamento;

public class ContaBancaria {
	
	    private String numeroConta;
	    private String titular;
	    private double saldo;

	    // CONTRUTOR VAZIO, INICIALIZA SAUDO COM ZERO
	    public ContaBancaria() {
	        this.saldo = 0.0;
	    }

	    // 1)---DECLARAÇAO DE -- GETTES NUMERO DA CONTA 
	    public String getNumeroConta() {
	        return numeroConta;
	    }

	    public String getTitular() {
	        return titular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    // 2)--- SETTS COM (VALIDAÇA)
	    public void setNumeroConta(String numeroConta) {
	        if (numeroConta == null || numeroConta.trim().isEmpty()) {
	            System.out.println("Erro: número da conta não pode ser nulo ou vazio.");
	            return;
	        }
	        this.numeroConta = numeroConta;
	    }

	    public void setTitular(String titular) {
	        if (titular == null || titular.trim().isEmpty()) {
	            System.out.println("Erro: titular não pode ser nulo ou vazio.");
	            return;
	        }
	        this.titular = titular;
	    }


	    // --- Métodos de transação ---
	    public void depositar(double valor) {
	        if (valor <= 0) {
	            System.out.println("Depósito inválido: o valor deve ser positivo.");
	            return;
	        }
	        this.saldo += valor;
	        System.out.printf("Depósito de R$ %.2f realizado. Saldo atual: R$ %.2f%n", valor, this.saldo);
	        
	        
	    }

	    public void sacar(double valor) {
	        if (valor <= 0) {
	            System.out.println("Saque inválido: o valor deve ser positivo.");
	            return;
	            
	            
	            
	        }
	        if (valor > this.saldo) {
	            System.out.println("Saque recusado: saldo insuficiente.");
	            return;
	            
	            
	            
	            
	        }
	        this.saldo -= valor;
	        System.out.printf("Saque de R$ %.2f realizado. Saldo atual: R$ %.2f%n", valor, this.saldo);
	    }
	}


