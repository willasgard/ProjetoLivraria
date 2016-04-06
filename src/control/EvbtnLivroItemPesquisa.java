package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import entity.LivroEntity;

public class EvbtnLivroItemPesquisa implements ActionListener{
	LivroEntity livro = new LivroEntity();
	
	
	public EvbtnLivroItemPesquisa(LivroEntity livro) {
		super();
		this.livro = livro;
	}

    public void acao(){
    	JOptionPane.showMessageDialog(null, livro.toString(),null ,JOptionPane.INFORMATION_MESSAGE);
    }
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.acao();
	}

}
