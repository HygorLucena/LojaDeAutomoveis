import java.util.ArrayList;

public class LojaDeAutomoveis {

	public static void main(String[] args) {
		
		ArrayList<Automovel> listaDeAutomoveis = new ArrayList<Automovel>();
		ArrayList<Cliente> listaDeClientes = new ArrayList<Cliente>();
		ArrayList<Venda> listaDeVendas = new ArrayList<Venda>();
		ArrayList<Vendedor> listaDeVendedores = new ArrayList<Vendedor>();
		
	
		
		//Conta
		ContaFisica cof1 = new ContaFisica();
		ContaFisica cof2 = new ContaFisica("Jubileu", 0, "12345678985");
		ContaJuridica coj1 = new ContaJuridica();
		
		//Endereço
		Endereço end1 = new Endereço("Rua das Palmas", "64000178", "Velho", "Recife", "PE");
		Endereço end2 = new Endereço("Rua Bonita", "98745623", "Distante", "Capuru", "KI");
		Endereço end3 = new Endereço("Av. Principal", "00012345", "Centro", "Ali", "PE");
		
		//Automoveis
		Automovel a1 = new Automovel("SUV", "EC", 2020, 150800, "uc25br");
		
		//Proposta
		Proposta pro1 = new Proposta(a1, 150800, 500);
		
		//Cliente
		Cliente c1 = new Cliente("Juvenal", 35, "M", "12345678985", end1, cof1, pro1);
		
		//Vendedor
		Vendedor vend1 = new Vendedor("Jubileu", 25, "M", "98765432151", end2, cof2, 0);
		
		//Venda
		Venda v1 = new Venda(c1,vend1);
		
		//Adidionar Automeis na lista
		listaDeAutomoveis.add(a1);
		
		//Adicionar Clientes na lista
		listaDeClientes.add(c1);
		
		//Adicionar Vendas na lista
		listaDeVendas.add(v1);
		
		//Adicionar Vendedores na lista
		listaDeVendedores.add(vend1);
		
		//Loja de Automoveis
		Loja l1 = new Loja(coj1, end3, listaDeAutomoveis, listaDeClientes, listaDeVendas, listaDeVendedores);
		
		
		v1.executarVenda(vend1, 1000); //venda 1
		
		v1.exucutarVendaPeloAutomovel(vend1, a1); //venda 2
		
		//Mostra quantos automoveis estão cadastrados na loja
		System.out.println(l1.getListaDeAutomoveis().size()); 
		
	}
}
