/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program LINGKARAN
 *
 */

import java.util.Scanner;
import java.util.InputMismatchException;

class Practice38 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int diameter = 0;

        System.out.println("\n=============== Perhitungan Lingkaran ===============");

        do {
            try {                
                System.out.print("\nMasukan Nilai diameter Lingkaran : ");
                diameter = scanner.nextInt();
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter tidak sesuai\n");                                          
                scanner = new Scanner(System.in);
            }      
        } while (!valid);


        Circle cirlce = new Circle(diameter);
        cirlce.printResult();

    }


}