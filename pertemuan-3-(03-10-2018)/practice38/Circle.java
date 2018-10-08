class Circle {

    public static final double PHI = 3.14159;

    private int diameter;

    public Circle(int diameter){
        this.diameter = diameter;
    }

    public double getJariJari(){
        return diameter/2;
    }

    public double getKelilingLingkaran(){
        return PHI * diameter;
    }

    public double getLuasLingkaran(){
        return PHI * (getJariJari() * getJariJari());
    }


    public void printResult(){
        System.out.println("\n=========== Hasil Perhitungan Lingkaran =============");
        System.out.println("Jari jari Lingkaran\t: ".concat(String.valueOf(getJariJari())));
        System.out.printf("Luas Lingkaran\t\t: %.2f\n", getLuasLingkaran());        
        System.out.printf("Keliling Lingkaran\t: %.2f\n", getKelilingLingkaran());
    }

}