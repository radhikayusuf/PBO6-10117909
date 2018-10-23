public class Handphone {

    protected String manufacture, operatingSystem, model;
    protected int harga;

    public Handphone(String manufacture, String operatingSystem, String model, int harga) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.harga = harga;
    }
    
    public void displayProduct(){
        System.out.println("");
        System.out.println("Manufacture\t: " + manufacture);
        System.out.println("OS\t\t: " + operatingSystem);
        System.out.println("Model\t\t: " + model);
        System.out.println("Harga\t\t: " + harga);
    }
    
    
    
}