public class Blackberry extends Handphone{
    
    private String pinBB;

    public Blackberry(String manufacture, String operatingSystem, String model, int harga, String pinBB) {
        super(manufacture, operatingSystem, model, harga);
        this.pinBB = pinBB;
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }

    @Override
    public void displayProduct() {
        super.displayProduct();
        System.out.println("PIN\t: " + pinBB);
    }
    
    

    
    
    
}