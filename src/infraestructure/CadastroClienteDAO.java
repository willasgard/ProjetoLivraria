package infraestructure;

import java.sql.SQLException;
import java.util.List;

import java.sql.*;

import entity.ClienteEntity;


public class CadastroClienteDAO {
	Connection con;
	
	public CadastroClienteDAO()throws SQLException{
				con = JDBCUtil.getConnection(); 
		
	}
	public void insereCliente (ClienteEntity clt )throws SQLException{
		String sql = "INSERT INTO `Cliente` (`Nome`, `CPF`, `RG`, `Sexo`, `Logradouro`"
				+ ", `Numero`, `Complemento`, `Bairro`, `Cidade`, `UF`, `CEP`, `Email`, `Telefone`, `Celular`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, clt.getNome());
		ps.setInt(2,clt.getCpf() );
		ps.setInt(3, clt.getRg());
		ps.setString(4,clt.getSexo());
		ps.setString(5, clt.getLogradouro());
		ps.setInt(6,clt.getNumero());
		ps.setString(7, clt.getComplemento());
		ps.setString(8, clt.getBairro());
		ps.setString(9,clt.getCidade());
		ps.setString(10, clt.getUf());
		ps.setInt(11, clt.getCep());
		ps.setString(12,clt.getEmail());
		ps.setInt(13,clt.getTelefone());
		ps.setInt(14, clt.getCelular());
		ps.execute();
		ps.close();
		
		
		
	}
	
public void AtualizaCliente (ClienteEntity clt)throws SQLException{
	String sql = "UPDATE  `Cliente` set Nome = ?, CPF = ?, RG = ?, Sexo = ?, Logradouro = ?, Numero = ?, Numero = ?, "
			+ "Complemento = ?, Bairro = ?, Cidade = ?, UF = ?, CEP = ?, Email = ?, Telefone = ?, Celular = ?)";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, clt.getNome());
	ps.setInt(2,clt.getCpf() );
	ps.setInt(3, clt.getRg());
	ps.setString(4,clt.getSexo());
	ps.setString(5, clt.getLogradouro());
	ps.setInt(6,clt.getNumero());
	ps.setString(7, clt.getComplemento());
	ps.setString(8, clt.getBairro());
	ps.setString(9,clt.getCidade());
	ps.setString(10, clt.getUf());
	ps.setInt(11, clt.getCep());
	ps.setString(12,clt.getEmail());
	ps.setInt(13,clt.getTelefone());
	ps.setInt(14, clt.getCelular());
	ps.execute();
	ps.close();
	
	
	
}

public ClienteEntity ConsultaCliente (ClienteEntity cliente)throws SQLException{
	
	
	
	
	return cliente;
	
	
}


public List<ClienteEntity> ConsultaCliente()throws SQLException {
	
	
	return null;
	
}



}
