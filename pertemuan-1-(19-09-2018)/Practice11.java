
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Formating
 *
 */


class Practice11 {

    public static void main(String[] args){
        int value = 3546764;
		int minusValue = -value;

		System.out.printf("value\t\t: %d\r\n", value);
		System.out.printf("%%d\t\t: %d\r\n", value);
		System.out.printf("%%10d\t\t: %10d\r\n", value);
		System.out.printf("%%+10d\t\t: %+10d\r\n", value);
		System.out.printf("%%+10d\t\t: %+10d\r\n", minusValue);
		System.out.printf("%%,10d\t\t: %,10d\r\n", value);
		System.out.printf("%%-10d\t\t: %-10d\r\n", value);

		double doubleValue = 56783765.923;

		System.out.printf("doubleValue\t: %f\r\n", doubleValue);
		System.out.printf("%%f\t\t: %f\r\n", doubleValue);
		System.out.printf("%%.2f\t\t: %.2f\r\n", doubleValue);
		System.out.printf("%%12.2f\t\t: %12.2f\r\n", doubleValue);
		System.out.printf("%%,12.2f\t\t: %,12.2f\r\n", doubleValue);
    }

}