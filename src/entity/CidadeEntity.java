package entity;

public class CidadeEntity extends UfEntity{
	private int idCidade;
	private String cidade;
	public int getIdCidade() {
		return idCidade;
	}
	public void setIdCidade(int idCidade) {
		this.idCidade = idCidade;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public String toString() {
		return cidade;
	}
	
	
	

}
