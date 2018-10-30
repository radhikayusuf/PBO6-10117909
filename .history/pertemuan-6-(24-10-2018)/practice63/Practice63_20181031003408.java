/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Gradient Garis Lurus
 *
 */
public class Practice63 {
    
    public static void main(String[] args) {    
        Koordinat k1 = new Koordinat(2, 5, 10, 7);
        Koordinat k2 = new Koordinat(5, 3, 1, 12);

        System.out.println("Garis yang melalui titik (2,10) dan (5,7) memiliki gradien sebesar " + k1.hitungGradien());
        System.out.println("Garis yang melalui titik (5,1) dan (3,12) memiliki gradien sebesar " + k2.hitungGradien());
    }
    
}
