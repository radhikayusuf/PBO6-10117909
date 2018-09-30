import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Waktu saat ini
 *
 */


class Practice26 {

    public static void main(String[] args){        
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy hh:mm:ss");
        System.out.println(sdf.format(new Date()));        
    }


}