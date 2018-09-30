import java.util.Scanner;

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Tunjangan
 *
 */


class Practice21 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mahasiswaCount = 0;
        double total = 0.0;
        int[] nilaiMahasiswa;

        System.out.print("Masukan Banyaknya Mahasiswa\t: ");
        mahasiswaCount = scanner.nextInt();

        nilaiMahasiswa = new int[mahasiswaCount];
    
        for(int i = 0; i < mahasiswaCount; i+=1){
            System.out.print(
                "Nilai Mahasiswa ke-"
                .concat(String.valueOf(i + 1))
                .concat(" : ")
            );
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        for (int nilai : nilaiMahasiswa){
            total += nilai;
        }      
        
        double result = total / nilaiMahasiswa.length;
        System.out.printf("\n\nMaka, rata-rata Nilainya adalah %.1f \n", result);
    }

}