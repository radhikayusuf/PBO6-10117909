
/*
 *
 * @author
 * NAMA 	: Radhika Yusuf
 * KELAS	: PBO6
 * NIM		: 10117909
 * 
 * Description : Kambing (GLobal Var)
 *
 */



class Practice5{

    private int jumlahKambing = 28;

    public static void main(String[] args){
        Practice5 globalVar = new Practice5();
        globalVar.getJumlahKambing();
        globalVar.tambahKambing();
        globalVar.getJumlahKambing();

    }



    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing\t\t\t\t: " + jumlahKambing);
    }

    public void tambahKambing(){
        jumlahKambing += 5;
        System.out.println("Jumlah Kambing setelah di tambahkan\t: " + jumlahKambing);
    }

}