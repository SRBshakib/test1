package mainpkg;

public class Pistol extends Weapon{
    private int magazineCapacity;

    public Pistol() {
    }

    public Pistol(int magazineCapacity, String model, float unitPrice) {
        super(model, unitPrice);
        this.magazineCapacity = magazineCapacity;
    }

    public int getMagazineCapacity() {
        return magazineCapacity;
    }

    public void setMagazineCapacity(int magazineCapacity) {
        this.magazineCapacity = magazineCapacity;
    }

    @Override
    public String toString() {
        return "Pistol{"  + "model=" + model + ", unitPrice=" + unitPrice + "magazineCapacity=" + magazineCapacity + '}';
    }

    @Override
    public void overHaul(){
        System.out.println("Pistol is overhauled...");
    }

   
}
