package entity;

public class ClienteEntity extends EnderecoEntity{
	private int CodCliente;
	private String nome;
	private int cpf;
	private int rg;
	private String sexo;
	private String email;
	private int telefone;
	private int celular;
	
	
	public int getCodCliente() {
		return CodCliente;
	}


	public void setCodCliente(int codCliente) {
		CodCliente = codCliente;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public int getCelular() {
		return celular;
	}


	public void setCelular(int celular) {
		this.celular = celular;
	}
	
}
