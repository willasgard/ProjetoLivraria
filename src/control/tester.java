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
		LivroEntity livro = new LivroEntity();
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
		ItemPesquisaBoundary teste = new ItemPesquisaBoundary(
        		new ImageIcon(ItemCarrinhoBoundary.class.getResource("/resource/livro.png"))
        		, "as aventuras de timtim", "dan brown", 100.0);
		JFrame frame = new JFrame("teste");
		frame.setContentPane(teste);
		frame.setSize(200,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
