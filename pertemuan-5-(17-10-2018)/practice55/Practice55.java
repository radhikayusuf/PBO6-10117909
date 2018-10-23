/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program handphone
 *
 */
public class Practice55 {

    public static void main(String[] args) {                       
        Android android = new Android("Samsung", "Android", "Grand", 500000, "23jkl132h4");
        android.displayProduct();
        
        Blackberry blackberry = new Blackberry("BlackBerry", "RIM", "Curve", 300000, "7231DAC21");
        blackberry.displayProduct();
        
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8.1", "Lumia", 240000, "UUQWEJDK23");
        windowsPhone.displayProduct();
    }
    
}


