class Kalkulator{

    public int value1;
    public int value2;

    public Kalkulator(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }


    public void tambahBilangan(){
        System.out.println("Hasil Pertambahan\t: ".concat(String.valueOf(value1 + value2)));
    }

    public void kurangBilangan(){
        System.out.println("Hasil Perkurangan\t: ".concat(String.valueOf(value1 - value2)));
    }

    public void kaliBilangan(){
        System.out.println("Hasil Perkalian\t\t: ".concat(String.valueOf(value1 * value2)));
    }

    public void bagiBilangan(){
        System.out.println("Hasil Pembagian\t\t: ".concat(String.valueOf(value1 / value2)));
    }

    public void sisaBilangan(){
        System.out.println("Hasil Sisa\t\t: ".concat(String.valueOf(value1 % value2)));
    }


}