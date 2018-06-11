package classes;

import java.util.Date;

public class clsProposta implements interfaces.iProposta {

    private int diasEntrega;
    private double precoTotal;
    private String descricao;

    public Date calculaPrazo(int diasEntrega) {
        //
        return null;
    }

    public int getDiasEntrega() {
        return diasEntrega;
    }

    public void setDiasEntrega(int diasEntrega) {
        this.diasEntrega = diasEntrega;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void calculaPrazo() {

    }

}
