class Bola {
    private double massa;
    private double kecepatan;
    private double energikinetik1;
    private double energikinetik2;


    public double hitungEnergiKinetik1(double massa, double kecepatan) {
        this.energikinetik1 = 0.5 * massa * (kecepatan * kecepatan);
        return this.energikinetik1;
    }
    
    public void hitungEnergiKinetik2(double massa) {
        this.energikinetik2 = 0.5 * massa * 0;
    }
    
    public double hitungUsaha() {
        return energikinetik1 - energikinetik2;
    }

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
    
}