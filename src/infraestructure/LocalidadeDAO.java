package infraestructure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.CidadeEntity;
import entity.EnderecoEntity;
import entity.UfEntity;

public class LocalidadeDAO {
	
	
	Connection con;
	
	public LocalidadeDAO()throws SQLException{
		
		con =JDBCUtil.getConnection();
		
		
		
	}

	public List<UfEntity> ConsultaUf() throws SQLException{
		
		
		
		

		List<UfEntity> listaUF = new ArrayList<UfEntity>();
		
		
		
		
			String sql = "SELECT id, uf from estado ORDER BY id";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				EnderecoEntity uf = new EnderecoEntity();
				uf.setIdUf(rs.getInt("id"));
				uf.setUf(rs.getString("uf"));
				listaUF.add(uf);
				
			}
			rs.close();
			ps.close();
		
		return listaUF;
			
		
	}
	
	public List<CidadeEntity> ConsultaCidade(String ufSelecionado) throws SQLException{
		
		
		
		
		
		List<CidadeEntity> listaCidade = new ArrayList<CidadeEntity>();
		
		
		
		
		String sql = "SELECT id, nome, estado from cidade where estado "+ufSelecionado;
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			CidadeEntity cidade = new CidadeEntity();
			cidade.setIdCidade(rs.getInt("id"));
			cidade.setCidade(rs.getString("nome"));
			cidade.setIdUf(rs.getInt("estado"));
			listaCidade.add(cidade);
			
		}
		rs.close();
		ps.close();
		
		return listaCidade;
		
		
	}
	
	
	
}
