package control;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import boundary.CarrinhoBoundary;
import boundary.ItemCarrinhoBoundary;
import boundary.ItemPesquisaBoundary;
import boundary.LivroBoundary;
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
		ItemPesquisaBoundary teste = new ItemPesquisaBoundary(livro);
		JFrame frame = new JFrame("teste");
		frame.setContentPane(teste);
		frame.setSize(900,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
