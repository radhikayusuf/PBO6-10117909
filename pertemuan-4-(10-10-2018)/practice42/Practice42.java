import java.util.Scanner;


/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Penarikan Uang
 *
 */
public class Practice42 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Penarikan Uang");
        System.out.print("Masukan Saldo Awal\t\t: ");
        Tabungan tabungan = new Tabungan(s.nextInt());
        System.out.print("Jumlah Uang yang di ambil\t: ");      
        System.out.println("Saldo anda sekarang\t\t: " + tabungan.ambilUang(s.nextInt()));                              
    }
    
}
