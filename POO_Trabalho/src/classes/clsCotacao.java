package classes;

import java.util.List;

public class clsCotacao implements interfaces.iCotacao {

	private String descRequisitos;
	private List<clsItemCotacao> itensCotacao;
	private List<clsProposta> listaPropostas;

	public void incluirItem(int idProduto, int quantidade) {

	}

	public void removerItem() {

	}

	public void enviarEmailCotacao(String email) {

	}

	public String getDescRequisitos() {
            return descRequisitos;
	}

	public void setDescRequisitos(String descRequisitos) {
            this.descRequisitos = descRequisitos;
	}

	public void addItemCotacao(clsItemCotacao item) {

	}

	public void removerItemCotacao(clsItemCotacao item) {

	}

        @Override
        public void enviarEmailCotacao() {
       
        }

}
