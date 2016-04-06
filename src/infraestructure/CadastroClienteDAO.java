package infraestructure;

import java.sql.SQLException;
import java.util.List;

import java.sql.*;

import entity.CadastroClienteEntity;


public class CadastroClienteDAO {
	Connection con;
	
	public CadastroClienteDAO()throws SQLException{
				con = JDBCUtil.getConnection(); 
		
	}
	public void insereCliente (CadastroClienteEntity cliente )throws SQLException{
		
		
	}
	
public void AtualizaCliente (CadastroClienteEntity cliente)throws SQLException{
	
}

public CadastroClienteEntity ConsultaCliente (CadastroClienteEntity cliente)throws SQLException{
	
	
	
	
	return cliente;
	
	
}


public List<CadastroClienteEntity> ConsultaCliente()throws SQLException {
	
	
	return null;
	
}



}
