package exercicio02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);
        Paciente paciente = new Paciente();
        double [] alvo = paciente.freqAlvo();


        System.out.println("digite o nome do paciente: ");
        paciente.nome = entrada.nextLine();

        System.out.println("digite a idade do paciente: ");
        paciente.idade = entrada.nextInt();

        System.out.println("paciente: " +paciente.nome);
        System.out.println("frequencia maxima: " +paciente.freqMax());

        System.out.println("intervalo da frequencia alvo: [" +alvo[0]+ ", " +alvo[1]+ "] " );

    }//main

}//class
