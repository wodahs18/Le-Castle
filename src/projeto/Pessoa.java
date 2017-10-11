public class Pessoa {
	
	protected String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimir() {
		System.out.println(this.nome);
	}
	
	public void imprimir(String argumento) {
		this.imprimir();
		System.out.println(argumento);
	}
}