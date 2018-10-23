import java.util.Scanner;


/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Gaji Pegawai
 *
 */
public class Practice43 {

    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        Scanner numberScanner = new Scanner(System.in);
        GajiPegawai gaji = new GajiPegawai();
        
        System.out.println("### Data Gaji Karyawan PT. PETEAN");
        System.out.println("-----------------------");                        
        System.out.print("Nama\t\t: ");gaji.setNama(textScanner.nextLine());
        System.out.print("Alamat\t\t: ");gaji.setAlamat(textScanner.nextLine());
        System.out.print("Uang Transport\t: ");gaji.setUangTransport(numberScanner.nextInt());
        System.out.print("Uang Tunjangan\t: ");gaji.setUangTunjangan(numberScanner.nextInt());
        System.out.print("Gaji Pokok\t: ");gaji.setGajiPokok(numberScanner.nextInt());
        
        gaji.setTotalGaji(gaji.totalGaji(gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok()));
        System.out.println("");
        gaji.tampilData(gaji.getNama(), gaji.getAlamat(), gaji.getUangTunjangan(), gaji.getUangTransport(), gaji.getGajiPokok(), gaji.getTotalGaji());
    }
    
}
