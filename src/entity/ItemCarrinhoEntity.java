package entity;



import javax.swing.ImageIcon;

public class ItemCarrinhoEntity {
	private ImageIcon imagem;
	private LivroEntity livro;
	private AuxQtdadeEntity quantidade;
	private double subTotal;
	
	
	
	public ItemCarrinhoEntity() {
		super();
		this.livro = new LivroEntity();
		this.quantidade = new AuxQtdadeEntity();
		this.livro.setNome("");
		this.livro.setPreco(0);
		this.quantidade.setQuantidade(0);
	}
	public ImageIcon getImagem() {
		return imagem;
	}
	public void setImagem(ImageIcon imagem) {
		this.imagem = imagem;
	}
	public LivroEntity getLivro() {
		return livro;
	}
	public void setLivro(LivroEntity livro) {
		this.livro = livro;
		this.subTotal = livro.getPreco() * quantidade.getQuantidade();
	}
	public AuxQtdadeEntity getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(AuxQtdadeEntity quantidade) {
		this.quantidade = quantidade;
		this.subTotal = livro.getPreco() * quantidade.getQuantidade();
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	@Override
	public String toString() {
		return "ItemCarrinhoEntity [imagem=" + imagem + ", livro=" + livro.getNome() + 
				", quantidade=" + quantidade.getQuantidade()
				+ ", subTotal=" + subTotal + "]";
	}
	
	
}
