import java.util.Scanner;


/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Massa Jenis
 *
 */
public class Practice41 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Kubus kubus = new Kubus();
        
        
        System.out.println("=== Massa Jenis Kubus ===");
        System.out.print("Sisi \t: ");kubus.setSisi(s.nextInt());
        System.out.print("Massa \t: ");kubus.setMassa(s.nextInt());
        System.out.println("");
        
        System.out.println("=== Hasil Perhitungan ===");
        System.out.println("Volume\t\t: " + kubus.hitungVolume());
        System.out.println("Massa Jenis\t: " + kubus.hitungMassa());
    }
    
}
