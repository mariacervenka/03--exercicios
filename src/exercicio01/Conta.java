package exercicio01;

public class Conta {

    //atributos ou variaveis de instancia

    String correntista;
    int numero;
    double saldo;


    //metodo pra depositar um valor na conta,
    // nao pode por static quando faz parte de orientacao a objeto
    //o parametro desse metodo vai ser o valor q deposita na conta

    public void deposito(double valor){
        saldo = saldo + valor;
    }//deposito


    //metodo para sacar um valor da conta
    //vai tirar da conta

    public void sacar(double valor){
        saldo = saldo - valor;
    }


}//class

