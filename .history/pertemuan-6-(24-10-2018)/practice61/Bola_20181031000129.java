public class Bola extends BangunRuang{
    private double jariJari;
    private double volume;


    @Override
    public double hitungVolume() {
        this.volume = 1.3333 * Math.PI * Math.pow(jariJari, 3);
        return this.volume;
    }   


    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
            
}