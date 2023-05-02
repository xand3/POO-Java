package byteBankHerdado;

public class Funcionario {
	private String nome;
	private String cpf;
	protected double salario; // protected é enxergado pelas classes herdadas

	public double getBonificacao() {
		return this.getSalario() * 0.05;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
