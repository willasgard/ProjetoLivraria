package control;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JComboBox;

import entity.CidadeEntity;
import infraestructure.LocalidadeDAO;

public class evComboboxCidade {
	private JComboBox<CidadeEntity> cbCidade;

	public evComboboxCidade(JComboBox<CidadeEntity> cbCidade) {
		
		this.cbCidade = cbCidade;
	}
	
	public void listaCidade(){
		try {
			LocalidadeDAO cidadeDao = new LocalidadeDAO();
			
			String ufSelecionado = cbCidade.getSelectedItem().toString();
			List<CidadeEntity> listCidade = cidadeDao.ConsultaCidade(ufSelecionado);
			
			if(cbCidade.getItemCount()>0){
				cbCidade.removeAllItems();
			}
			if(listCidade != null){
				for(CidadeEntity cidade : listCidade){
					cbCidade.addItem(cidade);
				}
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
