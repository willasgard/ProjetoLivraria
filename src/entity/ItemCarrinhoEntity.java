package entity;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import control.EvBtnMaisItemCarrinho;
import control.EvBtnMenosItemCarrinho;

public class ItemCarrinhoEntity extends JPanel{
	private static final long serialVersionUID = 1L;
	private LivroEntity livro;
	private AuxQtdadeEntity quantidade;
	private double subTotal;
	
	public ItemCarrinhoEntity(LivroEntity livro, AuxQtdadeEntity quantidade) {
		super();
		this.livro = livro;
		this.quantidade = quantidade;
		this.subTotal = livro.getPreco() * this.quantidade.getQuantidade();
		this.create();	
	}
	
	public LivroEntity getLivro() {
		return livro;
	}

	public void setLivro(LivroEntity livro) {
		this.livro = livro;
	}

	public int getQuantidade() {
		return quantidade.getQuantidade();
	}

	public void setQuantidade(int quantidade) {
		this.quantidade.setQuantidade(quantidade);
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	public void create(){
		GridLayout gridLayout = new GridLayout(1, 6, 5, 5);
		this.setLayout(gridLayout);
		JLabel imagem = new JLabel("");
		JLabel nomeLivro = new JLabel(livro.getNome());
		JLabel preco = new JLabel("" + livro.getPreco());
		JLabel lbSubTotal = new JLabel("" + this.subTotal);
		JPanel painelQtdade = new JPanel();
		nomeLivro.setToolTipText(nomeLivro.getText());
		
		imagem.setHorizontalAlignment(JLabel.CENTER);
		nomeLivro.setHorizontalAlignment(JLabel.CENTER);
		preco.setHorizontalAlignment(JLabel.CENTER);
		lbSubTotal.setHorizontalAlignment(JLabel.CENTER);
		imagem.setVerticalAlignment(JLabel.CENTER);
		nomeLivro.setVerticalAlignment(JLabel.CENTER);
		preco.setVerticalAlignment(JLabel.CENTER);
		lbSubTotal.setVerticalAlignment(JLabel.CENTER);
		
		painelQtdade.setLayout(new BorderLayout());
		JButton btnMais = new JButton("+");
		JButton btnMenos = new JButton("-");
		JButton btnRemover = new JButton("remover");
		JLabel labelQdade = new JLabel("" + this.quantidade.getQuantidade());
		labelQdade.setHorizontalAlignment(JLabel.CENTER);
		labelQdade.setVerticalAlignment(JLabel.CENTER);
		
		painelQtdade.add(labelQdade, BorderLayout.CENTER);
		painelQtdade.add(btnMenos, BorderLayout.WEST);
		painelQtdade.add(btnMais, BorderLayout.EAST);
//
//		
		this.add(imagem);
		this.add(nomeLivro);
		this.add(preco);
		this.add(painelQtdade);
		this.add(lbSubTotal);
		this.add(btnRemover);
		Dimension size = new Dimension(800, 100);
		this.setPreferredSize(size);
		this.setSize(size);
		
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		EvBtnMaisItemCarrinho evBtnMais =
				new EvBtnMaisItemCarrinho(this.livro, this.quantidade, this.subTotal,
						btnMais, labelQdade, lbSubTotal);
		btnMais.addActionListener(evBtnMais);
        
		EvBtnMenosItemCarrinho evBtnMenos =
				new EvBtnMenosItemCarrinho(this.livro, this.quantidade,
						subTotal, btnMenos, labelQdade, lbSubTotal);
		btnMenos.addActionListener(evBtnMenos);
	}
	public ItemCarrinhoEntity getInstance(){
		return this;
	}
	
}