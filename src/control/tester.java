package control;

import boundary.CarrinhoBoundary;
import entity.LivroEntity;

public class tester {
	public static void main(String[] args) {
		CarrinhoBoundary teste = new CarrinhoBoundary();
		LivroEntity livro = new LivroEntity();
		livro.setNome("as leis fundamentais da engenharia de software");
		livro.setPreco(40);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);
		teste.adicionaItem(livro, 3);

	}
}
