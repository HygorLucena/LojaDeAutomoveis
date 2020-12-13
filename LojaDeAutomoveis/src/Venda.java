
public class Venda {
	
	private Cliente nomeCliente;
	private Vendedor nomeVendedor;
	
	public Venda() {
		
	}
	
	public Venda(Cliente nomeCliente, Vendedor nomeVendedor) {
		super();
		this.nomeCliente = nomeCliente;
		this.nomeVendedor = nomeVendedor;
	}

	public Cliente getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(Cliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Vendedor getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(Vendedor nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}
	
	public void executarVenda( Vendedor vendedor, double valorDoAutomovel ) {
		
		if(this.getNomeVendedor() == vendedor) {
			
			double comissao = valorDoAutomovel * 0.1; //calculo da comissão do vendedor
			
			this.nomeVendedor.setComissao(comissao);
			
			this.nomeVendedor.getCf().depositar(comissao);
			
			System.out.println(nomeVendedor.detalhesVendedor());
			
		}
	}
	
	public void exucutarVendaPeloAutomovel (Vendedor vendedor, Automovel automovel ) {
		
		if(this.getNomeVendedor() == vendedor) {
			
			double comissao = automovel.getPreco() * 0.1; //calcula a comissão pelo objeto automovel
			
			this.nomeVendedor.setComissao(comissao); //Insere a comissao no atributo
			
			this.nomeVendedor.getCf().depositar(comissao); //Insere a comissao no metodo depositar da conta
														   // do vendedor
			
			System.out.println(nomeVendedor.detalhesVendedor());
			
		}
	}

}
