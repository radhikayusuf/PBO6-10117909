import java.lang.StringBuilder; 

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Saldo Tabungan
 *
 */


class Practice19 {

    public static void main(String[] args){        
        int saldoAwal = 2500000, month = 6;
        double bankInterest = 0.15;

        for (int i = 1; i<=month; i++){
            saldoAwal += saldoAwal * bankInterest;
            System.out.printf(
                "Saldo di bulan ke-"
                .concat(String.valueOf(i))
                .concat(" Rp.")
                .concat(String.valueOf("%,d\r\n")), 
                saldoAwal);
        }

    }

}
    