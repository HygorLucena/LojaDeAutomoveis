
public class Vendedor extends Pessoa {
	
	private double comissao;
	

	public Vendedor() {
		super();
		
	}


	public Vendedor(String nome, int idade, String sexo, String cpf, Endereço endereco, ContaFisica cf,
			double comissao) {
		super(nome, idade, sexo, cpf, endereco, cf);
		this.comissao = comissao;
	}


	public double getComissao() {
		return comissao;
	}


	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public String detalhesVendedor() {
		return "========== Detalhes do Vendedor ========== " + "\nNome: " + this.getNome() +
				"\nSexo: " + this.getSexo() + "\nCPF: " + this.getCpf() + "\nComissao: " + comissao +
				"\nSaldo da Conta: " + this.getCf().getSaldo() +
				"\n==========================================";
	}
	
	

}
