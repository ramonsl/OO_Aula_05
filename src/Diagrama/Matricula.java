package Diagrama;

/**
 * Created by ramon on 06/09/17.
 */
public class Matricula {
    private int nmatricula;
    private Turma turma;
    private Aluno aluno;

    public int getNmatricula() {
        return nmatricula;
    }

    public void setNmatricula(int nmatricula) {
        this.nmatricula = nmatricula;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
