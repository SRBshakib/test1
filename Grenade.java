package mainpkg;


public class Grenade extends Weapon{
    private float blastRadius;

    public Grenade() {
    }

    public Grenade(float blastRadius, String model, float unitPrice) {
        super(model, unitPrice);
        this.blastRadius = blastRadius;
    }

    public float getBlastRadius() {
        return blastRadius;
    }

    public void setBlastRadius(float blastRadius) {
        this.blastRadius = blastRadius;
    }

    @Override
    public String toString() {
        return "Grenade{" +  "model=" + model + ", unitPrice=" + unitPrice + "blastRadius=" + blastRadius + '}';
    }
    
    @Override
    public void overHaul(){
        System.out.println("Grenade is overhauled...");
    }    
}
