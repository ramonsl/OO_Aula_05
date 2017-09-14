package Diagrama;

import java.util.ArrayList;

/**
 * Created by ramon on 06/09/17.
 */
public class Curso {
    private String nome;
    private  ArrayList<Turma> turmas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
