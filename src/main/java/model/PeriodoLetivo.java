package model;

import javax.xml.crypto.Data;

/**
 * PeriodoLetivo
 */
public class PeriodoLetivo {

    private int idPeriodoLetivo;
    private int aaPeriodoLetivo;
    private int nuPeriodoLetivo;
    private Data dtDevolucaoPeriodo;

    public PeriodoLetivo() {

    }

    public PeriodoLetivo(int idPeriodoLetivo, int aaPeriodoLetivo, int nuPeriodoLetivo, Data dtDevolucaoPeriodo) {
        this.idPeriodoLetivo = idPeriodoLetivo;
        this.aaPeriodoLetivo = aaPeriodoLetivo;
        this.nuPeriodoLetivo = nuPeriodoLetivo;
        this.dtDevolucaoPeriodo = dtDevolucaoPeriodo;
    }


    public int getIdPeriodoLetivo() {
        return this.idPeriodoLetivo;
    }

    public void setIdPeriodoLetivo(int idPeriodoLetivo) {
        this.idPeriodoLetivo = idPeriodoLetivo;
    }

    public int getAaPeriodoLetivo() {
        return this.aaPeriodoLetivo;
    }

    public void setAaPeriodoLetivo(int aaPeriodoLetivo) {
        this.aaPeriodoLetivo = aaPeriodoLetivo;
    }

    public int getNuPeriodoLetivo() {
        return this.nuPeriodoLetivo;
    }

    public void setNuPeriodoLetivo(int nuPeriodoLetivo) {
        this.nuPeriodoLetivo = nuPeriodoLetivo;
    }

    public Data getDtDevolucaoPeriodo() {
        return this.dtDevolucaoPeriodo;
    }

    public void setDtDevolucaoPeriodo(Data dtDevolucaoPeriodo) {
        this.dtDevolucaoPeriodo = dtDevolucaoPeriodo;
    }
    

}