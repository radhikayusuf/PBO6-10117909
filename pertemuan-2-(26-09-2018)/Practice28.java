import java.util.Scanner;

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Ganti kata
 *
 */


class Practice28 {

    public static void main(String[] args){            
        Scanner scanner = new Scanner(System.in);
        String sentence, oldWord, newWord;

        System.out.print("Masukan Kalimat\t: ");
        sentence =  scanner.nextLine();
        
        System.out.print("Ganti kata : ");
        oldWord =  scanner.nextLine();

        System.out.print("Menjadi kata : ");
        newWord =  scanner.nextLine();

        System.out.println("\n\n====================== Hasil Formatting ======================");
        System.out.println("Kalimat Awal\t: ".concat(sentence));
        System.out.println("Kalimat Akhir\t: ".concat(sentence.replaceAll(oldWord,newWord)));


    }


}