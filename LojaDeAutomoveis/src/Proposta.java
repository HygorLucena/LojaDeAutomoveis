
public class Proposta {
	
	private Automovel automovel;
	private double valor;
	private double desconto;
	
	public Proposta() {
		
	}
	
	public Proposta(Automovel automovel, double valor, double desconto) {
		super();
		this.automovel = automovel;
		this.valor = valor;
		this.desconto = desconto;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	

}
