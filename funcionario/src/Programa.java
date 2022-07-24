
public class Programa {
	public static void main(String[] args) {
		//testando a conta e cliente
		/*Conta conta = new Conta(1111, 22222);
		Cliente cliente = new Cliente();
		cliente.setNome("Fulano");
		conta.setTitular(cliente);
		
		System.out.println("a conta " + conta.getNumero() + " pertence a " + conta.getTitular().getNome());*/
		
		//testando funcionario
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Funci");
		funcionario.setSalario(1000.00);
		funcionario.getBonificacao();
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		
		//testando gerente
		Gerente gerente = new Gerente();
		gerente.setNome("Gerente");
		gerente.setSalario(2000.00);
		gerente.getBonificacao();
		
		System.out.println(gerente.getNome());
		System.out.println(gerente.getBonificacao());
	}
}
