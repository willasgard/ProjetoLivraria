package boundary;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class PesquisaBoundary1 {
     private JFrame tela = new JFrame("Pesquisa de livros");
     private JPanel painelPrincipal = new JPanel();
     private JList listaCategorias;
     
     
     
     public PesquisaBoundary1() {
		this.create();
	}

	public void create(){
    	 painelPrincipal.setLayout(new BorderLayout());
    	 JScrollPane scrollPane = new JScrollPane();
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
		
		JPanel painelCriterios = new JPanel();
		painelCriterios.setLayout(new GridLayout(3, 2, 10, 10));
		JLabel lbTitulo = new JLabel("Titulo");
		JLabel lbAutor = new JLabel("Autor");
		JLabel lbEditora = new JLabel("Editora");
		JTextField txtTitulo = new JTextField();
		JTextField txtAutor = new JTextField();
		JTextField txtEditora = new JTextField();
		painelCriterios.add(lbTitulo);
		painelCriterios.add(txtTitulo);
		painelCriterios.add(lbAutor);
		painelCriterios.add(txtAutor);
		painelCriterios.add(lbEditora);
		painelCriterios.add(txtEditora);
    	lbTitulo.setHorizontalAlignment(JLabel.RIGHT);
    	lbAutor.setHorizontalAlignment(JLabel.RIGHT);
    	lbEditora.setHorizontalAlignment(JLabel.RIGHT);
   // 	lbTitulo.setVerticalAlignment(JLabel.RIGHT);
   // 	lbAutor.setVerticalAlignment(JLabel.RIGHT);
    //	lbEditora.setVerticalAlignment(JLabel.RIGHT);
    	
    	
    	
    	JButton btnPesquisar = new JButton("Pesquisar");
   
    	JPanel painelCompCri = new JPanel();
    	painelCompCri.setLayout(new BorderLayout());
    	painelCompCri.add(painelCriterios, BorderLayout.NORTH);
    	painelCompCri.add(btnPesquisar, BorderLayout.SOUTH);
    	
		JPanel painelLeste = new JPanel();
		painelLeste.setLayout(new GridLayout(1, 2, 10, 10));
		painelLeste.add(scrollPane);
		painelLeste.add(painelCompCri);
    	 
		painelPrincipal.add(painelLeste, BorderLayout.WEST);
     
		JPanel painelNorte = new JPanel();
		painelNorte.setLayout(new GridLayout(1, 3,10,10));
		
		JLabel iconeLivro = new JLabel();
		iconeLivro.setIcon(
				new ImageIcon(ItemCarrinhoBoundary.class.getResource("/resource/livros.png"))
				);
		JLabel iconeCarrinho = new JLabel();
		iconeCarrinho.setIcon(
				new ImageIcon(ItemCarrinhoBoundary.class.getResource("/resource/carrinho.png"))
				);
		JPanel painelCadastrar = new JPanel();
		painelCadastrar.setLayout(new GridLayout(2, 1));
		JPanel painelBotoes = new JPanel();
		painelBotoes.setLayout(new GridLayout(1, 2));
		JButton btnEntrar = new JButton("Entrar");
		JButton btnCadastrar = new JButton("Cadastrar");
		painelBotoes.add(btnEntrar);
		painelBotoes.add(btnCadastrar);
		
		painelCadastrar.add(iconeLivro);
		painelCadastrar.add(painelBotoes);
		
		painelNorte.add(iconeLivro);
		painelNorte.add(painelCadastrar);
		painelNorte.add(iconeCarrinho);
		
		painelPrincipal.add(painelNorte, BorderLayout.NORTH);
		
		tela.setContentPane(painelPrincipal);
		tela.setSize(800, 800);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
     }
     
     public static void main(String[] args) {
		PesquisaBoundary1 t = new PesquisaBoundary1();
	}
     
}
