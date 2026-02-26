package exercicio02;

public class Paciente {

    //atributos == variaveis

    String nome;
    int idade;


    public int freqMax(){

        return 220 - idade;
    }


    public double[] freqAlvo(){
        //vetor estatico, eh oq tem valor definido
        double[] alvo= new double[2];
        int fm = freqMax();

        alvo[0] = fm * 0.5;
        alvo[1] = fm * 0.85;

        return alvo;
    }


}//class
