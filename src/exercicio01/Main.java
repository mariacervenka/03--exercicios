package exercicio01;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        Random rd= new Random();
        Conta conta= new Conta();
        DecimalFormat df= new DecimalFormat("#,##0.00");
        double valor; //nao eh um objeto pq o tipo a variavel nn eh uma classe



        System.out.println("nome do correntista : ");
        conta.correntista = entrada.next();
        conta.numero = rd.nextInt(1000, 9999);

        System.out.println("saldo inicial: R$ " +df.format(conta.saldo));
        System.out.println("informe o valor para deposito: R$ ");
        valor = entrada.nextDouble();
        conta.deposito(valor);

        System.out.println("informe o valor para saque: R$ ");
        valor = entrada.nextDouble();
        conta.sacar(valor);

        System.out.println("saldo atual: R$ " +df.format(conta.saldo));



    }//main

}//class
