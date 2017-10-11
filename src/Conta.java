public class Conta {
    protected double saldo;
    private double percentual;
    
    public double getSaldo(){
       return saldo;
    }
    
    public void deposita(double x){
       saldo = saldo + x;
    }
    
    public void saca(double x){
       saldo = saldo - x;
    }
    
    public void atualiza(double percentual){
       this.percentual = percentual;
    }
    
    
}
