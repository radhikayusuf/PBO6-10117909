class User {

    private static final String USERNAME = "RadhikaYusuf";
    private static final String PASSWORD = "selaluterbaik";

    private boolean statusAkun;


    public void pengecekanLogin(String username, String password){
        hasilLogin(cekAkun(username, password), username);
    }


    private boolean cekAkun(String username, String password){
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }

    private void hasilLogin(boolean status, String username){
        System.out.println();
        if (status) {
            System.out.println(("*******HALLO " .concat(username).concat("*******")).toUpperCase());
            System.out.println("Selamat datang di aplikasi ini");
        } else {
            System.out.println("Oooops, Username atau password anda salah");
        }
    }

}