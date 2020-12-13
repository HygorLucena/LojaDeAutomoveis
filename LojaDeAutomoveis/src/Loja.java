import java.util.ArrayList;

public class Loja {
	
	private ContaJuridica cj;
	private Endereço endereco;
	private ArrayList<Automovel> listaDeAutomoveis;
	private ArrayList<Cliente> listaDeClientes;
	private ArrayList<Venda> listaDeVendas;
	private ArrayList<Vendedor> listaDeVendedores;
	
	
	public Loja(ContaJuridica cj, Endereço endereco, ArrayList<Automovel> listaDeAutomoveis,
			ArrayList<Cliente> listaDeClientes, ArrayList<Venda> listaDeVendas, ArrayList<Vendedor> listaDeVendedores) {
		super();
		this.cj = cj;
		this.endereco = endereco;
		this.listaDeAutomoveis = listaDeAutomoveis;
		this.listaDeClientes = listaDeClientes;
		this.listaDeVendas = listaDeVendas;
		this.listaDeVendedores = listaDeVendedores;
	}


	public ContaJuridica getCj() {
		return cj;
	}


	public void setCj(ContaJuridica cj) {
		this.cj = cj;
	}


	public Endereço getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}


	public ArrayList<Automovel> getListaDeAutomoveis() {
		return listaDeAutomoveis;
	}


	public void setListaDeAutomoveis(ArrayList<Automovel> listaDeAutomoveis) {
		this.listaDeAutomoveis = listaDeAutomoveis;
	}


	public ArrayList<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}


	public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}


	public ArrayList<Venda> getListaDeVendas() {
		return listaDeVendas;
	}


	public void setListaDeVendas(ArrayList<Venda> listaDeVendas) {
		this.listaDeVendas = listaDeVendas;
	}


	public ArrayList<Vendedor> getListaDeVendedores() {
		return listaDeVendedores;
	}


	public void setListaDeVendedores(ArrayList<Vendedor> listaDeVendedores) {
		this.listaDeVendedores = listaDeVendedores;
	}
	
	

}
