import java.util.*;
public class clsFornecedor {

	private int idFornecedor;
	private String nome;
	private String email;
	private Double mediaAvaliacoes;
	private int qntdAvaliacoes;
	private String texto;
	
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = " ";
	}

	clsFornecedor(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.mediaAvaliacoes = 0.0;
		this.qntdAvaliacoes = 0;
		System.out.println("-");
		
	}
	
	public static clsFornecedor criarFornecedor(String nome, String email) {
		
		clsFornecedor fornecedor = new clsFornecedor(nome, email);
		bancoFornecedor dbFornecedor = bancoFornecedor.getINSTANCE();
		dbFornecedor.objeto.add(fornecedor);
		System.out.println(dbFornecedor.objeto.get(dbFornecedor.objeto.size() - 1).getNome());
		
		return fornecedor;
		
	}
	public static clsFornecedor adcNovoFornecedor(String nome, String email) {
		clsFornecedor fornecedor = new clsFornecedor(nome, email);
		bancoFornecedor dbFornecedor = bancoFornecedor.getINSTANCE();
		dbFornecedor.objeto.add(fornecedor);
		System.out.println(dbFornecedor.objeto.get(dbFornecedor.objeto.size() - 1).getNome());
		
		return fornecedor;
	}
	

	
//	public void criarProposta(int diasEntrega, int precoTotal, String descProposta) {
//		clsProposta proposta = new clsProposta();
//	}
	
	public void cancelarProposta(int statusCompra) {
		
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getMediaAvaliacoes() {
		return mediaAvaliacoes;
	}
	public void setMediaAvaliacoes(Double mediaAvaliacoes) {
		this.mediaAvaliacoes = mediaAvaliacoes;
	}
	public int getQntdAvaliacoes() {
		return qntdAvaliacoes;
	}
	public void setQntdAvaliacoes(int qntdAvaliacoes) {
		this.qntdAvaliacoes = qntdAvaliacoes;
	}
	
	
}
