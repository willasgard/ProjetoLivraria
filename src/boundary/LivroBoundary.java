package boundary;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

import control.JDateChooser;
import control.ObraEvBtnSalvar;
import entity.LivroEntity;
import entity.ObraEntity;

public class LivroBoundary {
	
	private LivroEntity livroEntity;
	
	private JFrame frame = new JFrame();
	private JPanel contentPane;
	
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
		new LivroBoundary();

	}
	
	public LivroBoundary(){
		
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setBounds(100, 100, 529, 439);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Cadastro de Livros.");
		contentPane.setLayout(null);
		
		txtISBN = new JTextField();
		txtISBN.setBounds(111, 13, 337, 20);
		txtISBN.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtISBN.setText("");
		txtISBN.add(txtISBN);
		txtISBN.setColumns(10);
		
		txtNomeAutor = new JTextField();
		txtNomeAutor.setBounds(111, 75, 337, 20);
		txtNomeAutor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeAutor.setText("");
		contentPane.add(txtNomeAutor);
		txtNomeAutor.setColumns(10);
		
		txtDataPublicacao = new JTextField();
		txtDataPublicacao.setBounds(111, 106, 337, 20);
		txtDataPublicacao.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtDataPublicacao.setText("");
		contentPane.add(txtDataPublicacao);
		txtDataPublicacao.setColumns(10);

		txtEditora = new JTextField();
		txtEditora.setBounds(111, 137, 337, 20);
		txtEditora.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEditora.setText("");
		contentPane.add(txtEditora);
		txtEditora.setColumns(10);
		
		txtCategoria = new JTextField();
		txtCategoria.setBounds(111, 168, 337, 20);
		txtCategoria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCategoria.setText("");
		contentPane.add(txtCategoria);
		txtCategoria.setColumns(10);
		
		txtFormato = new JTextField();
		txtFormato.setBounds(111, 199, 337, 20);
		txtFormato.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtFormato.setText("");
		contentPane.add(txtFormato);
		txtFormato.setColumns(10);
		
		txtnumPaginas = new JTextField();
		txtnumPaginas.setBounds(111, 230, 337, 20);
		txtnumPaginas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtnumPaginas.setText("");
		contentPane.add(txtnumPaginas);
		txtnumPaginas.setColumns(10);
		
		txtSumario = new JTextField();
		txtSumario.setBounds(111, 261, 337, 20);
		txtSumario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSumario.setText("");
		contentPane.add(txtSumario);
		txtSumario.setColumns(10);
		
		txtResumo = new JTextField();
		txtResumo.setBounds(111, 292, 337, 20);
		txtResumo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtResumo.setText("");
		contentPane.add(txtResumo);
		txtResumo.setColumns(10);
		
		txtPrecoCusto = new JTextField();
		txtPrecoCusto.setBounds(111, 323, 337, 20);
		txtPrecoCusto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoCusto.setText("");
		contentPane.add(txtPrecoCusto);
		txtPrecoCusto.setColumns(10);
		
		txtPrecoVenda = new JTextField();
		txtPrecoVenda.setBounds(111, 344, 337, 20);
		txtPrecoVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoVenda.setText("");
		contentPane.add(txtPrecoVenda);
		txtPrecoVenda.setColumns(10);
		
		txtMargemLucro = new JTextField();
		txtMargemLucro.setBounds(111, 375, 337, 20);
		txtMargemLucro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMargemLucro.setText("");
		contentPane.add(txtMargemLucro);
		txtMargemLucro.setColumns(10);
		
		txtQtdeEmEstoque = new JTextField();
		txtQtdeEmEstoque.setBounds(111, 406, 337, 20);
		txtQtdeEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtQtdeEmEstoque.setText("");
		contentPane.add(txtQtdeEmEstoque);
		txtQtdeEmEstoque.setColumns(10);
		
		bntSalvar = new JButton("Salvar");
		bntSalvar.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/___")));
		bntSalvar.setBounds(63, 430, 125, 37);
		contentPane.add(bntSalvar);
		
		bntAlterar = new JButton("Alterar");
		bntAlterar.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		bntAlterar.setBounds(198, 430, 125, 37);
		contentPane.add(bntAlterar);
		
		bntDeletar = new JButton("Deletar");
		bntDeletar.setBounds(333, 430, 125, 37);
		contentPane.add(bntDeletar);
		
		bntPesquisarLivro = new JButton("");
		bntPesquisarLivro.setBounds(454, 11, 37, 24);
		bntPesquisarLivro.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		contentPane.add(bntPesquisarLivro);
		
		bntPesquisarAutor = new JButton("");
		bntPesquisarAutor.setBounds(455, 43, 37, 24);
		bntPesquisarAutor.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/_____")));
		contentPane.add(bntPesquisarAutor);

		BtnVoltar = new JButton("");
		BtnVoltar.setIcon(new ImageIcon(LivroBoundary.class.getResource("/resource/________")));
		BtnVoltar.setBounds(449, 265, 43, 37);
		contentPane.add(BtnVoltar);
		
		
		/*
		 * Adicionar evento ao botão salvar
		*/
		
		
		/*
		 * Adicionar evento ao botão pesquisarLivro
		*/
		
		/*
		 * Adicionar evento ao botão pesuqisarPorAutor
		*/
		
		/*
		 * Adicionar evento ao botão alterar
		*/
		
		/*
		 * Adicionar evento ao botão deletar
		*/
		
		/*
		 * Adicionar evento ao botão voltar
		*/
	}
	
	public void telaDefault(){
		
	}

	
	

}
