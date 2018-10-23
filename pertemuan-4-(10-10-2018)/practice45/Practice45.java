import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Printer
 *
 */
public class Practice45 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        
        Printer printer = new Printer();
        System.out.print("Masukan nama anda\t\t: ");
        printer.setNama(scanner.nextLine());
        System.out.print("Mau cetak nama berapa kali?\t: ");
        printer.setJmlCetak(scannerNumber.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
                
    }
    
}