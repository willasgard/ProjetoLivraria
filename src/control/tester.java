package control;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import boundary.CarrinhoBoundary;
import boundary.ItemCarrinhoBoundary;
import boundary.ItemPesquisaBoundary;
import boundary.LivroBoundary;
import boundary.PesquisaBoundary;
import entity.AuxQtdadeEntity;
import entity.ItemCarrinhoEntity;
import entity.LivroEntity;

public class tester {
	public static void main(String[] args) {
		/*CarrinhoBoundary teste = new CarrinhoBoundary();
	    for (int x = 0; x<8;x++){
	    	livro.setTituloLivro("as leis fundamentais da engenharia de software" + x);
			livro.setPrecoVenda(40);
			AuxQtdadeEntity qtdade = new AuxQtdadeEntity();
			qtdade.setQuantidade(x + 3);
			ItemCarrinhoEntity entity = new ItemCarrinhoEntity();
			entity.setLivro(livro);
			entity.setQuantidade(qtdade);
			teste.adicionaItem(entity);
	    }*/
		LivroEntity livro = new LivroEntity();
		livro.setNomeAutor("bezerra");
		livro.setTituloLivro("tecnicas de uml");
		livro.setPrecoVenda(300.0);
		livro.setImagem(
				new ImageIcon(CarrinhoBoundary.class.getResource("/resource/livro.png"))		
				);
		java.util.List<LivroEntity> listaLivro = new ArrayList<LivroEntity>();
		for(int x=1;x<5;x++){
			listaLivro.add(livro);
		}
		
		
		PesquisaBoundary tela = new PesquisaBoundary();
		tela.mostraPesquisa(listaLivro);
		
	}
}
