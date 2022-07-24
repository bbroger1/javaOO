
public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	protected int senha;
	
	/*public Funcionario(String nome, String cpf, double salario, int senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.senha = senha;
	}*/
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		
		return false;
	}

	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
