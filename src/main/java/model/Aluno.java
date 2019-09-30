package model;

/**
 * Aluno
 */
public class Aluno {

    private int idAluno;
    private int nuRA;
    private String Nome;
    private String NomeCurso;
    private String NomeTurno;
    private String NomeCampus;


    public Aluno() {
    }

    public Aluno(int idAluno, int nuRA, String Nome, String NomeCurso, String NomeTurno, String NomeCampus) {
        this.idAluno = idAluno;
        this.nuRA = nuRA;
        this.Nome = Nome;
        this.NomeCurso = NomeCurso;
        this.NomeTurno = NomeTurno;
        this.NomeCampus = NomeCampus;
    }



    public int getIdAluno() {
        return this.idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getNuRA() {
        return this.nuRA;
    }

    public void setNuRA(int nuRA) {
        this.nuRA = nuRA;
    }

    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNomeCurso() {
        return this.NomeCurso;
    }

    public void setNomeCurso(String NomeCurso) {
        this.NomeCurso = NomeCurso;
    }

    public String getNomeTurno() {
        return this.NomeTurno;
    }

    public void setNomeTurno(String NomeTurno) {
        this.NomeTurno = NomeTurno;
    }

    public String getNomeCampus() {
        return this.NomeCampus;
    }

    public void setNomeCampus(String NomeCampus) {
        this.NomeCampus = NomeCampus;
    }


}