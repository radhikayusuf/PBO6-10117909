/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program PERKENALAN MAHASISWA!
 *
 */

class Practice31 {

    public static void main(String[] args){

        Mahasiswa mhs1 = new Mahasiswa("10117909", "Radhika Yusuf Alifiansyah");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa("10117910", "Budi Lorem ipsum");
        mhs2.perkenalkanDiri();
        
        Mahasiswa mhs3 = new Mahasiswa("10117911", "Jake Wharton");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa("10117912", "Steve Jobs");
        mhs4.perkenalkanDiri();

    }

}