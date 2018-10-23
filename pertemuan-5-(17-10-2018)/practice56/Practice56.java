/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Barang antik
 *
 */
public class Practice56 {
    
    public static void main(String[] args) {                       
        Radio r = new Radio(200);
        r.setName("Radio Lama");
        System.out.println("Nama barang antik : " + r.getName());
        r.tampilUmur();
    }
    
}