package mainpkg;

public abstract class Weapon {
    
    protected String model;
    protected float unitPrice;
    
    public abstract void overHaul();

    public Weapon() {
    }

    public Weapon(String model, float unitPrice) {
        this.model = model;
        this.unitPrice = unitPrice;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Weapon{" + "model=" + model + ", unitPrice=" + unitPrice + '}';
    }
    
    
 
}
