package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import javax.swing.JTextField;

import entity.ClienteEntity;
import infraestructure.CadastroClienteDAO;

public class ClienteController implements iClientesController{
private JTextField CodCliente;

		public ClienteController(JTextField codClt){
			this.CodCliente=codClt;
		
	}
	
	
	private ArrayList<ClienteEntity> clt = new ArrayList<>();
	
	
	@Override
	public void proximoId() {
		
		try {
			CadastroClienteDAO cltDao  = new CadastroClienteDAO();
			CodCliente.setText(String.valueOf(cltDao.proximoId()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

	@Override
	public void listaCliente() {
		String r = null;
		try {
			CadastroClienteDAO cltDao  = new CadastroClienteDAO();
			
			List<ClienteEntity> listaCliente = cltDao.ConsultaCliente();
			if(listaCliente != null){
				for (ClienteEntity clt : listaCliente){
					
					
					r = r +" " + clt;
					System.out.println(r);
				}
			}
			
		} catch (SQLException e) {
		
			JOptionPane.showMessageDialog(null,e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	

}
