package Heranca;

/**
 * Created by ramon on 06/09/17.
 */
public class Quadrupedes extends Animal{

    public Quadrupedes(String n, String f, int idade) {
        super(n, f);
        this.idade = idade;
    }

    public  int idade;


    public void comerRacao(String racao){
        super.comer();

    };



}
