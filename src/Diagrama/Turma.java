package Diagrama;

import java.util.ArrayList;

/**
 * Created by ramon on 06/09/17.
 */
public class Turma {
    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public ArrayList<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(ArrayList<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    private int codTurma;
    private Curso curso;

    private ArrayList<Matricula> matriculas;

    public boolean criarTurma(){

        if(matriculas.size()>=20){
            return true;

        }else{
            return false;
        }
    }




}
