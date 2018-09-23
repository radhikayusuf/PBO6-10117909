
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Penugasan
 *
 */


class Practice16 {

    public static void main(String[] args){

        int valueOfA = 10;
        int valueOfB = 20;
        int valueOfC = 0;

        System.out.printf("a = %d\r\n", valueOfA);
        System.out.printf("b = %d\r\n", valueOfB);
        System.out.printf("c = %d\r\n\r\n", valueOfC);

        valueOfC = valueOfA + valueOfB;
        System.out.printf("c = a + b = %d\r\n", valueOfC);

        valueOfC += valueOfA;
        System.out.printf("c += a = %d\r\n", valueOfC);

        valueOfC -= valueOfA;
        System.out.printf("c -= a = %d\r\n", valueOfC);

        valueOfC *= valueOfA;
        System.out.printf("c *= a = %d\r\n", valueOfC);

        valueOfA = 10;
        valueOfC = 15;
        valueOfC /= valueOfA;
        System.out.printf("c /= a = %d\r\n", valueOfC);

        valueOfC = 15;
        valueOfC %= valueOfA;
        System.out.printf("c %%= a = %d\r\n", valueOfC);

        valueOfC <<= 2;
        System.out.printf("c <<= 2 = %d\r\n", valueOfC);

        valueOfC >>= 2;
        System.out.printf("c >>= 2 = %d\r\n", valueOfC);

        valueOfC >>= valueOfA;
        System.out.printf("c >>= a = %d\r\n", valueOfC);

        valueOfC &= valueOfA;
        System.out.printf("c &= a = %d\r\n", valueOfC);

        valueOfC ^= valueOfA;
        System.out.printf("c ^= a = %d\r\n", valueOfC);

        valueOfC |= valueOfA;
        System.out.printf("c |= a = %d\r\n", valueOfC);
    }

}
    