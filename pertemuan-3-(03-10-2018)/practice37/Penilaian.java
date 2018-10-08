class Penilaian{

    private int[] nilai;


    public Penilaian(int banyakMahasiswa){
        nilai = new int[banyakMahasiswa];
    }

    public void setNilai(int index, int nilai){
        this.nilai[index] = nilai;
    }

    public void averagePenilaian(){
        System.out.println();
        System.out.println("Maka, Rata-rata Nilainya adalah " +averageValue());
    }


    private double averageValue(){
        int total = 0;
        for (int i : nilai) {
            total+=i;
        }

        return total/nilai.length;
    }
}