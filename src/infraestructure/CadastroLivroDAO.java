package infraestructure;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.LivroEntity;

public class CadastroLivroDAO {
	
	public long insert(LivroEntity livro) {
		long idGerado = 0;
		try {

			Connection con = JDBCUtil.getConnection();

			String query = "INSERT INTO `Livro` (`CodAutor`, `CodCategoria`, `CodEditora`, `DataPublicacao`, `Formato`, `ISNB`, `MargemLucro`, `NumeroPaginas`, `PrecoCusto`, `PrecoVenda`, `QtdeEmEstoque`, `Resumo`, `Sumario`, `Titulo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

			PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			stmt.setInt(1, livro.getNomeAutor());
			stmt.setInt(2, livro.getEditora());
			stmt.setInt(3, livro.getEditora());
			stmt.setDate(4, new Date(livro.getDataPublicacao().getTime()));
			stmt.setInt(5, livro.getFormato());
			stmt.setInt(6, livro.getIsbn());
			stmt.setDouble(7, livro.getMargemLucro());
			stmt.setInt(8, livro.getNumeroPaginas());
			stmt.setDouble(9, livro.getPrecoCusto());
			stmt.setDouble(10, livro.getPrecoVenda());
			stmt.setInt(11, livro.getQtdeEmEstoque());
			stmt.setString(12, livro.getResumo());
			stmt.setString(13, livro.getTituloLivro());

			stmt.executeUpdate();

			ResultSet r = stmt.getGeneratedKeys();
			r.next();
			idGerado = r.getLong(1);

			JDBCUtil.close(con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return idGerado;
	}
	
	
	
	public int update(LivroEntity livro) {
		int affectedRows = 0;
		try {

			Connection con = JDBCUtil.getConnection();

			String query = "UPDATE `Livro` SET `CodAutor`=?, `CodCategoria`=?,  `CodEditora`=?, `DataPublicacao`=?, `Formato`=?, `ISBN`=?, `MargemLucro`=?, `NumeroPaginas`=?, `PrecoCusto`=?, `PrecoVenda`=?, `QtdeEmEstoque`=?, `Resumo`=?, `Sumario`=?, `Titulo`=? WHERE  `CodLivro`=?;";

			
			PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			stmt.setInt(1, livro.getNomeAutor());
			stmt.setInt(2, livro.getEditora());
			stmt.setInt(3, livro.getEditora());
			stmt.setDate(4, new Date(livro.getDataPublicacao().getTime()));
			stmt.setInt(5, livro.getFormato());
			stmt.setInt(6, livro.getIsbn());
			stmt.setDouble(7, livro.getMargemLucro());
			stmt.setInt(8, livro.getNumeroPaginas());
			stmt.setDouble(9, livro.getPrecoCusto());
			stmt.setDouble(10, livro.getPrecoVenda());
			stmt.setInt(11, livro.getQtdeEmEstoque());
			stmt.setString(12, livro.getResumo());
			stmt.setString(13, livro.getTituloLivro());

			affectedRows = stmt.executeUpdate();

			JDBCUtil.close(con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return affectedRows;
	}
	
	
	public int delete(long id) {
		int affectedRows = 0;
		try {

			Connection con = JDBCUtil.getConnection();

			String query = "DELETE FROM Livro WHERE CodLivro = ?;";

			PreparedStatement stmt = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

			stmt.setLong(1, id);

			affectedRows = stmt.executeUpdate();

			JDBCUtil.close(con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return affectedRows;
	}
	
	
	public LivroEntity selectById(long codLivro) {
		LivroEntity livro = new LivroEntity();
		try {
			Connection con = JDBCUtil.getConnection();

			String query = "SELECT * FROM Livro WHERE CodLivro = ?;";
			PreparedStatement stmt = con.prepareStatement(query);

			stmt.setLong(1, codLivro);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				stmt.setInt(1, livro.getNomeAutor());
				stmt.setInt(2, livro.getEditora());
				stmt.setInt(3, livro.getEditora());
				stmt.setDate(4, new Date(livro.getDataPublicacao().getTime()));
				stmt.setInt(5, livro.getFormato());
				stmt.setInt(6, livro.getIsbn());
				stmt.setDouble(7, livro.getMargemLucro());
				stmt.setInt(8, livro.getNumeroPaginas());
				stmt.setDouble(9, livro.getPrecoCusto());
				stmt.setDouble(10, livro.getPrecoVenda());
				stmt.setInt(11, livro.getQtdeEmEstoque());
				stmt.setString(12, livro.getResumo());
				stmt.setString(13, livro.getTituloLivro());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return livro;
	}
	
	
	
	public List<LivroEntity> selectByName(String name) {
		List<LivroEntity> books = new ArrayList<LivroEntity>();
		try {
			Connection con = JDBCUtil.getConnection();

			String query = "SELECT * FROM Livro WHERE Titulo LIKE ?;";
			PreparedStatement stmt = con.prepareStatement(query);

			stmt.setString(1, "%" + name + "%");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				LivroEntity livro = new LivroEntity();
				
				stmt.setInt(1, livro.getNomeAutor());
				stmt.setInt(2, livro.getEditora());
				stmt.setInt(3, livro.getEditora());
				stmt.setDate(4, new Date(livro.getDataPublicacao().getTime()));
				stmt.setInt(5, livro.getFormato());
				stmt.setInt(6, livro.getIsbn());
				stmt.setDouble(7, livro.getMargemLucro());
				stmt.setInt(8, livro.getNumeroPaginas());
				stmt.setDouble(9, livro.getPrecoCusto());
				stmt.setDouble(10, livro.getPrecoVenda());
				stmt.setInt(11, livro.getQtdeEmEstoque());
				stmt.setString(12, livro.getResumo());
				stmt.setString(13, livro.getTituloLivro());
				
				books.add(livro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return books;
	}
	
	
	
	public List<LivroEntity> selectByAutor(String name) {
		List<LivroEntity> books = new ArrayList<LivroEntity>();
		try {
			Connection con = JDBCUtil.getConnection();

			String query = "SELECT * FROM Livro WHERE CodAutor LIKE ?;";
			PreparedStatement stmt = con.prepareStatement(query);

			stmt.setString(1, "%" + name + "%");

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				LivroEntity livro = new LivroEntity();
				
				stmt.setInt(1, livro.getNomeAutor());
				stmt.setInt(2, livro.getEditora());
				stmt.setInt(3, livro.getEditora());
				stmt.setDate(4, new Date(livro.getDataPublicacao().getTime()));
				stmt.setInt(5, livro.getFormato());
				stmt.setInt(6, livro.getIsbn());
				stmt.setDouble(7, livro.getMargemLucro());
				stmt.setInt(8, livro.getNumeroPaginas());
				stmt.setDouble(9, livro.getPrecoCusto());
				stmt.setDouble(10, livro.getPrecoVenda());
				stmt.setInt(11, livro.getQtdeEmEstoque());
				stmt.setString(12, livro.getResumo());
				stmt.setString(13, livro.getTituloLivro());
				
				books.add(livro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return books;
	}
	
	
	
	public List<LivroEntity> selectAll() {
		List<LivroEntity> books = new ArrayList<LivroEntity>();
		try {
			Connection con = JDBCUtil.getConnection();

			String query = "SELECT * FROM Livro;";
			PreparedStatement stmt = con.prepareStatement(query);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				
				LivroEntity livro = new LivroEntity();
				
				stmt.setInt(1, livro.getNomeAutor());
				stmt.setInt(2, livro.getEditora());
				stmt.setInt(3, livro.getEditora());
				stmt.setDate(4, new Date(livro.getDataPublicacao().getTime()));
				stmt.setInt(5, livro.getFormato());
				stmt.setInt(6, livro.getIsbn());
				stmt.setDouble(7, livro.getMargemLucro());
				stmt.setInt(8, livro.getNumeroPaginas());
				stmt.setDouble(9, livro.getPrecoCusto());
				stmt.setDouble(10, livro.getPrecoVenda());
				stmt.setInt(11, livro.getQtdeEmEstoque());
				stmt.setString(12, livro.getResumo());
				stmt.setString(13, livro.getTituloLivro());

				books.add(livro);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return books;
	}
	
	


}
