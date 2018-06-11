package classes;

public class clsFornecedor {
        private int idFornecedor;
	private String nome;
	private String email;
	private double mediaAvaliacoes;
	private int qtdAvaliacoes;

	public void criarProposta(int diasEntrega, int preTotal, int desProposta) {
            //Desenvolver metodo
	}

	public void cancelarProposta(int statusCompra) {
            //Desenvolver metodo
	}

	public String getNome() {
            return nome;
	}

	public String getEmail() {
            return email;
	}

	public double getMediaAvaliacoes() {
            return mediaAvaliacoes;
	}

	public int getQtdAvaliacoes() {
            return qtdAvaliacoes;
	}

	public void setNome(String nome) {
            this.nome = nome;
	}

	public void setEmail(String email) {
            this.email = email;
	}

        public int getIdFornecedor() {
            return idFornecedor;
        }

        public void setIdFornecedor(int idFornecedor) {
            this.idFornecedor = idFornecedor;
        }

	public void setMediaAvaliacoes(double mediaAvaliacoes) {
            this.mediaAvaliacoes = mediaAvaliacoes;
	}

	public void setQtdAvaliacoes(int qtdAvaliacoes) {
            this.qtdAvaliacoes = qtdAvaliacoes;
	}
        
        

}
