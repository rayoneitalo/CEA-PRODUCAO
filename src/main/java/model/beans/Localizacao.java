package model.beans;

/**
 * Localizacao
 */
public class Localizacao {

    private int idLocalizacao;
    private String nuLocalizacao;
    private String icAtivo;
    private String colLocalizacao;


    public Localizacao() {
    }

    public Localizacao(int idLocalizacao, String nuLocalizacao, String icAtivo, String colLocalizacao) {
        this.idLocalizacao = idLocalizacao;
        this.nuLocalizacao = nuLocalizacao;
        this.icAtivo = icAtivo;
        this.colLocalizacao = colLocalizacao;
    }
     

    public int getIdLocalizacao() {
        return this.idLocalizacao;
    }

    public void setIdLocalizacao(int idLocalizacao) {
        this.idLocalizacao = idLocalizacao;
    }

    public String getNuLocalizacao() {
        return this.nuLocalizacao;
    }

    public void setNuLocalizacao(String nuLocalizacao) {
        this.nuLocalizacao = nuLocalizacao;
    }

    public String getIcAtivo() {
        return this.icAtivo;
    }

    public void setIcAtivo(String icAtivo) {
        this.icAtivo = icAtivo;
    }

    public String getColLocalizacao() {
        return this.colLocalizacao;
    }

    public void setColLocalizacao(String colLocalizacao) {
        this.colLocalizacao = colLocalizacao;
    }


}