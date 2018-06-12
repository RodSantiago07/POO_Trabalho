package classes;

import java.util.Date;

public class clsCompra {

	private Date dataEntrega;
	private double valorTotal;
	private String formaPagamento;
	private int status;
	private int idFornecedor;
	private String notaAvaliacao;
	private String descricaoAvaliacao;

	public void enviarEmailCompra(String emailFornecedor) {
            //Fazer metodo
	}

	public double aplicaNotaCompra(int nota, String nomeFornec) {
            //
            return 0;
	}

	public Date getDataEntrega() {
            return dataEntrega;
	}

	public double getValorTotal() {
            return valorTotal;
	}

	public String getFormaPagamento() {
            return formaPagamento;
	}

	public int getStatus() {
            return status;
	}

	public int getIidFornecedor() {
            return idFornecedor;
	}

	public String getNotaAvaliacao() {
            return notaAvaliacao;
	}

	public String getDescricaoAvaliacao() {
            return descricaoAvaliacao;
	}

	public void setDataEntrega(Date dataEntrega) {
            this.dataEntrega = dataEntrega;
	}

	public void setValorTotal(double valorTotal) {
            this.valorTotal = valorTotal;
	}

	public void setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
	}

	public void setStatus(int status) {
            this.status = status;
	}

	public void setIidFornecedor(int idFornecedor) {
            //this.idFornecedor -- Auto increment
	}

	public void setNotaAvaliacao(String notaAvaliacao) {
            this.notaAvaliacao = notaAvaliacao;
	}

	public void setDescricaoAvaliacao(String descricaoAvaliacao) {
            this.descricaoAvaliacao = descricaoAvaliacao;
	}

}
