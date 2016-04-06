package boundary;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class PesquisaBoundary extends JFrame {

		private JPanel contentPane;
		private JTextField txtPesquisarPagina;
		private JButton bntPesquisarPagina;
		private JButton bntHome;
		private JButton bntEncerrar;
		private JButton bntVoltar;
		private JButton bntAvancar;
		private JLabel lblEntrar;
		private JLabel lblCadastrar;
		private JLabel lblCarrinho;
		private JLabel lblIconeUsuario;
		private JLabel lblImagemCarrinho;
		private JLabel lblImgLivros;
		private JScrollBar scrollBar_1;
		private JTable categorias;
		private JList list;
		private JTextField txtTitulo;
		private JTextField txtAutor;
		private JTextField txtEditora;
		private JPanel painelPromocoes;
		private JLabel lblPromocoes;
		private JLabel lblLivro1;
		private JLabel lblLivro2;
		private JLabel lblLivro3;
		private JButton bntConfira;
		private JPanel painelLancamentos;
		private JLabel lblLancamentos;
		private JLabel lblLivro4;
		private JLabel lblTitulolivro;
		private JLabel lblTituloautor;
		private JLabel lblR;
		private JButton bntDetalhes;
		private JButton bntAdicionar;
		private JList listaCategorias;
		private JScrollPane scrollPane;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PesquisaBoundary frame = new PesquisaBoundary();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the frame.
		 */
		public PesquisaBoundary() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(200, 200, 544, 449);
			contentPane = new JPanel();
			contentPane.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
			contentPane.setBackground(Color.WHITE);
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblLivrariaDigital = new JLabel("Livraria Digital");
			lblLivrariaDigital.setBounds(226, 3, 90, 14);
			lblLivrariaDigital.setFont(new Font("Arial", Font.BOLD, 12));
			contentPane.add(lblLivrariaDigital);
			
			txtPesquisarPagina = new JTextField();
			txtPesquisarPagina.setBounds(160, 21, 309, 20);
			contentPane.add(txtPesquisarPagina);
			txtPesquisarPagina.setColumns(10);
			
			bntPesquisarPagina = new JButton("");
			bntPesquisarPagina.setBounds(471, 20, 47, 23);
			bntPesquisarPagina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			bntPesquisarPagina.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/lupa.png")));
			contentPane.add(bntPesquisarPagina);
			
			bntHome = new JButton("");
			bntHome.setBounds(122, 20, 34, 23);
			bntHome.setBackground(UIManager.getColor("Button.background"));
			bntHome.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			bntHome.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/home.png")));
			contentPane.add(bntHome);
			
			bntEncerrar = new JButton("");
			bntEncerrar.setBounds(85, 20, 34, 23);
			bntEncerrar.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/encerrar.png")));
			bntEncerrar.setBackground(SystemColor.menu);
			contentPane.add(bntEncerrar);
			
			bntVoltar = new JButton("");
			bntVoltar.setBounds(10, 20, 34, 23);
			bntVoltar.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/setaEsquerda.png")));
			bntVoltar.setBackground(SystemColor.menu);
			contentPane.add(bntVoltar);
			
			bntAvancar = new JButton("");
			bntAvancar.setBounds(48, 20, 34, 23);
			bntAvancar.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/setaDireita.png")));
			bntAvancar.setBackground(SystemColor.menu);
			contentPane.add(bntAvancar);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 528, 48);
			panel.setBackground(UIManager.getColor("Button.background"));
			contentPane.add(panel);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 48, 528, 54);
			panel_1.setBackground(UIManager.getColor("Button.disabledShadow"));
			contentPane.add(panel_1);
			panel_1.setLayout(null);
			
			lblEntrar = new JLabel("Entrar");
			lblEntrar.setBounds(299, 40, 37, 14);
			panel_1.add(lblEntrar);
			
			lblCadastrar = new JLabel("Cadastrar");
			lblCadastrar.setBounds(351, 40, 57, 14);
			panel_1.add(lblCadastrar);
			
			lblCarrinho = new JLabel("Meu Carrinho");
			lblCarrinho.setBounds(433, 40, 84, 14);
			panel_1.add(lblCarrinho);
			
			lblIconeUsuario = new JLabel("New label");
			lblIconeUsuario.setBounds(329, 1, 42, 41);
			panel_1.add(lblIconeUsuario);
			lblIconeUsuario.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/login.png")));
			
			lblImagemCarrinho = new JLabel("New label");
			lblImagemCarrinho.setBounds(448, 10, 37, 28);
			panel_1.add(lblImagemCarrinho);
			lblImagemCarrinho.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/carrinho.png")));
			
			lblImgLivros = new JLabel("New label");
			lblImgLivros.setBounds(19, 1, 65, 53);
			panel_1.add(lblImgLivros);
			lblImgLivros.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/images/livros.png")));
			
			JLabel lblTtulo = new JLabel("T\u00EDtulo");
			lblTtulo.setFont(new Font("Arial", Font.PLAIN, 12));
			lblTtulo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTtulo.setBounds(148, 116, 38, 14);
			contentPane.add(lblTtulo);
			
			JLabel lblAutor = new JLabel("Autor");
			lblAutor.setFont(new Font("Arial", Font.PLAIN, 12));
			lblAutor.setHorizontalAlignment(SwingConstants.CENTER);
			lblAutor.setBounds(152, 138, 30, 14);
			contentPane.add(lblAutor);
			
			txtTitulo = new JTextField();
			txtTitulo.setBounds(190, 113, 328, 20);
			contentPane.add(txtTitulo);
			txtTitulo.setColumns(10);
			
			txtAutor = new JTextField();
			txtAutor.setColumns(10);
			txtAutor.setBounds(190, 136, 86, 20);
			contentPane.add(txtAutor);
			
			JLabel lblEditora = new JLabel("Editora");
			lblEditora.setHorizontalAlignment(SwingConstants.CENTER);
			lblEditora.setFont(new Font("Arial", Font.PLAIN, 12));
			lblEditora.setBounds(278, 139, 46, 14);
			contentPane.add(lblEditora);
			
			txtEditora = new JTextField();
			txtEditora.setColumns(10);
			txtEditora.setBounds(326, 136, 97, 20);
			contentPane.add(txtEditora);
			
			JButton bntPesquisar = new JButton("Pesquisar");
			bntPesquisar.setFont(new Font("Arial", Font.PLAIN, 10));
			bntPesquisar.setBounds(433, 135, 85, 23);
			contentPane.add(bntPesquisar);
			
			painelPromocoes = new JPanel();
			painelPromocoes.setBounds(148, 163, 370, 116);
			contentPane.add(painelPromocoes);
			painelPromocoes.setLayout(null);
			
			lblPromocoes = new JLabel("Promo\u00E7\u00F5es");
			lblPromocoes.setBounds(3, 5, 69, 14);
			painelPromocoes.add(lblPromocoes);
			lblPromocoes.setFont(new Font("Arial", Font.BOLD, 11));
			
			lblLivro1 = new JLabel("Livro 1");
			lblLivro1.setBackground(Color.LIGHT_GRAY);
			lblLivro1.setHorizontalAlignment(SwingConstants.CENTER);
			lblLivro1.setBounds(3, 21, 69, 84);
			painelPromocoes.add(lblLivro1);
			
			lblLivro2 = new JLabel("Livro 2");
			lblLivro2.setHorizontalAlignment(SwingConstants.CENTER);
			lblLivro2.setBounds(82, 21, 69, 84);
			painelPromocoes.add(lblLivro2);
			
			lblLivro3 = new JLabel("Livro 3");
			lblLivro3.setHorizontalAlignment(SwingConstants.CENTER);
			lblLivro3.setBounds(161, 21, 69, 84);
			painelPromocoes.add(lblLivro3);
			
			bntConfira = new JButton("Confira!!!");
			bntConfira.setFont(new Font("Arial", Font.PLAIN, 11));
			bntConfira.setBackground(Color.YELLOW);
			bntConfira.setBounds(271, 52, 89, 23);
			painelPromocoes.add(bntConfira);
			
			painelLancamentos = new JPanel();
			painelLancamentos.setLayout(null);
			painelLancamentos.setBounds(148, 283, 370, 116);
			contentPane.add(painelLancamentos);
			
			lblLancamentos = new JLabel("Lan\u00E7amentos");
			lblLancamentos.setFont(new Font("Arial", Font.BOLD, 11));
			lblLancamentos.setBounds(3, 5, 89, 14);
			painelLancamentos.add(lblLancamentos);
			
			lblLivro4 = new JLabel("Livro 1");
			lblLivro4.setHorizontalAlignment(SwingConstants.CENTER);
			lblLivro4.setBackground(Color.LIGHT_GRAY);
			lblLivro4.setBounds(3, 21, 69, 84);
			painelLancamentos.add(lblLivro4);
			
			lblTitulolivro = new JLabel("Era uma vez");
			lblTitulolivro.setBounds(82, 21, 69, 14);
			painelLancamentos.add(lblTitulolivro);
			
			lblTituloautor = new JLabel("Soares, J.F.");
			lblTituloautor.setBounds(82, 39, 69, 14);
			painelLancamentos.add(lblTituloautor);
			
			lblR = new JLabel("R$ 38,50");
			lblR.setBounds(82, 69, 69, 14);
			painelLancamentos.add(lblR);
			
			bntDetalhes = new JButton("Detalhes");
			bntDetalhes.setBounds(161, 21, 89, 23);
			painelLancamentos.add(bntDetalhes);
			
			bntAdicionar = new JButton("Adicionar");
			bntAdicionar.setBounds(161, 65, 89, 23);
			painelLancamentos.add(bntAdicionar);
			
			JTextArea textArea = new JTextArea();
			textArea.setBounds(10, 113, 4, 22);
			contentPane.add(textArea);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 113, 128, 286);
			contentPane.add(scrollPane);
			
			listaCategorias = new JList();
			scrollPane.setViewportView(listaCategorias);
			listaCategorias.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			listaCategorias.setModel(new AbstractListModel() {
				String[] values = new String[] {"Categoria", "Administra\u00E7\u00E3o", "Agropecu\u00E1ria", "Artes", "Audiolivro", "Autoajuda", "Ci\u00EAncias Biol\u00F3gicas", "Ci\u00EAncias Exatas", "Ci\u00EAncias Humanas e Sociais", "Contabilidade", "Cursos e Idiomas", "Dicion\u00E1rios e Manuais Convers.", "Did\u00E1ticos", "Direito", "Economia", "Engenharia e Tecnologia", "Esoterismo", "Esportes e Lazer", "Gastronomia", "Geografia e Historia", "Inform\u00E1tica", "Lingu\u00EDstica", "Literatura Estrangeira", "Literatura Infantojuvenil", "Literatura Nacional", "Livros", "Medicina", "Religi\u00E3o", "Turismo"};
				public int getSize() {
					return values.length;
				}
				public Object getElementAt(int index) {
					return values[index];
				}
			});
			
			
		}
	}
