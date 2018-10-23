public class Android extends Handphone {
    
    private String keyStore;

    public Android(String manufacture, String operatingSystem, String model, int harga, String keyStore) {
        super(manufacture, operatingSystem, model, harga);
        this.keyStore = keyStore;
    }

    public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }

    @Override
    public void displayProduct() {
        super.displayProduct(); 
        System.out.println("Android Key Store\t: " + keyStore);
    }                
            
}