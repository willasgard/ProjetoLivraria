package control;

import entity.LivroEntity;
import infraestructure.CadastroLivroDAO;

public class LivroControl {
	
	public LivroControl(){
		
	}
	
	public long adicionar (LivroEntity livro){
		CadastroLivroDAO dao = new CadastroLivroDAO();
		
		long cod = dao.insert(livro);
		
		return cod;
	}
	
	public void alterar (LivroEntity livro){
		
	}
	

}
