/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program VEHICLE
 *
 */
public class Practice57 {
    
    public static void main(String[] args) {                       
        Bicycle bicycle = new Bicycle();
        System.out.println("Bicycle");
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println(
            "Brand\t\t: "+ bicycle.getMyBrand() +"\n"+
            "Model\t\t: "+ bicycle.getMyModel()+"\n"+
            "Jumlah Gear\t: "+ bicycle.getMyGearCount()+"\n"
        );
        
        System.out.println("");
        
        Skateboard skateboard = new Skateboard();
        System.out.println("Skateboard");
        skateboard.setMyBrand("Ally Skate");
        skateboard.setMyModel("Rocket");
        skateboard.setMyBoardLength(54.5);
        
        System.out.println(
            "Brand\t\t: "+ skateboard.getMyBrand() +"\n"+
            "Model\t\t: "+ skateboard.getMyModel()+"\n"+
            "Panjang Board\t: "+ skateboard.getMyBoardLength()+"\n"
        );
    }
    
}