/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program untuk menghitung bangun ruang
 *
 */
public class Practice61 {
    
    public static void main(String[] args) {                       
        BangunRuang bangunRuang;

        bangunRuang = new Bola();
        (bangunRuang as Bola).setJariJari(7);
        System.out.println("Hasil : V Bola\t= " + (bangunRuang as Bola).hitungVolume());
        
        // bangunRuang = new Bola();
        // tabung.setJariJari(10);
        // tabung.setTinggi(21);
        // System.out.println("\nHasil V Tabung : " + tabung.hitungVolume());
        
        // bangunRuang = new Bola();
        // kerucut.setJariJari(14);
        // kerucut.setTinggi(9);
        // System.out.println("\nHasil  V Kerucut : " +kerucut.hitungVolume() );
    }
    
}