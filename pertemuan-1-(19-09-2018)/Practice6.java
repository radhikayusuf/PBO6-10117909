
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Kambing (Static Var & Constanta)
 *
 */

class Practice6 {

    public static final String NAMA_PEMILIK = "GGWP";

    public static void main(String[] args){
        Practice6StaticVar.jumlahKambing = 200;          
        
        System.out.println(NAMA_PEMILIK + " memiliki kambing sebanyak " + Practice6StaticVar.jumlahKambing);

    }
}

class Practice6StaticVar{
    public static int jumlahKambing;
}

