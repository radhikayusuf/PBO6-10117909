/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program NILAI TERBESAR DAN TERKECIL
 *
 */

import java.util.Scanner;

class Practice39 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =======");
        System.out.print("Masukan nama petugas\t\t\t: ");
        String name = scanner.nextLine();

        System.out.print("Masukan banyaknya nilai Mahasiswa\t: ");    
        int jumlah = scanner.nextInt();

        Penilaian penilaian = new Penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        System.out.println();
        System.out.println("======= Hasil Nilai Mahasiswa =======");


        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai Mahasiswa ke-"+ (i+1) + " = " + penilaian.getNilai(i));                
        }


        System.out.println();
        System.out.println("Nilai Terbesar " + penilaian.max());
        System.out.println("Nilai Terkecil " + penilaian.min());
        System.out.println();
        System.out.println("Petugas : " + name);
        

    }


}