package model.beans;

/**
 * Armario
 */
public class Armario {

    private int idArmario;
    private String Localizacao;
    private Integer nuArmario;
    private Integer bloco;
    private boolean icAtivo;
    private int idCadeado;

    public Armario() {
    }


    public Armario(int idArmario, String Localizacao, Integer nuArmario, Integer bloco, boolean icAtivo, int idCadeado) {
        this.idArmario = idArmario;
        this.Localizacao = Localizacao;
        this.nuArmario = nuArmario;
        this.bloco = bloco;
        this.icAtivo = icAtivo;
        this.idCadeado = idCadeado;
    }


    public int getIdArmario() {
        return this.idArmario;
    }

    public void setIdArmario(int idArmario) {
        this.idArmario = idArmario;
    }

    public String getLocalizacao() {
        return this.Localizacao;
    }

    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }

    public Integer getNuArmario() {
        return this.nuArmario;
    }

    public void setNuArmario(Integer nuArmario) {
        this.nuArmario = nuArmario;
    }

    public Integer getBloco() {
        return this.bloco;
    }

    public void setBloco(Integer bloco) {
        this.bloco = bloco;
    }

    public boolean isIcAtivo() {
        return this.icAtivo;
    }

    public boolean getIcAtivo() {
        return this.icAtivo;
    }

    public void setIcAtivo(boolean icAtivo) {
        this.icAtivo = icAtivo;
    }

    public int getIdCadeado() {
        return this.idCadeado;
    }

    public void setIdCadeado(int idCadeado) {
        this.idCadeado = idCadeado;
    }

    
}