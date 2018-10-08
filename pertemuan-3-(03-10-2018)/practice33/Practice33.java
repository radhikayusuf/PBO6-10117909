/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program USER LOGIN
 *
 */

import java.util.Scanner;

class Practice33 {

    private static String usName;
    private static String passWord;

    public static void main(String[] args){    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Username\t: ");
        usName = scanner.nextLine();

        System.out.print("Masukan Password\t: ");
        passWord = scanner.nextLine();

        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }

}