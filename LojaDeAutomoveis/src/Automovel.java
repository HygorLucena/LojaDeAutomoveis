
public class Automovel {
	
	private String tipo;
	private String marca;
	private int anoFabricacao;
	private double preco;
	private String placa;
	
	
	
	public Automovel(String tipo, String marca, int anoFabricacao, double preco, String placa) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.anoFabricacao = anoFabricacao;
		this.preco = preco;
		this.placa = placa;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getAnoFabricacao() {
		return anoFabricacao;
	}



	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public String getPlaca() {
		return placa;
	}



	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	


	
	

}
