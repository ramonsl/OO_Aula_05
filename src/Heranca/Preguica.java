package Heranca;

/**
 * Created by ramon on 06/09/17.
 */
public class Preguica extends Animal {


    public Preguica(String n, String f) {
        super(n, f);

    }



    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void subirArvore(){}
}
