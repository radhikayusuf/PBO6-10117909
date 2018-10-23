public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    
    public int ambilUang(int jumlah){
        saldo -= jumlah;
        return saldo;
    }
    
    
}