package model.beans;

/**
 * Cadeado
 */
public class Cadeado {

    private int idCadeado;
    private String coCadeado;
    private String coSenha;
    private String icAtivo;


    public Cadeado() {
    }


    public Cadeado(int idCadeado, String coCadeado, String coSenha, String icAtivo) {
        this.idCadeado = idCadeado;
        this.coCadeado = coCadeado;
        this.coSenha = coSenha;
        this.icAtivo = icAtivo;
    }


    public int getIdCadeado() {
        return this.idCadeado;
    }

    public void setIdCadeado(int idCadeado) {
        this.idCadeado = idCadeado;
    }

    public String getCoCadeado() {
        return this.coCadeado;
    }

    public void setCoCadeado(String coCadeado) {
        this.coCadeado = coCadeado;
    }

    public String getCoSenha() {
        return this.coSenha;
    }

    public void setCoSenha(String coSenha) {
        this.coSenha = coSenha;
    }

    public String getIcAtivo() {
        return this.icAtivo;
    }

    public void setIcAtivo(String icAtivo) {
        this.icAtivo = icAtivo;
    }

 
}