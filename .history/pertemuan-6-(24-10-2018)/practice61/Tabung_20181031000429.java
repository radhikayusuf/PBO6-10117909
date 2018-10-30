public class Tabung extends BangunRuang{
    private double volume;
    private double t;
    private double r;

    public double getTinggi() {
        return t;
    }

    public void setTinggi(double t) {
        this.t = t;
    }

    public double getJariJari() {
        return r;
    }

    public void setJariJari(double r) {
        this.r = r;
    }
   

    
    @Override
    public double hitungVolume() {
      this.volume = Math.PI * Math.pow(r, 2) * t;
        return this.volume;
    }
    
    
            
}