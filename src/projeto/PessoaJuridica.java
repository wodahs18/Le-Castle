public class PessoaJuridica extends Pessoa {
	
	private String cnpj;
	
	public PessoaJuridica(String cnpj) {
		super(null);
		this.cnpj = cnpj;
	}
	
	public PessoaJuridica(String cnpj, String nome) {
		super(nome);
		this.cnpj = cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println(this.cnpj);
	}
	
}