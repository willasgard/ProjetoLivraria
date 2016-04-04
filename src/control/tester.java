package control;

import boundary.CarrinhoBoundary;
import entity.AuxQtdadeEntity;
import entity.ItemCarrinhoEntity;
import entity.LivroEntity;

public class tester {
	public static void main(String[] args) {
		CarrinhoBoundary teste = new CarrinhoBoundary();
		LivroEntity livro = new LivroEntity();
	    for (int x = 0; x<8;x++){
	    	livro.setTituloLivro("as leis fundamentais da engenharia de software");
			livro.setPrecoVenda(40);
			AuxQtdadeEntity qtdade = new AuxQtdadeEntity();
			qtdade.setQuantidade(5);
			ItemCarrinhoEntity entity = new ItemCarrinhoEntity();
			entity.setLivro(livro);
			entity.setQuantidade(qtdade);
			teste.adicionaItem(entity);
	    }

	}
}
