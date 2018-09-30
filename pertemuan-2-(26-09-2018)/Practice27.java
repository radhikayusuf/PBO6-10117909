import java.util.Scanner;

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Huruf besar kecil
 *
 */


class Practice27 {

    public static void main(String[] args){            
        Scanner scanner = new Scanner(System.in);
        String sentence;

        System.out.print("Masukan Kalimat\t: ");
        sentence =  scanner.nextLine();
        
        System.out.println("\nHuruf Besar : ".concat(sentence.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(sentence.toLowerCase()));
    }


}