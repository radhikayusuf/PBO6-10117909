import java.util.Scanner;
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Program Kalkulator
 *
 */
public class Practice48 {

    public static void main(String[] args) {       
        Scanner scannerNumber = new Scanner(System.in);
        Kalkulator k = new Kalkulator();
        System.out.print("Value 1\t\t= ");k.setValue1(scannerNumber.nextDouble());
        System.out.print("Value 2\t\t= ");k.setValue2(scannerNumber.nextDouble());
        k.setNameProject();
        k.setNoteProject("This Project shown you how to manage method in java");
        System.out.println("Result Add is\t\t= " + k.add(k.getValue1(), k.getValue2()));
        System.out.println("Result Min is\t\t= " + k.minus(k.getValue1(), k.getValue2()));
        System.out.println("Result Multiple is\t= " + k.multiplication(k.getValue1(), k.getValue2()));
        System.out.println("Result Division is\t= " + k.division(k.getValue1(), k.getValue2()));
                      
    }
    
}