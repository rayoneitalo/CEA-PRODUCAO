package model.beans;

/**
 * Armario
 */
public class Armario {

    private int idArmario;
    private String nuArmario;
    private String icAtivo;
    private String LocalizacaoIdLocalizacao;

    public Armario() {
    }


    public Armario(int idArmario, String nuArmario, String icAtivo, String LocalizacaoIdLocalizacao) {
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

    public String getLocalizacaoIdLocalizacao() {
        return this.LocalizacaoIdLocalizacao;
    }

    public void setLocalizacaoIdLocalizacao(String LocalizacaoIdLocalizacao) {
        this.LocalizacaoIdLocalizacao = LocalizacaoIdLocalizacao;
    }
    

}