package entity;

public class UfEntity {

private int idUf;
private String uf;
public int getIdUf() {
	return idUf;
}
public void setIdUf(int idUf) {
	this.idUf = idUf;
}
public String getUf() {
	return uf;
}
public void setUf(String uf) {
	this.uf = uf;
}
@Override
public String toString() {
	return this.uf;
}



}
