class Mahasiswa{

    public String nim;
    public String nama;    

    public Mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }


    public void perkenalkanDiri(){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name ".concat(nama));
        System.out.println();
    }
}