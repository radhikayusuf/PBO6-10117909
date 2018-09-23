
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Bit
 *
 */


class Practice14 {

    public static void main(String[] args){

        int valueOfA = 60; /* 0011 1100 */
		int valueOfB = 13; /* 0000 1101 */
		int valueOfC = 0;

		valueOfC = valueOfA & valueOfB;
		/* 12 = 0000 1100 */
        System.out.printf("a & b = %d\r\n", valueOfC);
        
		valueOfC = valueOfA | valueOfB;
		/* 61 = 0011 1101*/
		System.out.printf("a | b = %d\r\n", valueOfC);

		valueOfC = valueOfA ^ valueOfB;
		/* 49 = 0011 0001 */
		System.out.printf("a ^ b = %d\r\n", valueOfC);

		valueOfC = ~valueOfA;
		/* -61 = 1100 0011 */
		System.out.printf("~a = %d\r\n", valueOfC);

		valueOfC = valueOfA << 2;
		/* 240 = 1111 0000 */
		System.out.printf("a << 2 = %d\r\n", valueOfC);

		valueOfC = valueOfA >> 2;
		/* 15 = 0000 1111 */
		System.out.printf("a >> 2 = %d\r\n", valueOfC);
    }

}