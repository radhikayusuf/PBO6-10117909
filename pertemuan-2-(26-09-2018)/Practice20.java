import java.lang.StringBuilder; 

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Target Saldo Tabungan
 *
 */


class Practice20 {

    public static void main(String[] args){        
        int saldoAwal = 3500000, index = 0;
        double bankInterest = 0.08;
        
        do{
            index += 1;
            saldoAwal += saldoAwal * bankInterest;
            System.out.printf(
                "Saldo di bulan ke-"
                .concat(String.valueOf(index))
                .concat(" Rp.")
                .concat(String.valueOf("%,d\r\n")), 
                saldoAwal);

        } while (saldoAwal < 6000000);

    }

}
    