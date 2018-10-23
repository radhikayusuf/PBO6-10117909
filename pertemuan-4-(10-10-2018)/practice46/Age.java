public class Age {
    private int yearBirth, yearNow;
    private static final String RED = "\033[31;10;1m";
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur){
        if (umur >= 0 && umur <=5){
           return RED +"LAGI LUCU-LUCU NYA";
        } else if(umur <= 10){
           return RED +"MASIH ANAK-ANAK";
        } else if(umur <= 13){
           return RED +"MASIH REMADJA";
        } else if(umur <= 19){
           return RED +"ALAY";
        } else if(umur <= 29){
           return RED +"LAGI GALAU NYARI JODOH";
        } else if(umur <= 35){
           return RED +"LAGI SIBUK NYARI UANG";
        } else if(umur <= 150){
           return RED +"SUDAH TUA";
        } else {
           return RED +"TIDAK TERDETEKSI KEHIDUPAN"; 
        }
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }

    public void setYearNow(int yearNow) {
        this.yearNow = yearNow;
    }
    
    
}