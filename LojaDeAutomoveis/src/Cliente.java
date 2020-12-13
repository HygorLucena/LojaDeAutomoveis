
public class Cliente extends Pessoa {
	
	private Proposta proposta;

	public Cliente() {
		super();
	}

	public Cliente(String nome, int idade, String sexo, String cpf, Endereço endereco, ContaFisica cf, 
					Proposta proposta) {
		super(nome, idade, sexo, cpf, endereco, cf);
		this.proposta = proposta;
	}

	public Proposta getProposta() {
		return proposta;
	}

	public void setProposta(Proposta proposta) {
		this.proposta = proposta;
	}

	
	public String detalhesCliente() {
		return "========== Cliente ==========" + "\n Nome: " + this.getNome() + "\n CPF: " + this.getCpf() +
				"\n Endereço: " + this.getEndereco().getLogadouro() + "\n Proposta: " + proposta.getValor() 
				+"\n Tipo do Veículo: " + proposta.getAutomovel().getTipo() +
				"\n============================="; 
	}
	
	
	

}
