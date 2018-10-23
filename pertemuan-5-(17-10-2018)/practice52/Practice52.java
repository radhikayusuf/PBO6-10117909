/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Mahasiswa dan Dosen
 *
 */
public class Practice52 {

    public static void main(String[] args) {                       
        Manusia dosen = new Dosen();
        dosen.setNama("Radhika");
        dosen.setUmur(19);
        ((Dosen) dosen).setNip("101231231");
        ((Dosen) dosen).setMataKuliah("Android");
        ((Dosen) dosen).mengajarApa();
        
        System.out.println("");
        
        Manusia mahasiswa = new Mahasiswa();
        mahasiswa.setNama("Yusuf");
        mahasiswa.setUmur(19);
        ((Mahasiswa) mahasiswa).setNim("101231231");
        ((Mahasiswa) mahasiswa).setKelas("PBO");
        ((Mahasiswa) mahasiswa).kelasApa();
        
    }
    
}