package Heranca;

/**
 * Created by ramon on 06/09/17.
 */
public class Animal {
    private String nome;
    private String familia;

    public Animal(String n,String f){
        nome=n;
        familia=f;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    private    void respirar(){
        System.out.println("respirada");
    }

    public   void respirar(int folego){
        System.out.println("respirada "+folego);
    }

    public void andar(){};
    public void comer(){};

}
