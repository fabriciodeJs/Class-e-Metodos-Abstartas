package entities;

public class PessoaJuridica extends Pessoa{
	
	private int NumeroDeFucionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, double rendaAnual, int numeroDeFucionario) {
		super(nome, rendaAnual);
		NumeroDeFucionario = numeroDeFucionario;
	}

	public int getNumeroDeFucionario() {
		return NumeroDeFucionario;
	}

	public void setNumeroDeFucionario(int numeroDeFucionario) {
		NumeroDeFucionario = numeroDeFucionario;
	}
	@Override
	public Double taxa() {
		if(NumeroDeFucionario > 10) {
		return getRendaAnual() * 0.14;
	}else {
		return getRendaAnual() * 0.16;
	}
	}
}
