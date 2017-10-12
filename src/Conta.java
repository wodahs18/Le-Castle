public class Conta {
    protected double saldo;
    protected double percentual;
    
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
       saldo = saldo * (percentual / 100);
    }
    
    
}
