import java.util.Scanner;


/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Tunjangan
 *
 */


class Practice17 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double gaji;
        boolean isMarried = false;

        System.out.println("=============== Program Tunjangan ===============");
        System.out.print("Berapa gaji pokok anda perbulan?\t: ");
        gaji = Double.parseDouble(scanner.nextLine());
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        isMarried = (scanner.nextLine()).equalsIgnoreCase("menikah");
        

        System.out.println("\n\n========= Hasil Penghitungan Gaji Anda ==========");
        System.out.println("Gaji Pokok\t\t\t: Rp ".concat(String.valueOf(gaji)));
        System.out.println("Tunjangan\t\t\t: Rp ".concat(String.valueOf(gaji * (isMarried ? 0.35 : 0) )));
        System.out.println("Total Gaji\t\t\t: Rp ".concat(String.valueOf(gaji + (gaji * (isMarried ? 0.35 : 0)) )));
        System.out.println("\n\n");
        System.out.println("Radhika Yusuf © 2018");
    }    

}
    