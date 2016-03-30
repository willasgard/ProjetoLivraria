package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import control.EvBtnMaisItemCarrinho;
import control.EvBtnMenosItemCarrinho;
import entity.AuxQtdadeEntity;
import entity.ItemCarrinhoEntity;
import entity.LivroEntity;

public class ItemCarrinhoBoundary extends JPanel{
	private static final long serialVersionUID = 1L;
	private ItemCarrinhoEntity itemEntity;
	private java.util.List<ItemCarrinhoEntity> itensList;
	private LivroEntity livro;
	private AuxQtdadeEntity quantidade;
	private double subTotal;
	JButton btnRemover = new JButton("remover");
	
	public ItemCarrinhoBoundary(ItemCarrinhoEntity itemEntity,
			java.util.List<ItemCarrinhoEntity> itensList) {
		super();
		this.itemEntity = itemEntity;
		this.itensList = itensList;
		this.livro = itemEntity.getLivro();
		this.quantidade = itemEntity.getQuantidade();
		this.subTotal = itemEntity.getSubTotal();
		this.create();	
	}

	
	public ItemCarrinhoEntity getItemEntity() {
		return itemEntity;
	}


	public void setItemEntity(ItemCarrinhoEntity itemEntity) {
		this.itemEntity = itemEntity;
	}


	public JButton getBtnRemover(){
		return btnRemover;
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
		JLabel labelQdade = new JLabel("" + this.quantidade.getQuantidade());
		labelQdade.setHorizontalAlignment(JLabel.CENTER);
		labelQdade.setVerticalAlignment(JLabel.CENTER);
		
		painelQtdade.add(labelQdade, BorderLayout.CENTER);
		painelQtdade.add(btnMenos, BorderLayout.WEST);
		painelQtdade.add(btnMais, BorderLayout.EAST);
		
		nomeLivro.setPreferredSize(new Dimension(10, 30));
		
		//
		Dimension d = new Dimension(50, 50);
		btnRemover.setPreferredSize(d);
		JPanel painelbtn = new JPanel();
		painelbtn.add(btnRemover);
		
		btnRemover.setForeground(Color.WHITE);
		btnRemover.setBackground(Color.red);
		btnRemover.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnRemover.setBorder(BorderFactory.createEmptyBorder());
		
		btnMais.setForeground(Color.WHITE);
		btnMais.setBackground(Color.LIGHT_GRAY);
		btnMais.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMais.setBorder(BorderFactory.createEmptyBorder());
		
		btnMenos.setForeground(Color.WHITE);
		btnMenos.setBackground(Color.LIGHT_GRAY);
		btnMenos.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnMenos.setBorder(BorderFactory.createEmptyBorder());
		
		this.setForeground(Color.WHITE);
		this.setBackground(Color.LIGHT_GRAY);
		this.setBorder(BorderFactory.createEmptyBorder());
		
		painelQtdade.setForeground(Color.WHITE);
		painelQtdade.setBackground(Color.LIGHT_GRAY);
		painelQtdade.setBorder(BorderFactory.createEmptyBorder());
		
		btnMais.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMenos.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		
		//		
		this.add(imagem);
		this.add(nomeLivro);
		this.add(preco);
		this.add(painelQtdade);
		this.add(lbSubTotal);
		this.add(painelbtn);
		
		
		
		this.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		EvBtnMaisItemCarrinho evBtnMais =
				new EvBtnMaisItemCarrinho(itemEntity, itensList, btnMais,
						labelQdade, lbSubTotal);
		btnMais.addActionListener(evBtnMais);
        
		EvBtnMenosItemCarrinho evBtnMenos =
				new EvBtnMenosItemCarrinho(itemEntity, itensList, btnMenos,
						labelQdade, lbSubTotal);
		btnMenos.addActionListener(evBtnMenos);
	}
	
	
}