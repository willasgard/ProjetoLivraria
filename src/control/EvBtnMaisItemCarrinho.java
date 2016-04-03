package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;

import entity.LivroEntity;
import entity.AuxQtdadeEntity;
import entity.ItemCarrinhoEntity;

public class EvBtnMaisItemCarrinho implements ActionListener{
	private ItemCarrinhoEntity itemEntity;
	java.util.List<ItemCarrinhoEntity> itensList;
	private JButton btn;
	private JLabel labelQdade;
	private JLabel lbSubTotal;
	

	
	public EvBtnMaisItemCarrinho(ItemCarrinhoEntity itemEntity, List<ItemCarrinhoEntity> itensList, JButton btn,
			JLabel labelQdade, JLabel lbSubTotal) {
		super();
		this.itemEntity = itemEntity;
		this.itensList = itensList;
		this.btn = btn;
		this.labelQdade = labelQdade;
		this.lbSubTotal = lbSubTotal;
	}

	public void acao(){
		this.itemEntity.getQuantidade().setQuantidade(
				this.itemEntity.getQuantidade().getQuantidade() + 1);
		this.itemEntity.setSubTotal(
				this.itemEntity.getQuantidade().getQuantidade() *
				this.itemEntity.getLivro().getPreco());
		lbSubTotal.setText("R$ " + this.itemEntity.getSubTotal());
		labelQdade.setText("" + this.itemEntity.getQuantidade().getQuantidade());
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.acao();
	}
	
	
}
