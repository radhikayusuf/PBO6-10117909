public class WindowsPhone extends Handphone{
    private String wpKeyStore;

    public WindowsPhone(String manufacture, String operatingSystem, String model, int harga, String wpKeyStore) {
        super(manufacture, operatingSystem, model, harga);
        this.wpKeyStore = wpKeyStore;
    }

    public String getWpKeyStore() {
        return wpKeyStore;
    }

    public void setWpKeyStore(String wpKeyStore) {
        this.wpKeyStore = wpKeyStore;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("Wp Key Store\t: " + wpKeyStore);
    }

    
}