
public class Gerente extends Funcionario{
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		
		return false;
	}

	public double getBonificacao() {
		return this.salario * 0.3;
	}
}
