package boundary;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemPesquisaBoundary extends JPanel{

	private ImageIcon imagem;
	private String titulo;
	private String autor;
	private Double preco;
	private GridLayout gridlayout = new GridLayout(1, 5, 5, 5);
	
	public ItemPesquisaBoundary(ImageIcon imagem, String titulo, String autor, Double preco) {
		super();
		this.imagem = imagem;
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.criarTela();
	}
	
	private void criarTela(){
		JLabel lbAutor = new JLabel(autor);
		JLabel lbTitulo = new  JLabel(titulo);
		JLabel lbPreco = new JLabel("R$ " + preco);
		JButton btnImagem = new JButton("");
		JButton btnAddCarrinho = new JButton("");
		
		btnImagem.setIcon(imagem);
		btnImagem.setForeground(Color.RED);
		btnImagem.setBackground(Color.WHITE);
		btnImagem.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnImagem.setBorder(BorderFactory.createEmptyBorder());
		btnImagem.setToolTipText("Clique na imagem para visualizar mais detalhes sobre o livro");
		
		btnAddCarrinho.setIcon(new ImageIcon(ItemCarrinhoBoundary.class.getResource("/resource/adicionarCarrinho.png")));
		btnAddCarrinho.setForeground(Color.RED);
		btnAddCarrinho.setBackground(Color.WHITE);
		btnAddCarrinho.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAddCarrinho.setBorder(BorderFactory.createEmptyBorder());
		btnAddCarrinho.setToolTipText("Adicionar item ao carrinho de compras");
		
		
		lbAutor.setHorizontalAlignment(JLabel.CENTER);
		lbAutor.setVerticalAlignment(JLabel.CENTER);
		
		lbTitulo.setHorizontalAlignment(JLabel.CENTER);
		lbTitulo.setVerticalAlignment(JLabel.CENTER);
		
		lbPreco.setHorizontalAlignment(JLabel.CENTER);
		lbPreco.setVerticalAlignment(JLabel.CENTER);
		
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbAutor.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbPreco.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		
		this.setLayout(gridlayout);
		this.add(btnImagem);
		this.add(lbTitulo);
		this.add(lbAutor);
		this.add(lbPreco);
		this.add(btnAddCarrinho);
		
		this.setForeground(Color.WHITE);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createEmptyBorder());
		
		
	}
	
	
	
	
}
