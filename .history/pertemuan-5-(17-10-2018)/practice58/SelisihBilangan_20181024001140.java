public class SelisihBilangan extends Bilangan{
    
    public SelisihBilangan(int x, int y) {
        super(x, y);
    }
    
    public void tampilSelisih(){
        System.out.println("Hasil selisih "+ getX() + " - " + getY() +" = " + (getX() - getY()));
    }
    
}