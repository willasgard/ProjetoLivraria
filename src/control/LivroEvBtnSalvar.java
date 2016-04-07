package control;

import infraestructure.CadastroLivroDAO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entity.LivroEntity;
import boundary.LivroBoundary;

public class LivroEvBtnSalvar implements ActionListener {
	
	private LivroBoundary TelaLivro;
	private JTextField txtTituloLivro;
	private JTextField txtISBN;
	private JTextField txtNomeAutor;
	private JTextField txtDataPublicacao;
	private JTextField txtEditora;
	private JTextField txtCategoria;
	private JTextField txtFormato;
	private JTextField txtnumPaginas;	
	private JTextField txtSumario;
	private JTextField txtResumo;
	private JTextField txtPrecoCusto;
	private JTextField txtPrecoVenda;
	private JTextField txtMargemLucro;
	private JTextField txtQtdeEmEstoque;
	
	public LivroEvBtnSalvar (LivroBoundary telaLivro, JTextField txtTituloLivro, JTextField txtISBN, JTextField txtNomeAutor,
			  JTextField txtDataPublicacao, JTextField txtEditora, JTextField txtCategoria,
			  JTextField txtFormato, JTextField txtnumPaginas, JTextField txtSumario,
			  JTextField txtResumo,	JTextField txtPrecoCusto, JTextField txtPrecoVenda,
			  JTextField txtMargemLucro, JTextField txtQtdeEmEstoque){
		
		super();
		this.TelaLivro = telaLivro;
		this.txtTituloLivro = txtTituloLivro;
		this.txtISBN = txtISBN;
		this.txtNomeAutor = txtNomeAutor;
		this.txtDataPublicacao = txtDataPublicacao;
		this.txtEditora = txtEditora;
		this.txtCategoria = txtCategoria;
		this.txtFormato = txtFormato;
		this.txtnumPaginas = txtnumPaginas;
		this.txtSumario = txtSumario;
		this.txtResumo = txtResumo;
		this.txtPrecoCusto = txtPrecoCusto;
		this.txtPrecoVenda = txtPrecoVenda;
		this.txtMargemLucro = txtMargemLucro;
		this.txtQtdeEmEstoque = txtQtdeEmEstoque;		
	}
	
	public LivroEvBtnSalvar(){
		
	}
	
	public void salvar(){
		LivroEntity livroEntity = new LivroEntity();
		CadastroLivroDAO livroDAO = new CadastroLivroDAO();
		
		livroEntity.setTituloLivro(txtTituloLivro.getText());
		livroEntity.setTituloLivro(txtISBN.getText());
		livroEntity.setTituloLivro(txtNomeAutor.getText());
		livroEntity.setTituloLivro(txtDataPublicacao.getText());
		livroEntity.setTituloLivro(txtEditora.getText());
		livroEntity.setTituloLivro(txtCategoria.getText());
		livroEntity.setTituloLivro(txtFormato.getText());
		livroEntity.setTituloLivro(txtnumPaginas.getText());
		livroEntity.setTituloLivro(txtSumario.getText());
		livroEntity.setTituloLivro(txtResumo.getText());
		livroEntity.setTituloLivro(txtPrecoCusto.getText());
		livroEntity.setTituloLivro(txtPrecoVenda.getText());
		livroEntity.setTituloLivro(txtMargemLucro.getText());
		livroEntity.setTituloLivro(txtQtdeEmEstoque.getText());
		
		try {
			if (livroDAO.insert(livroEntity) > 0){
				JOptionPane.showMessageDialog(null, "Cadastro do Livro Efetuado Com Sucesso");
				TelaLivro.telaDefault();
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
			}
		} catch (Exception e){
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(TelaLivro.validaCampos())
		salvar();
	}

}
