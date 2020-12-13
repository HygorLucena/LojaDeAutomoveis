
public class Pessoa {
	
	
	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	private Endereço endereco;
	private ContaFisica cf;
	
	public Pessoa() {
		
	}
	
	
	public Pessoa(String nome, int idade, String sexo, String cpf, Endereço endereco, ContaFisica cf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cf = cf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCidade() {
		return idade;
	}


	public void setCidade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Endereço getEndereco() {
		return endereco;
	}


	public void setEndereco(Endereço endereco) {
		this.endereco = endereco;
	}


	public ContaFisica getCf() {
		return cf;
	}


	public void setCf(ContaFisica cf) {
		this.cf = cf;
	}
	
	
	
	
	

}
