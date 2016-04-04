package entity;

import java.util.Date;

public class AutorEntity {
	
	private String nomeAutor;
	private Date dataNasc;
	private Date dataFalesc;
	private String localNascimento;
	private String localMorte;
	private String biografia;
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public Date getDataFalesc() {
		return dataFalesc;
	}
	public void setDataFalesc(Date dataFalesc) {
		this.dataFalesc = dataFalesc;
	}
	public String getLocalNascimento() {
		return localNascimento;
	}
	public void setLocalNascimento(String localNascimento) {
		this.localNascimento = localNascimento;
	}
	public String getLocalMorte() {
		return localMorte;
	}
	public void setLocalMorte(String localMorte) {
		this.localMorte = localMorte;
	}
	public String getBiografia() {
		return biografia;
	}
	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
	
	

}
