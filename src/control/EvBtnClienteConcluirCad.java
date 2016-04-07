package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entity.ClienteEntity;
import infraestructure.CadastroClienteDAO;

public class EvBtnClienteConcluirCad implements ActionListener {
		

	//JLabel lblNome, lblCPF, lblRg, lblCep, lblLogradouro, lblNumero, lblComplemento, lblBairro, lblUf, lblCidade, lblEmail, lblTelefone, lblCelular;
	
	
	
	JTextField nome;
	JTextField cpf;
	JTextField rg;
	JTextField cep;
	JTextField logradouro;
	JTextField numero;
	JTextField complemento;
	JTextField bairro;
	JComboBox cbUf;
	JTextField cidade;
	JTextField email;
	JTextField telefone;
	JTextField celular;
	
	JButton btnCadastrar;
	
	




	public EvBtnClienteConcluirCad(JTextField nome, JTextField cpf, JTextField rg, JTextField cep,
			JTextField logradouro, JTextField numero, JTextField complemento, JTextField bairro, JComboBox cbUf,
			JTextField cidade, JTextField email, JTextField telefone, JTextField celular, JButton btnCadastrar) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cbUf = cbUf;
		this.cidade = cidade;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.btnCadastrar = btnCadastrar;
	}


	public void limpaCampos(){
		nome.setText("");
		cpf.setText("");
		rg.setText("");
		cep.setText("");
		logradouro.setText("");
		numero.setText("");
		complemento.setText("");
		bairro.setText("");
		cidade.setText("");
		email.setText("");
		telefone.setText("");
		celular.setText("");
		
	
		
	}
	

@Override
	public void actionPerformed(ActionEvent e) {
		ClienteEntity clt = new ClienteEntity();
		clt.setNome(nome.getText());
		
		clt.setCpf(cpf.getText());
		
		clt.setRg(rg.getText());
		clt.setCep(Integer.parseInt(cep.getText()));
		clt.setLogradouro(logradouro.getText());
		clt.setNumero(Integer.parseInt(numero.getText()));
		clt.setComplemento(complemento.getText());
		clt.setBairro(bairro.getText());
		clt.setUf("SP");
		clt.setCidade(cidade.getText());
		clt.setEmail(email.getText());
		clt.setTelefone(telefone.getText());
		clt.setCelular(celular.getText());
		System.out.println(clt.toString());
		
	
	
			try {
				CadastroClienteDAO cltDao = new CadastroClienteDAO();
		cltDao.insereCliente(clt);
		JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		limpaCampos();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		JOptionPane.showMessageDialog(null,e1.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
	}
	
	
	
	

	System.out.println("Passei aqui");
	}





}
