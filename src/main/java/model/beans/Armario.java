package model.beans;

/**
 * Armario
 */
public class Armario {

    private int idArmario;
    private String nuArmario;
    private String icAtivo;
    private String idLocalizacao;

    public Armario() {
    }

    public String getIdLocalizacao() {
        return idLocalizacao;
    }

    public void setIdLocalizacao(String idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public Armario(int idArmario, String nuArmario, String icAtivo, String LocalizacaoIdLocalizacao) {
        this.idArmario = idArmario;
        this.nuArmario = nuArmario;
        this.icAtivo = icAtivo;

    }

    public int getIdArmario() {
        return this.idArmario;
    }

    public void setIdArmario(int idArmario) {
        this.idArmario = idArmario;
    }

    public String getNuArmario() {
        return this.nuArmario;
    }

    public void setNuArmario(String nuArmario) {
        this.nuArmario = nuArmario;
    }

    public String getIcAtivo() {
        return this.icAtivo;
    }

    public void setIcAtivo(String icAtivo) {
        this.icAtivo = icAtivo;
    }

}