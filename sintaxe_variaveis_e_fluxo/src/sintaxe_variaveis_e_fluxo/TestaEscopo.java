package sintaxe_variaveis_e_fluxo;

public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;
		
		// boolean acompanhado = quantidadePessoas >= 2;
		
		boolean acompanhado;
		

		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("pode entrar");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("não pode entrar");
		}
	}
}
