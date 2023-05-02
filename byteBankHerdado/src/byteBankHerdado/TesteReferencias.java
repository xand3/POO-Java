package byteBankHerdado;

public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("xande");
		g1.setSalario(5000);
		
		Funcionario f = new Funcionario();
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(3000);
		
		Designer d = new Designer();
		d.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		controle.registra(d);
		
		System.out.println(controle.getSoma());
		
	}
}
