import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Perbandingan 2 buah nilai
 *
 */


class Practice24 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        
        int valueA, valueB;

        System.out.println("\n======== Program Perbandungan Nilai ========\n\n");
        System.out.print("Masukan Nilai Pertama\t: ");
        valueA = scanner.nextInt();
        System.out.print("Masukan Nilai Kedua\t: ");
        valueB = scanner.nextInt();

        System.out.println( 
            "\n\nHasil : "
            .concat(String.valueOf(valueA))
            .concat((valueA == valueB ? " Sama dengan " : (valueA > valueB ? " Lebih besar dari " : " Lebih kecil dari ")))
            .concat(String.valueOf(valueB))
         );


    }


}