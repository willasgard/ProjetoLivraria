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
import javax.swing.border.LineBorder;

import control.EvbtnLivroItemPesquisa;
import entity.LivroEntity;

public class ItemPesquisaBoundary extends JPanel{

	private static final long serialVersionUID = 1L;
	private LivroEntity livro;
	
	public ItemPesquisaBoundary(LivroEntity livro) {
		super();
		this.livro = livro;
		this.criarTela();
	}

	private void criarTela(){
		GridLayout gridlayout = new GridLayout(1, 5, 5, 5);
		JLabel lbAutor = new JLabel(livro.getNomeAutor());
		JLabel lbTitulo = new  JLabel(livro.getTituloLivro());
		JLabel lbPreco = new JLabel("R$ " + livro.getPrecoVenda());
		JButton btnImagem = new JButton("");
		JButton btnAddCarrinho = new JButton("");
		
		btnImagem.setIcon(livro.getImagem());
		btnImagem.setForeground(Color.RED);
		btnImagem.setBackground(Color.WHITE);
		btnImagem.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnImagem.setBorder(BorderFactory.createEmptyBorder());
		btnImagem.setToolTipText("Clique na imagem para visualizar mais detalhes sobre o livro");
		EvbtnLivroItemPesquisa evinfo = 
				new EvbtnLivroItemPesquisa(livro);
		btnImagem.addActionListener(evinfo);
		
		btnAddCarrinho.setIcon(new ImageIcon(ItemCarrinhoBoundary.class.getResource("/resource/adicionarCarrinho.png")));
		btnAddCarrinho.setForeground(Color.RED);
		btnAddCarrinho.setBackground(Color.WHITE);
		btnAddCarrinho.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAddCarrinho.setBorder(BorderFactory.createEmptyBorder());
		btnAddCarrinho.setToolTipText("Adicionar item ao carrinho de compras");
		
		
		lbAutor.setHorizontalAlignment(JLabel.CENTER);
		lbAutor.setVerticalAlignment(JLabel.CENTER);
		lbAutor.setForeground(Color.BLUE);
		lbAutor.setBackground(Color.WHITE);
		lbAutor.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lbTitulo.setHorizontalAlignment(JLabel.CENTER);
		lbTitulo.setVerticalAlignment(JLabel.CENTER);
		lbTitulo.setForeground(Color.BLUE);
		lbTitulo.setBackground(Color.WHITE);
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		lbPreco.setHorizontalAlignment(JLabel.CENTER);
		lbPreco.setVerticalAlignment(JLabel.CENTER);
		lbPreco.setForeground(Color.BLUE);
		lbPreco.setBackground(Color.WHITE);
		lbPreco.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		this.setLayout(gridlayout);
		this.add(btnImagem);
		this.add(lbTitulo);
		this.add(lbAutor);
		this.add(lbPreco);
		this.add(btnAddCarrinho);
		
		this.setForeground(Color.WHITE);
		this.setBackground(Color.WHITE);
		this.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		
	}
	
	
	
	
}
