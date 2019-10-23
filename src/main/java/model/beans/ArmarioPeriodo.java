package model.beans;

/**
 * ArmarioPeriodo
 */
public class ArmarioPeriodo {

    private int idArmarioPeriodo;
    private int idCadeado;
    private int ArmarioIdArmario;
    private int ArmarioLocalizacaoIdLocalizacao;
    private int PeriodoLetivoIdPeriodoLetivo;


    public ArmarioPeriodo() {
    }


    public ArmarioPeriodo(int idArmarioPeriodo, int idCadeado, int ArmarioIdArmario, int ArmarioLocalizacaoIdLocalizacao, int PeriodoLetivoIdPeriodoLetivo) {
        this.idArmarioPeriodo = idArmarioPeriodo;
        this.idCadeado = idCadeado;
        this.ArmarioIdArmario = ArmarioIdArmario;
        this.ArmarioLocalizacaoIdLocalizacao = ArmarioLocalizacaoIdLocalizacao;
        this.PeriodoLetivoIdPeriodoLetivo = PeriodoLetivoIdPeriodoLetivo;
    }



    public int getIdArmarioPeriodo() {
        return this.idArmarioPeriodo;
    }

    public void setIdArmarioPeriodo(int idArmarioPeriodo) {
        this.idArmarioPeriodo = idArmarioPeriodo;
    }

    public int getIdCadeado() {
        return this.idCadeado;
    }

    public void setIdCadeado(int idCadeado) {
        this.idCadeado = idCadeado;
    }

    public int getArmarioIdArmario() {
        return this.ArmarioIdArmario;
    }

    public void setArmarioIdArmario(int ArmarioIdArmario) {
        this.ArmarioIdArmario = ArmarioIdArmario;
    }

    public int getArmarioLocalizacaoIdLocalizacao() {
        return this.ArmarioLocalizacaoIdLocalizacao;
    }

    public void setArmarioLocalizacaoIdLocalizacao(int ArmarioLocalizacaoIdLocalizacao) {
        this.ArmarioLocalizacaoIdLocalizacao = ArmarioLocalizacaoIdLocalizacao;
    }

    public int getPeriodoLetivoIdPeriodoLetivo() {
        return this.PeriodoLetivoIdPeriodoLetivo;
    }

    public void setPeriodoLetivoIdPeriodoLetivo(int PeriodoLetivoIdPeriodoLetivo) {
        this.PeriodoLetivoIdPeriodoLetivo = PeriodoLetivoIdPeriodoLetivo;
    }


}