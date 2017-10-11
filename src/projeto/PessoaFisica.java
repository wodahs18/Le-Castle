public class PessoaFisica extends Pessoa {

   private String cpf;
   
   public PessoaFisica(String nome) {
	   super(nome);
   }
   
   public void setCpf(String cpf) {
      this.cpf = cpf;
   }
   
   public String getCpf() {
      return this.cpf;
   }

}