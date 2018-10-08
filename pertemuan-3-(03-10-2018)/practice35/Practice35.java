/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program TUNJANGAN
 *
 */

import java.util.Scanner;

class Practice35 {

    public static String DEFAULT_POSITIF_ANSWER = "Menikah";

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Scanner scannerText = new Scanner(System.in);

        System.out.println("===== Program Tunjangan =====");
        System.out.print("Berapa Gaji Pokok anda perbulan?\t: ");
        double gaji = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        String status = scannerText.nextLine();        

        Payslip payslip = new Payslip(gaji, status.equalsIgnoreCase(DEFAULT_POSITIF_ANSWER));
        payslip.calculateSalary();
    }


}