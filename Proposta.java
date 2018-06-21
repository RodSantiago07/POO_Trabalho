package cadastrodprosposta;
/**
 * @author Rodrigo Santiago
 */
public class Proposta {

    private int diasEntrega;
    private double precoTotal;
    private String descricao;

    public Proposta() {
    }
    
    public Proposta(int diasEntrega, double precoTotal, String descricao) {
        this.diasEntrega = diasEntrega;
        this.precoTotal = precoTotal;
        this.descricao = descricao;
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
    
    

}
