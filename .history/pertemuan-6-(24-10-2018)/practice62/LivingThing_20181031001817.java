public abstract class LivingThing {

    public void walk(String nama) {
        System.out.println(nama.concat(" Sedang berjalan"));
    }

    public void breath(String nama) {
        System.out.println(nama.concat(" Bernafas"));
    }

    public void eat(String nama){
        System.out.println(nama.concat(" Makan"));
    }

}