package entity;

public class EnderecoEntity {
	
	private String endereco;
	private String bairro;
	private int cep;
	private String uf;
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public String toString() {
		return "EnderecoEntity [endereco=" + endereco + ", bairro=" + bairro + ", cep=" + cep + ", uf=" + uf + "]";
	}
	
	
	
	
	

}
