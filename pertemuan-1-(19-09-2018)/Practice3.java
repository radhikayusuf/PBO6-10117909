import java.util.Scanner;

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Memasukan Nilai dari keyboard
 *
 */


class Practice3{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Masukan Nama anda\t: ");
        String name = scanner.nextLine();        

        System.out.println("Nama anda adalah\t: " + name);

    }    


}