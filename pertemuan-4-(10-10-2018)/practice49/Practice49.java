/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Beli Emas
 *
 */
public class Practice49 {

    public static void main(String[] args) {       
        BeliEmas be = new BeliEmas();
        be.setBeratEmas(15.7);
        be.setHargaSatuGram(570000);
        
        
        System.out.println("Total harga pembelian emas\t: "+be.hitungTotalPembayaran(be.getHargaSatuGram(), be.getBeratEmas()));       
    }
    
}