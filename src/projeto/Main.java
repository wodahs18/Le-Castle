public class Main {

   public static void main(String ... args) {
      
	  Pessoa p = new Pessoa("xxx");
	  
	  PessoaJuridica pj = new PessoaJuridica("1234567897", "K4D");
	  
	  PessoaFisica pf = new PessoaFisica("Venezian");
	  
	  ProcessadoraPessoa pp = new ProcessadoraPessoa();
	  
	  pp.processar(p);
	  pp.processar(pj);
	  pp.processar(pf);   
   }
}