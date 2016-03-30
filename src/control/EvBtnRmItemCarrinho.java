package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import boundary.ItemCarrinhoBoundary;
import entity.ItemCarrinhoEntity;

public class EvBtnRmItemCarrinho implements ActionListener{
    private JFrame tela;
	private ItemCarrinhoBoundary item;
	private JPanel painel;
	private java.util.List<ItemCarrinhoEntity> itensList =
			new ArrayList<ItemCarrinhoEntity>();
	private ItemCarrinhoEntity itemEntity;
	
	public EvBtnRmItemCarrinho(JFrame tela,
			ItemCarrinhoBoundary item, JPanel painel,
			List<ItemCarrinhoEntity> itensList,
			ItemCarrinhoEntity itemEntity) {
		super();
		this.tela = tela;
		this.item = item;
		this.painel = painel;
		this.itensList = itensList;
		this.itemEntity = itemEntity;
	}

	public void acao(){
		painel.remove(item);
		itensList.remove(itemEntity);
		tela.setVisible(false);
		tela.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.acao();
	}
	
	
}
