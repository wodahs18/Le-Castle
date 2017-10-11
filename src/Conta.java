public class Conta {
    private double saldo;
    
    public double getSaldo(){
       return saldo;
    }
    
    public void deposita(double x){
       saldo = saldo + x;
    }
    
    public void saca(double x){
       saldo = saldo - x;
    }
    
    public void atualizaConta(double percentual){
       saldo = saldo + saldo*percentual;
    }
}
