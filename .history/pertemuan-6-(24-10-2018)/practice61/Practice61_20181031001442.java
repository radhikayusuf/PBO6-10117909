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
        ((Bola) bangunRuang).setJariJari(14);
        System.out.println("Hasil : V Bola\t\t= " + ((Bola) bangunRuang).hitungVolume());
        
        
        bangunRuang = new Tabung();
        ((Tabung) bangunRuang).setTinggi(16);
        ((Tabung) bangunRuang).setJariJari(7);        
        System.out.println("Hasil : V Tabung\t= " + ((Tabung) bangunRuang).hitungVolume());
        
        bangunRuang = new Kerucut();
        ((Kerucut) bangunRuang).setJariJari(14);
        ((Kerucut) bangunRuang).setTinggi(9);
        System.out.println("Hasil : V Kerucut\t= " +((Kerucut) bangunRuang).hitungVolume() );
    }
    
}