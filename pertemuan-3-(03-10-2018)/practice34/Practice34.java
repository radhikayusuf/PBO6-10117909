/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program KALKULATOR
 *
 */

import java.util.Scanner;

class Practice34 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Aplikasi Kalkulator Bilangan =====");
        System.out.print("Masukan Angka ke-1\t: ");
        int value1 = scanner.nextInt();
        System.out.print("Masukan Angka ke-2\t: ");
        int value2 = scanner.nextInt();
        System.out.println();

        Kalkulator kal = new Kalkulator(value1, value2);
        kal.tambahBilangan();
        kal.kurangBilangan();
        kal.kaliBilangan();
        kal.bagiBilangan();
        kal.sisaBilangan();
    }


}