package entity;

public class CadastroClienteEntity {
	
	private String nome;
	
	private int cpf;
	private int rg;
	private String sexo;
	private String email;
	private int telefone;
	private int celular;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
}
