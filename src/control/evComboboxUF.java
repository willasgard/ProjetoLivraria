package control;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import entity.EnderecoEntity;
import entity.UfEntity;
import infraestructure.LocalidadeDAO;

public class evComboboxUF {
	private JComboBox<UfEntity> cbUf;
	
	
	
	public evComboboxUF(JComboBox<UfEntity> cbUf) {
	
		this.cbUf=cbUf;
	}
	
	public void listaUF(){
		
		try {
			LocalidadeDAO ufDao = new LocalidadeDAO();
			
			List<UfEntity> listaUf = ufDao.ConsultaUf();
			if(cbUf.getItemCount()>0){
			cbUf.removeAllItems();	
			}
			if(listaUf != null){
				for(UfEntity uf: listaUf){
					cbUf.addItem(uf);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}
