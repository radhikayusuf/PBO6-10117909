public class Bola extends BangunRuang{
    private double r;
    private double volume;

    public double getJariJari() {
        return r;
    }

    public void setJariJari(double r) {
        this.r = r;
    }
            
    @Override
    public double hitungVolume() {
        this.volume = 1.3333 * Math.PI*(r*r*r);
        return this.volume;
    }   
}