package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entity.ClienteEntity;
import infraestructure.CadastroClienteDAO;

public class ClienteController implements iClientesController{

	private ArrayList<ClienteEntity> clt = new ArrayList<>();
	
	
	@Override
	public void proximoId() {
		
		try {
			CadastroClienteDAO cltDao  = new CadastroClienteDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	@Override
	public void listaCliente() {
		try {
			CadastroClienteDAO cltDao  = new CadastroClienteDAO();
			List<ClienteEntity> listaCliente = cltDao.ConsultaCliente();
		} catch (SQLException e) {
		
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	

}
