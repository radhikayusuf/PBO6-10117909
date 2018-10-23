public class Manager extends Karyawan {
    private int kehadiran;
    private int tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    
    public float tunjanganKehadiran(int hadir){
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan){        
        if(jabatan.equalsIgnoreCase("manager")){
            tunjanganJabatan = 2000000;
        } else if(jabatan.equalsIgnoreCase("kabag")){
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan(int golongan){
        if(golongan == 1){
            tunjanganGolongan = 500000;
        } else if(golongan == 2){
            tunjanganGolongan = 1000000;
        } else if(golongan == 3){
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }
    
    public float gajiTotal(){
        return tunjanganGolongan + tunjanganJabatan + tunjanganKehadiran;
    }
}