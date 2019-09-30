package model;

/**
 * Armario
 */
public class Armario {

    private int idArmario;
    private int nuArmario;
    private String icAtivo;
    private int LocalizacaoIdLocalizacao;


    public Armario() {
    }

    public Armario(int idArmario, int nuArmario, String icAtivo, int LocalizacaoIdLocalizacao) {
        this.idArmario = idArmario;
        this.nuArmario = nuArmario;
        this.icAtivo = icAtivo;
        this.LocalizacaoIdLocalizacao = LocalizacaoIdLocalizacao;
    }



    public int getIdArmario() {
        return this.idArmario;
    }

    public void setIdArmario(int idArmario) {
        this.idArmario = idArmario;
    }

    public int getNuArmario() {
        return this.nuArmario;
    }

    public void setNuArmario(int nuArmario) {
        this.nuArmario = nuArmario;
    }

    public String getIcAtivo() {
        return this.icAtivo;
    }

    public void setIcAtivo(String icAtivo) {
        this.icAtivo = icAtivo;
    }

    public int getLocalizacaoIdLocalizacao() {
        return this.LocalizacaoIdLocalizacao;
    }

    public void setLocalizacaoIdLocalizacao(int LocalizacaoIdLocalizacao) {
        this.LocalizacaoIdLocalizacao = LocalizacaoIdLocalizacao;
    }



}