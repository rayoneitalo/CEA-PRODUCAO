package model.beans;

import javax.xml.crypto.Data;

/**
 * EmprestimoArmario
 */
public class EmprestimoArmario {

    private int IdEmprestimoArmario;
    private Data dtEmprestimo;
    private Data dtDevolucao;
    private int nuProtocolo;
    private int AlunoIdAluno;
    private int ArmarioPeriodoIdArmarioPeriodo;
    private int ArmarioPeriodoCadeadoIdCadeado;
    private int ArmarioPeriodoArmarioIdArmario;
    private int ArmarioPeriodoArmarioLocalizacaoIdLocalizacao;
    private int ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo;


    public EmprestimoArmario() {
    }


    public EmprestimoArmario(int IdEmprestimoArmario, Data dtEmprestimo, Data dtDevolucao, int nuProtocolo, int AlunoIdAluno, int ArmarioPeriodoIdArmarioPeriodo, int ArmarioPeriodoCadeadoIdCadeado, int ArmarioPeriodoArmarioIdArmario, int ArmarioPeriodoArmarioLocalizacaoIdLocalizacao, int ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo) {
        this.IdEmprestimoArmario = IdEmprestimoArmario;
        this.dtEmprestimo = dtEmprestimo;
        this.dtDevolucao = dtDevolucao;
        this.nuProtocolo = nuProtocolo;
        this.AlunoIdAluno = AlunoIdAluno;
        this.ArmarioPeriodoIdArmarioPeriodo = ArmarioPeriodoIdArmarioPeriodo;
        this.ArmarioPeriodoCadeadoIdCadeado = ArmarioPeriodoCadeadoIdCadeado;
        this.ArmarioPeriodoArmarioIdArmario = ArmarioPeriodoArmarioIdArmario;
        this.ArmarioPeriodoArmarioLocalizacaoIdLocalizacao = ArmarioPeriodoArmarioLocalizacaoIdLocalizacao;
        this.ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo = ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo;
    }


    public int getIdEmprestimoArmario() {
        return this.IdEmprestimoArmario;
    }

    public void setIdEmprestimoArmario(int IdEmprestimoArmario) {
        this.IdEmprestimoArmario = IdEmprestimoArmario;
    }

    public Data getDtEmprestimo() {
        return this.dtEmprestimo;
    }

    public void setDtEmprestimo(Data dtEmprestimo) {
        this.dtEmprestimo = dtEmprestimo;
    }

    public Data getDtDevolucao() {
        return this.dtDevolucao;
    }

    public void setDtDevolucao(Data dtDevolucao) {
        this.dtDevolucao = dtDevolucao;
    }

    public int getNuProtocolo() {
        return this.nuProtocolo;
    }

    public void setNuProtocolo(int nuProtocolo) {
        this.nuProtocolo = nuProtocolo;
    }

    public int getAlunoIdAluno() {
        return this.AlunoIdAluno;
    }

    public void setAlunoIdAluno(int AlunoIdAluno) {
        this.AlunoIdAluno = AlunoIdAluno;
    }

    public int getArmarioPeriodoIdArmarioPeriodo() {
        return this.ArmarioPeriodoIdArmarioPeriodo;
    }

    public void setArmarioPeriodoIdArmarioPeriodo(int ArmarioPeriodoIdArmarioPeriodo) {
        this.ArmarioPeriodoIdArmarioPeriodo = ArmarioPeriodoIdArmarioPeriodo;
    }

    public int getArmarioPeriodoCadeadoIdCadeado() {
        return this.ArmarioPeriodoCadeadoIdCadeado;
    }

    public void setArmarioPeriodoCadeadoIdCadeado(int ArmarioPeriodoCadeadoIdCadeado) {
        this.ArmarioPeriodoCadeadoIdCadeado = ArmarioPeriodoCadeadoIdCadeado;
    }

    public int getArmarioPeriodoArmarioIdArmario() {
        return this.ArmarioPeriodoArmarioIdArmario;
    }

    public void setArmarioPeriodoArmarioIdArmario(int ArmarioPeriodoArmarioIdArmario) {
        this.ArmarioPeriodoArmarioIdArmario = ArmarioPeriodoArmarioIdArmario;
    }

    public int getArmarioPeriodoArmarioLocalizacaoIdLocalizacao() {
        return this.ArmarioPeriodoArmarioLocalizacaoIdLocalizacao;
    }

    public void setArmarioPeriodoArmarioLocalizacaoIdLocalizacao(int ArmarioPeriodoArmarioLocalizacaoIdLocalizacao) {
        this.ArmarioPeriodoArmarioLocalizacaoIdLocalizacao = ArmarioPeriodoArmarioLocalizacaoIdLocalizacao;
    }

    public int getArmarioPeriodoPeriodoLetivoIdPeriodoLetivo() {
        return this.ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo;
    }

    public void setArmarioPeriodoPeriodoLetivoIdPeriodoLetivo(int ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo) {
        this.ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo = ArmarioPeriodoPeriodoLetivoIdPeriodoLetivo;
    }





}