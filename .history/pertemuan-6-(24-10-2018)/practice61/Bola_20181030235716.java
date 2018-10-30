public class Bola extends BangunRuang{
    private double jariJari;
    private double volume;

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
            
    @Override
    public double hitungVolume() {
        this.volume = 1.3333 * Math.PI*(r*r*r);
        return this.volume;
    }   
}