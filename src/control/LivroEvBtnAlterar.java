package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.JapaneseDate;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import entity.LivroEntity;
import boundary.LivroBoundary;
import infraestructure.CadastroLivroDAO;

public class LivroEvBtnAlterar implements ActionListener {
	
	//estou em dúvida com esta parte quanto aos tipos   ##############falta o ISBN
	private LivroBoundary TelaLivro;
	private JTextField txtTituloLivro;
	private JComboBox comboAutor;
	private JComboBox comboCategoriaLivro;
	private JComboBox comboEditora;
	private JDateChooser dataPublicacao;
	private JComboBox comboFormato;
	private JTextArea txtnumPaginas;	
	private JTextArea txtSumario;
	private JTextArea txtResumo;
	private JTextArea txtPrecoCusto;
	private JTextArea txtPrecoVenda;
	private JTextArea txtMargemLucro;
	private JTextArea txtQtdeEmEstoque;
	
	
	public LivroEvBtnAlterar (LivroBoundary telaLivro, JTextField txtTituloLivro, JComboBox comboAutor, JComboBox comboCategoriaLivro,  
			JComboBox comboEditora, JDateChooser dataPublicacao, JComboBox comboFormato, JTextArea txtnumPaginas, JTextArea txtSumario,
			JTextArea txtResumo, JTextArea txtPrecoCusto, JTextArea txtPrecoVenda, JTextArea txtMargemLucro, JTextArea txtQtdeEmEstoque){
		
		super();
		
		this.TelaLivro = telaLivro;
		this.txtTituloLivro = txtTituloLivro;
		this.comboAutor = comboAutor;
		this.comboCategoriaLivro = comboCategoriaLivro;
		this.comboEditora = comboEditora;
		this.dataPublicacao = dataPublicacao;
		this.comboFormato = comboFormato;
		this.txtnumPaginas = txtnumPaginas;
		this.txtSumario = txtSumario;
		this.txtResumo = txtResumo;
		this.txtPrecoCusto = txtPrecoCusto;
		this.txtPrecoVenda = txtPrecoVenda;
		this.txtMargemLucro = txtMargemLucro;
		this.txtQtdeEmEstoque = txtQtdeEmEstoque;
	}
	
	public void acao (){
		LivroEntity livro = this.TelaLivro.getLivroEntity();
		CadastroLivroDAO livroDao = new CadastroLivroDAO();
		
		livro.setTituloLivro(txtTituloLivro.getText());
		livro.setNomeAutor(comboAutor.getSelectedItem().toString());
		livro.setCategoriaLivro(comboCategoriaLivro.getSelectedItem().toString());
		livro.setEditora(comboEditora.getSelectedItem().toString());
		livro.setDataPublicacao(dataPublicacao.getDate());
		livro.setFormato(comboFormato.getSelectedItem().toString());
		livro.setNumeroPaginas(txtnumPaginas.getRows());
		livro.setSumario(txtSumario.getText());
		livro.setResumo(txtResumo.getText());
		livro.setPrecoCusto(txtPrecoCusto.getText());
		livro.setPrecoVenda(txtPrecoVenda.getText());
		livro.setMargemLucro(txtMargemLucro.getText());
		livro.setQtdeEmEstoque(txtQtdeEmEstoque.getText());
		
		try {
			if (livroDao.update(livro) > 0){
				JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso!");
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro.");
			} 
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void actionPerformed (ActionEvent arg0){
		if (TelaLivro.validaCampos())
			acao();
	}


}
