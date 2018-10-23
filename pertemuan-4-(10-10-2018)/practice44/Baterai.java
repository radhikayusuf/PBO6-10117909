public class Baterai {
    private float kuatArus, hambatan;

    public Baterai() {
        System.out.println("==== Hukum OHM ==== ");               
        System.out.println(""+ 
        "Kuat arus yang mengalir pada suatu kawat penghantar\n" +
        "akan berbanding lurus dengan beda potensial\n" +
        "pada ujung-ujung kawal penghantar tersebut\n" +
        "asalkan suhu kawat dijaga konstan.\n\n");
    }

    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan(){
        return getHambatan() * getKuatArus();
    }
    
    
}