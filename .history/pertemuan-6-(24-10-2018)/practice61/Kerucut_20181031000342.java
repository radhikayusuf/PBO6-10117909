public class Kerucut extends BangunRuang{
    private double volume;
    private double tinggi;
    private double jariJari;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungVolume() {
       this.volume = 0.3333 * Math.PI * Math.pow(this.jariJari, 2) * this.tinggi;
        return this.volume;
    }
      
}