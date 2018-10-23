
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Hukum OHM
 *
 */
public class Practice44 {

    public static void main(String[] args) {
        Baterai b = new Baterai();
        b= new Baterai(3, 12);               
        System.out.println("Kuat Arus\t: " + b.getKuatArus());
        System.out.println("Hambatan\t: " + b.getHambatan());
        System.out.println("Hasil Tegangan\t: " + b.hitungTegangan());
    }
    
}



        