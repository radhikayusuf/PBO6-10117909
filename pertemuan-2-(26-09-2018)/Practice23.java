import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Nilai Terbesar dan Terkecil
 *
 */


class Practice23 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);        
        String petugas = "";
        int mahasiswaCount = 0, index;
        int[] nilaiMahasiswa;

        System.out.println("\n==== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa ====\n\n");
        System.out.print("Masukan Nama Petugas\t\t\t: ");
        petugas = scanner.nextLine();

        System.out.print("Masukan Banyaknya Nilai Mahasiswa\t: ");
        mahasiswaCount = scanner.nextInt();
        nilaiMahasiswa = new int[mahasiswaCount];
        System.out.println();


        for (index = 0; index < mahasiswaCount; index++){
            System.out.print("Masukan Nilai Mahasiswa ke-".concat(String.valueOf(index+1)).concat(" = "));
            nilaiMahasiswa[index] = scanner.nextInt();
        }
        

        System.out.println("\n=================== Hasil Nilai Mahasiswa ===================\n\n");
        index = 0;
        for(int nilai : nilaiMahasiswa){
            System.out.println("Nilai Mahasiswa ke-".concat(String.valueOf(index+1)).concat(" = ").concat(String.valueOf(nilai)));
            index+=1;
        }

        System.out.println("\n");
        System.out.println("Nilai Terbesar adalah ".concat(String.valueOf(getMaxOrMinValue(nilaiMahasiswa, true))));
        System.out.println("Nilai Terkecil adalah ".concat(String.valueOf(getMaxOrMinValue(nilaiMahasiswa, false))));

        System.out.println("\n");
        System.out.println("Nama Petugas : ".concat(petugas));

    }


    public static int getMaxOrMinValue(int[] value, boolean isMax){
        int temp = 0;
        if (value.length != 0){            
            temp = value[0];
            for(int datum : value){
                if(isMax){
                    temp = datum > temp ? datum : temp;
                } else {
                    temp = datum < temp ? datum : temp;
                }
            }
            return temp;
        } else {
            return 0;
        }                  
    }

}