/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program RATA RATA NILAI
 *
 */

import java.util.Scanner;

class Practice37 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan banyak mahasiswa : ");    
        int jumlah = scanner.nextInt();

        Penilaian penilaian = new Penilaian(jumlah);

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai Mahasiswa ke-"+ (i+1) + " : ");    
            penilaian.setNilai(i, scanner.nextInt());
        }

        penilaian.averagePenilaian();

    }


}