/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Gaji Karyawan
 *
 */
public class Practice51 {

    public static void main(String[] args) {                       
        Scanner scannerText = new Scanner(System.in);
        Scanner scannerNumber = new Scanner(System.in);
        Manager m = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK\t\t\t: ");m.setNik(scannerText.nextLine());
        System.out.print("Masukkan Nama\t\t\t: ");m.setNama(scannerText.nextLine());
        System.out.print("Masukkan Golongan\t\t: ");m.setGolongan(scannerNumber.nextInt());
        System.out.print("Masukkan Jabatan\t\t: ");m.setJabatan(scannerText.nextLine());
        System.out.print("Masukkan Jumlah Kehadiran\t: ");m.setKehadiran(scannerNumber.nextInt());
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t\t\t: "+ m.getNik());
        System.out.println("NAMA\t\t\t: "+  m.getNama());
        System.out.println("GOLONGAN\t\t: "+  m.getGolongan());
        System.out.println("JABATAN\t\t\t: " +  m.getJabatan());        ;
        System.out.println("\nTUNJANGAN GOLONGAN\t: " + m.tunjanganGolongan(m.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t: " + m.tunjanganJabatan(m.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t: " + m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("\nGAJI TOTAL\t\t: " + m.gajiTotal());
    
    }
    
}