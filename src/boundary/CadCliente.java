package boundary;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class CadCliente {
	
	
	public CadCliente() {
		// TODO Auto-generated constructor stub
	JFrame janela = new JFrame("Cadastro de Cliente");
	JPanel painel = new JPanel(new BorderLayout());
	
	painel.add(Norte(), BorderLayout.NORTH);
	painel.add(Centro(),BorderLayout.CENTER);
	painel.add(Sul(),BorderLayout.SOUTH);
	
	janela.setContentPane(painel);
	janela.setVisible(true);
	janela.setSize(800, 400);
	janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
	public JComponent Norte (){
		JPanel panelNorte = new JPanel(new BorderLayout());
		JLabel txtTitulo = new JLabel("Identificação - Faça seu cadastro");
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		JLabel txtLogin = new JLabel("Já tem cadastro? Faça o login");
		
		panelNorte.add(txtLogin,BorderLayout.EAST);
		panelNorte.add(txtTitulo,BorderLayout.CENTER);
		
		
		return panelNorte;
		
	}
	public JComponent Centro(){
		JPanel panelCentro = new JPanel(new GridLayout(8,2));
		
		JLabel txtNome = new JLabel("*Nome Completo: ");
		panelCentro.add(txtNome);
		JTextField nome = new JTextField(30);
		panelCentro.add(nome);
		
		JLabel txtCPF = new JLabel("*CPF: ");
		panelCentro.add(txtCPF);
		JTextField cpf = new JTextField(10);
		panelCentro.add(cpf);
		
		JLabel txtRG = new JLabel("*RG: ");
		panelCentro.add(txtRG);
		JTextField RG = new JTextField(10);
		panelCentro.add(RG);
		
		JLabel lblEndereco = new JLabel("Endereço: ");
		panelCentro.add(lblEndereco);
		JTextField Endereco = new JTextField(30);
		panelCentro.add(Endereco);
		
		
		JLabel lblSexo = new JLabel("Sexo");
		panelCentro.add(lblSexo);
		JComboBox cbSexo = new JComboBox();
		Vector Sexo = new Vector();
		Sexo.add("Masculino");
		Sexo.add("Feminino");
		Sexo.add("Não informado");
		for (int i=0;i<Sexo.size();i++){
			cbSexo.addItem(Sexo.get(i));
		}
		panelCentro.add(cbSexo);
		
		JLabel lblEmail = new JLabel("Email: ");
		panelCentro.add(lblEmail);
		JTextField Email = new JTextField(30);
		panelCentro.add(Email);
		
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		panelCentro.add(lblTelefone);
		JTextField Telefone = new JTextField(10);
		panelCentro.add(Telefone);
		
		JLabel lblCelular = new JLabel("Celular: ");
		panelCentro.add(lblCelular);
		JTextField Celular = new JTextField(10);
		panelCentro.add(Celular);
		
		

		
			
			
		
		
		
		
		
	
		
		
		
		
		return panelCentro;
	}
	
	
	public JComponent Sul (){
		JPanel PanelSul = new JPanel();
		PanelSul.setLayout(new FlowLayout());
		
		JButton btnDesistirCadastro = new JButton("Desistir do Cadastro");
		PanelSul.add(btnDesistirCadastro, BorderLayout.CENTER);
		
		JButton btnCadastrar = new JButton("Efetuar Cadastro");
		PanelSul.add(btnCadastrar, BorderLayout.EAST);
		
		
		
		
		
		
		
		return PanelSul;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new CadCliente();
	}
	

}
