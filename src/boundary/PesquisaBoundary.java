package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
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

import control.PesquisaControl;

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
			JPanel painelPrincipal = new JPanel();
			painelPrincipal.setLayout(new BorderLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(200, 200, 544, 449);
			contentPane = new JPanel();
			contentPane.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
			contentPane.setBackground(Color.WHITE);
			painelPrincipal.add(contentPane, BorderLayout.CENTER);
			setContentPane(painelPrincipal);
			contentPane.setLayout(null);
			
			JLabel lblLivrariaDigital = new JLabel("Livraria Digital");
			lblLivrariaDigital.setBounds(226, 3, 90, 14);
			lblLivrariaDigital.setFont(new Font("Arial", Font.BOLD, 12));
			contentPane.add(lblLivrariaDigital);
			
			
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
			lblIconeUsuario.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/resource/login.png")));
			
			lblImagemCarrinho = new JLabel("New label");
			lblImagemCarrinho.setBounds(448, 10, 37, 28);
			panel_1.add(lblImagemCarrinho);
			lblImagemCarrinho.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/resource/carrinho.png")));
			
			lblImgLivros = new JLabel("New label");
			lblImgLivros.setBounds(19, 1, 65, 53);
			panel_1.add(lblImgLivros);
			lblImgLivros.setIcon(new ImageIcon(PesquisaBoundary.class.getResource("/resource/livros.png")));
			
			JLabel lblTtulo = new JLabel("Título");
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
