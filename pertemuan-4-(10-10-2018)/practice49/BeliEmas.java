public class BeliEmas {
    private double beratEmas;
    private double hargaSatuGram;

    public double getBeratEmas() {
        return beratEmas;
    }

    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }   
    
    public double getHargaSatuGram() {
        return hargaSatuGram;
    }

    public void setHargaSatuGram(double hargaSatuGram) {
        this.hargaSatuGram = hargaSatuGram;
    }
    
    public double hitungTotalPembayaran(double hargaPerGram, double beratGramEmas) {
        return hargaPerGram * beratGramEmas;
    }
}