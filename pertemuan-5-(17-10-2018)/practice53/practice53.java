/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Kelinci
 *
 */
public class Practice53 {

    public static void main(String[] args) {                       
        Rabbit rabbit = new Rabbit(true, "grass", 4, "white", "Lulu");
        System.out.println(
            "Hello, His name is " + rabbit.getName() + "\n"+
            rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian() + "\n"+
            rabbit.getName() + " eats " + rabbit.getEats()+ "\n"+
            rabbit.getName() + " has " + rabbit.getNoOfLegs()+ " Legs." + "\n"+
            rabbit.getName() + " color is " + rabbit.getColor()
        );
    }
    
}
