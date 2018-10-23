public class JumlahBilangan extends Bilangan{
    
    public JumlahBilangan(int x, int y) {
        super(x, y);
    }
    
    public void tampilHasilJumlah(){
        System.out.println("Hasil Perjumlahan = " + (getX() + getY()));
    }
    
}