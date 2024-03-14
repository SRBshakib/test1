
package mainpkg;

public class Sword extends Weapon{
    private boolean isDoubleEdged;

    public Sword(boolean isDoubleEdged, String model, float unitPrice) {
        super(model, unitPrice);
        this.isDoubleEdged = isDoubleEdged;
    }

    public boolean isIsDoubleEdged() {
        return isDoubleEdged;
    }

    public void setIsDoubleEdged(boolean isDoubleEdged) {
        this.isDoubleEdged = isDoubleEdged;
    }

    @Override
    public String toString() {
        return "Sword{" + "model=" + model + ", unitPrice=" + unitPrice + "isDoubleEdged=" + isDoubleEdged + '}';
    }
    @Override
    public void overHaul(){
        System.out.println("Sword is overhauled...");
    }
    
}
