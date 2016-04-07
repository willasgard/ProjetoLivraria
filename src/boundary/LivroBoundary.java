package boundary;

import infraestructure.CadastroLivroDAO;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import control.LivroEvBtnAlterar;
import control.LivroEvBtnDeletar;
//import control.LivroEvBtnSalvar;
import entity.LivroEntity;

public class LivroBoundary {

	private LivroEntity livroEntity;

	private JFrame frame = new JFrame();
<<<<<<< HEAD
	private JPanel contentPane = new JPanel(new BorderLayout());
	
	private JLabel lblTituloLivro;
	private JLabel lblISBN;
	private JLabel lblNomeAutor;
	private JLabel lblDataPublicacao;
	private JLabel lblEditora;
	private JLabel lblCategoria;
	private JLabel lblFormato;
	private JLabel lblnumPaginas;	
	private JLabel lblSumario;
	private JLabel lblResumo;
	private JLabel lblPrecoCusto;
	private JLabel lblPrecoVenda;
	private JLabel lblMargemLucro;
	private JLabel lblQtdeEmEstoque;
	
=======
	private JPanel contentPane;
>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
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

	private JButton BtnVoltar;
	private JButton bntPesquisarAutor;
	private JButton bntPesquisarLivro;
	private JButton bntDeletar;
	private JButton bntAlterar;
	private JButton bntSalvar;

	public LivroEntity getLivroEntity() {
		return livroEntity;
	}

	public void setLivroEntity(LivroEntity livroEntity) {
		this.livroEntity = livroEntity;
	}

	public static void main(String[] args) {
		new LivroBoundary().frame.setVisible(true);

	}

	public LivroBoundary() {

		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 600, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Cadastro de Livros.");
		contentPane.setLayout(null);
<<<<<<< HEAD
		
		lblISBN = new JLabel("ISBN: ");
		lblISBN.setBounds(2, 10, 111, 20);
		contentPane.add(lblISBN);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtISBN = new JTextField();
		txtISBN.setBounds(111, 10, 337, 20);
		txtISBN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtISBN.setText("");
		txtISBN.setColumns(10);
<<<<<<< HEAD
		contentPane.add(txtISBN);
		
		lblNomeAutor = new JLabel("Nome do Autor: ");
		lblNomeAutor.setBounds(2, 40, 111, 20);
		contentPane.add(lblNomeAutor);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtNomeAutor = new JTextField();
		txtNomeAutor.setBounds(111, 40, 337, 20);
		txtNomeAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeAutor.setText("");
		contentPane.add(txtNomeAutor);
		txtNomeAutor.setColumns(10);
<<<<<<< HEAD
		
		lblDataPublicacao = new JLabel("Data Publicação: ");
		lblDataPublicacao.setBounds(2, 70, 111, 20);
		contentPane.add(lblDataPublicacao);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtDataPublicacao = new JTextField();
		txtDataPublicacao.setBounds(111, 70, 337, 20);
		txtDataPublicacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDataPublicacao.setText("");
		contentPane.add(txtDataPublicacao);
		txtDataPublicacao.setColumns(10);
		
		lblEditora = new JLabel("Editora: ");
		lblEditora.setBounds(2, 100, 111, 20);
		contentPane.add(lblEditora);

		txtEditora = new JTextField();
		txtEditora.setBounds(111, 100, 337, 20);
		txtEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEditora.setText("");
		contentPane.add(txtEditora);
		txtEditora.setColumns(10);
<<<<<<< HEAD
		
		lblCategoria = new JLabel("Categoria: ");
		lblCategoria.setBounds(2, 130, 111, 20);
		contentPane.add(lblCategoria);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtCategoria = new JTextField();
		txtCategoria.setBounds(111, 130, 337, 20);
		txtCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCategoria.setText("");
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
<<<<<<< HEAD
		
		lblFormato = new JLabel("Formato: ");
		lblFormato.setBounds(2, 160, 111, 20);
		contentPane.add(lblFormato);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtFormato = new JTextField();
		txtFormato.setBounds(111, 160, 337, 20);
		txtFormato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFormato.setText("");
		contentPane.add(txtFormato);
		txtFormato.setColumns(10);
<<<<<<< HEAD
		
		lblnumPaginas = new JLabel("Numero de Pags: ");
		lblnumPaginas.setBounds(2, 190, 111, 20);
		contentPane.add(lblnumPaginas);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtnumPaginas = new JTextField();
		txtnumPaginas.setBounds(111, 190, 337, 20);
		txtnumPaginas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtnumPaginas.setText("");
		contentPane.add(txtnumPaginas);
		txtnumPaginas.setColumns(10);
<<<<<<< HEAD
		
		lblSumario = new JLabel("Sumario: ");
		lblSumario.setBounds(2, 220, 111, 20);
		contentPane.add(lblSumario);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtSumario = new JTextField();
		txtSumario.setBounds(111, 220, 337, 20);
		txtSumario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSumario.setText("");
		contentPane.add(txtSumario);
		txtSumario.setColumns(10);
<<<<<<< HEAD
		
		lblResumo = new JLabel("Resumo: ");
		lblResumo.setBounds(2, 250, 111, 20);
		contentPane.add(lblResumo);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtResumo = new JTextField();
		txtResumo.setBounds(111, 250, 337, 20);
		txtResumo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResumo.setText("");
		contentPane.add(txtResumo);
		txtResumo.setColumns(10);
<<<<<<< HEAD
		
		lblPrecoCusto = new JLabel("Preco de Custo: ");
		lblPrecoCusto.setBounds(2, 280, 111, 20);
		contentPane.add(lblPrecoCusto);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtPrecoCusto = new JTextField();
		txtPrecoCusto.setBounds(111, 280, 337, 20);
		txtPrecoCusto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoCusto.setText("");
		contentPane.add(txtPrecoCusto);
		txtPrecoCusto.setColumns(10);
<<<<<<< HEAD
		
		lblPrecoVenda = new JLabel("Preco de Venda: ");
		lblPrecoVenda.setBounds(2, 310, 280, 20);
		contentPane.add(lblPrecoVenda);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtPrecoVenda = new JTextField();
		txtPrecoVenda.setBounds(111, 310, 337, 20);
		txtPrecoVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoVenda.setText("");
		contentPane.add(txtPrecoVenda);
		txtPrecoVenda.setColumns(10);
<<<<<<< HEAD
		
		lblMargemLucro = new JLabel("Margem de Lucro: ");
		lblMargemLucro.setBounds(2, 330, 330, 20);
		contentPane.add(lblMargemLucro);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtMargemLucro = new JTextField();
		txtMargemLucro.setBounds(111, 330, 337, 20);
		txtMargemLucro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMargemLucro.setText("");
		contentPane.add(txtMargemLucro);
		txtMargemLucro.setColumns(10);
<<<<<<< HEAD
		
		lblQtdeEmEstoque = new JLabel("Qtde em Estoque: ");
		lblQtdeEmEstoque.setBounds(2, 360, 310, 20);
		contentPane.add(lblQtdeEmEstoque);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		txtQtdeEmEstoque = new JTextField();
		txtQtdeEmEstoque.setBounds(111, 360, 337, 20);
		txtQtdeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtQtdeEmEstoque.setText("");
		contentPane.add(txtQtdeEmEstoque);
		txtQtdeEmEstoque.setColumns(10);

		bntSalvar = new JButton("Salvar");
		//bntSalvar.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/___")));
		bntSalvar.setBounds(63, 430, 125, 37);
		contentPane.add(bntSalvar);
<<<<<<< HEAD
		LivroEvBtnSalvar evtSalvar = new LivroEvBtnSalvar();
bntSalvar.addActionListener(evtSalvar);
		
=======

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		bntAlterar = new JButton("Alterar");
		//bntAlterar.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		bntAlterar.setBounds(198, 430, 125, 37);
<<<<<<< HEAD
		//contentPane.add(bntAlterar);
		
		bntDeletar = new JButton("Deletar");
		bntDeletar.setBounds(333, 430, 125, 37);
		//contentPane.add(bntDeletar);
		
		bntPesquisarLivro = new JButton("");
		bntPesquisarLivro.setBounds(454, 11, 37, 24);
		//bntPesquisarLivro.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		//contentPane.add(bntPesquisarLivro);*/
		
=======
		contentPane.add(bntAlterar);

		bntDeletar = new JButton("Deletar");
		bntDeletar.setBounds(333, 430, 125, 37);
		contentPane.add(bntDeletar);

		bntPesquisarLivro = new JButton("");
		bntPesquisarLivro.setBounds(454, 11, 37, 24);
		bntPesquisarLivro.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		contentPane.add(bntPesquisarLivro);

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		bntPesquisarAutor = new JButton("");
		bntPesquisarAutor.setBounds(455, 43, 37, 24);
		//bntPesquisarAutor.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		//contentPane.add(bntPesquisarAutor);*/

		BtnVoltar = new JButton("");
		//BtnVoltar.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/________")));
		BtnVoltar.setBounds(449, 265, 43, 37);
<<<<<<< HEAD
		//contentPane.add(BtnVoltar);*/
		
		
		/*LivroEvBtnSalvar evtSalvar = new LivroEvBtnSalvar(this, txtTituloLivro, txtISBN, txtNomeAutor, txtDataPublicacao,
															txtEditora, txtCategoria, txtFormato, txtnumPaginas, txtSumario, txtResumo,
															txtPrecoCusto, txtPrecoVenda, txtMargemLucro, txtQtdeEmEstoque);
		bntSalvar.addActionListener(evtSalvar);*/
		
		
		
		LivroEvBtnAlterar evtAlterar = new LivroEvBtnAlterar(this, txtTituloLivro, txtISBN, txtNomeAutor, txtDataPublicacao, txtEditora,
															txtCategoria, txtFormato, txtnumPaginas, txtSumario, txtResumo, 
															txtPrecoCusto, txtPrecoVenda, txtMargemLucro, txtQtdeEmEstoque);
		bntAlterar.addActionListener(evtAlterar);		
		
		
		
=======
		contentPane.add(BtnVoltar);

		/*
		 * Adicionar evento ao botão salvar
		 */

		LivroEvBtnSalvar evtSalvar = new LivroEvBtnSalvar(this, txtTituloLivro, txtISBN, txtNomeAutor,
				txtDataPublicacao, txtEditora, txtCategoria, txtFormato, txtnumPaginas, txtSumario, txtResumo,
				txtPrecoCusto, txtPrecoVenda, txtMargemLucro, txtQtdeEmEstoque);
		bntSalvar.addActionListener(evtSalvar);

		LivroEvBtnAlterar evtAlterar = new LivroEvBtnAlterar(this, txtTituloLivro, txtISBN, txtNomeAutor,
				txtDataPublicacao, txtEditora, txtCategoria, txtFormato, txtnumPaginas, txtSumario, txtResumo,
				txtPrecoCusto, txtPrecoVenda, txtMargemLucro, txtQtdeEmEstoque);
		bntAlterar.addActionListener(evtAlterar);

>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		LivroEvBtnDeletar evtDeletar = new LivroEvBtnDeletar(this);
		BtnVoltar.addActionListener(evtAlterar);

		/*
		 * Adicionar evento ao botão voltar
		 */
	}

	public void telaDefault() {

		txtISBN.setText("");
		txtNomeAutor.setText("");
		txtDataPublicacao.setText("");
		txtEditora.setText("");
		txtCategoria.setText("");
		txtFormato.setText("");
		txtnumPaginas.setText("");
		txtSumario.setText("");
		txtResumo.setText("");
		txtPrecoCusto.setText("");
		txtPrecoVenda.setText("");
		txtMargemLucro.setText("");
		txtQtdeEmEstoque.setText("");

		bntAlterar.setEnabled(false);
		bntDeletar.setEnabled(false);
		BtnVoltar.setEnabled(false);
		bntSalvar.setEnabled(true);

	}
<<<<<<< HEAD
	
	public void telaAlterar(){
		
		//bntAlterar.setEnabled(true);
		bntDeletar.setEnabled(true);		
=======

	public void telaAlterar() {

		bntAlterar.setEnabled(true);
		bntDeletar.setEnabled(true);
>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
		BtnVoltar.setEnabled(true);
		bntSalvar.setEnabled(true);
	}

	public boolean validaCampos() {
		if (txtISBN.getText().length() <= 0 || txtNomeAutor.getText().length() <= 0
				|| txtDataPublicacao.getText().length() <= 0 || txtEditora.getText().length() <= 0
				|| txtCategoria.getText().length() <= 0 || txtFormato.getText().length() <= 0
				|| txtnumPaginas.getText().length() <= 0 || txtSumario.getText().length() <= 0
				|| txtResumo.getText().length() <= 0 || txtPrecoCusto.getText().length() <= 0
				|| txtPrecoVenda.getText().length() <= 0 || txtMargemLucro.getText().length() <= 0
				|| txtQtdeEmEstoque.getText().length() <= 0) {
			JOptionPane.showMessageDialog(null, "Preencher todos os campos");
			return false;
		}
		return true;
	}

<<<<<<< HEAD
	
	public class LivroEvBtnSalvar implements ActionListener {
		
		
		
		public LivroEvBtnSalvar(){
			
		}
		
		public void salvar(){
			LivroEntity livroEntity = new LivroEntity();
			CadastroLivroDAO livroDAO = new CadastroLivroDAO();
			
			System.out.println("Primeiro");
			livroEntity.setTituloLivro(txtTituloLivro.getText()); 
			//livroEntity.setIsbn((int)txtISBN.getText());
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
					telaDefault();
				} else {
					JOptionPane.showMessageDialog(null, "Erro ao cadastrar!");
				}
			} catch (Exception e){
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
		}
		
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(validaCampos())
			salvar();
		}

	}

=======
>>>>>>> 5cc1a682fcc9508cddf9394ea7c92200a1da0297
}
