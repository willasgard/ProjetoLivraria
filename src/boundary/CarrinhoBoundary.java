package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import control.EvBtnRmItemCarrinho;
import control.testeEv;
import entity.LivroEntity;
import entity.AuxQtdadeEntity;
import entity.ItemCarrinhoEntity;

public class CarrinhoBoundary {
	private JFrame tela = new JFrame("carrinho de compras");
	private JPanel painelPrincipal = new JPanel();
	private JPanel painelProdutos = new JPanel();
	private GridLayout gridLayout = new GridLayout(1, 1, 10, 10);
	JScrollPane bar = new JScrollPane();
	private java.util.List<ItemCarrinhoEntity> itensList =
			new ArrayList<ItemCarrinhoEntity>();
	
	public CarrinhoBoundary(){
		painelPrincipal.setLayout(new BorderLayout());
		painelProdutos.setLayout(gridLayout);
		painelPrincipal.add(painelProdutos, BorderLayout.CENTER);		
		//
		tela.setContentPane(painelPrincipal);
		tela.setSize(1000, 600);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
		//
		JLabel carrinho = new JLabel("");
		carrinho.setIcon(new ImageIcon(CarrinhoBoundary.class.getResource("/resourse/carrinho.png")));
		painelPrincipal.add(carrinho, BorderLayout.NORTH);
		//
		JButton btnPedido = new JButton("gerar pedido");
		JPanel painelBotao = new JPanel();
		painelBotao.setLayout(new FlowLayout(FlowLayout.RIGHT));
		painelBotao.add(btnPedido);
		painelPrincipal.add(painelBotao, BorderLayout.SOUTH);
		
		testeEv evteste = new testeEv(itensList, btnPedido);
		btnPedido.addActionListener(evteste);
		
		JLabel lb1 = new JLabel("");
		JLabel lb2 = new JLabel("Item");
		JLabel lb3 = new JLabel("Preço");
		JLabel lb4 = new JLabel("Quantidade");
		JLabel lb5 = new JLabel("Subtotal");
		JLabel lb6 = new JLabel("");
		lb1.setHorizontalAlignment(JLabel.CENTER);
		lb2.setHorizontalAlignment(JLabel.CENTER);
		lb3.setHorizontalAlignment(JLabel.CENTER);
		lb4.setHorizontalAlignment(JLabel.CENTER);
		lb5.setHorizontalAlignment(JLabel.CENTER);
		lb1.setVerticalAlignment(JLabel.CENTER);
		lb2.setVerticalAlignment(JLabel.CENTER);
		lb3.setVerticalAlignment(JLabel.CENTER);
		lb4.setVerticalAlignment(JLabel.CENTER);
		lb5.setVerticalAlignment(JLabel.CENTER);
		lb1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lb5.setFont(new Font("Tahoma", Font.BOLD, 18));
		JPanel painelIndice = new JPanel();
		painelIndice.setLayout(new GridLayout(1, 6, 10, 10));
		painelIndice.add(lb1);
		painelIndice.add(lb2);
		painelIndice.add(lb3);
		painelIndice.add(lb4);
		painelIndice.add(lb5);
		painelIndice.add(lb6);
		painelProdutos.add(painelIndice);
		
		btnPedido.setForeground(Color.WHITE);
		btnPedido.setBackground(Color.GREEN);
		btnPedido.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnPedido.setBorder(BorderFactory.createEmptyBorder());
		btnPedido.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		painelPrincipal.add(bar, BorderLayout.CENTER);
		bar.setViewportView(painelProdutos);
	
	}
	
	public void adicionaItem(ItemCarrinhoEntity itemEntity){
		gridLayout.setRows(gridLayout.getRows() + 1);
		ItemCarrinhoBoundary item =
				new ItemCarrinhoBoundary(itemEntity, this.itensList);
		itensList.add(itemEntity);
		painelProdutos.add(item);
		
		EvBtnRmItemCarrinho evBtnRM =
				new EvBtnRmItemCarrinho(tela, item, painelProdutos, 
						itensList, itemEntity);
		JButton btnTemp = item.getBtnRemover();
		btnTemp.addActionListener(evBtnRM);
	
		bar.repaint();
		tela.setVisible(false);
		tela.setVisible(true);
		
	}
	
	
}
