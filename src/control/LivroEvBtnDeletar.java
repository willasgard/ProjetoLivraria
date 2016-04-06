package control;

import infraestructure.CadastroLivroDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import entity.LivroEntity;
import boundary.LivroBoundary;

public class LivroEvBtnDeletar implements ActionListener {
	
	private LivroBoundary TelaLivro;
	
	
	public LivroEvBtnDeletar (LivroBoundary telaLivro){
		super();
		this.TelaLivro = telaLivro;
	}
	
	public void acao(){
		LivroEntity livroEntity = TelaLivro.getLivroEntity();
		CadastroLivroDAO livroDAO = new CadastroLivroDAO();
		
		int resp = JOptionPane.showConfirmDialog(null, "Tem ceerteza que deseja excluir?");
			
		if (resp == JOptionPane.OK_OPTION){
			try {
				if(livroDAO.delete(livroEntity.getIsbn()) > 0){
					JOptionPane.showMessageDialog(null, "Livro apagado com sucesso!");
					TelaLivro.telaDefault();
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possíve apagar o livro.");	}
				} catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		acao();
	}
	
}
