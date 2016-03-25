package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import entity.LivroEntity;
import entity.AuxQtdadeEntity;

public class EvBtnMaisItemCarrinho implements ActionListener{
	private LivroEntity livro;
	private AuxQtdadeEntity quantidade;
	private double subTotal;
	private JButton btn;
	private JLabel labelQdade;
	private JLabel lbSubTotal;
	
	public EvBtnMaisItemCarrinho(LivroEntity livro, 
			AuxQtdadeEntity quantidade, double subTotal, JButton btn,
			JLabel labelQdade, JLabel lbSubTotal) {
		super();
		this.livro = livro;
		this.quantidade = quantidade;
		this.subTotal = subTotal;
		this.btn = btn;
		this.labelQdade = labelQdade;
		this.lbSubTotal = lbSubTotal;
	}
	
	public void acao(){
		quantidade.setQuantidade(quantidade.getQuantidade() + 1);;
		subTotal = quantidade.getQuantidade() * livro.getPreco();
		lbSubTotal.setText("" + subTotal);
		labelQdade.setText("" + quantidade.getQuantidade());
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.acao();
	}
	
	
}
