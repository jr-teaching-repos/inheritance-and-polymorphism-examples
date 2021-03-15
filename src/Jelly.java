public class Jelly extends Ingredient {

    private String brand;
    private String flavor;

    public Jelly(boolean requiresRefrigeration, boolean isExpired, String brand, String flavor) {
        super(requiresRefrigeration, isExpired);
        this.brand = brand;
        this.flavor = flavor;
    }

    public void openJar() {
        System.out.println("Opening jar...");
    }

    public void checkIfLidPopped() {
        System.out.println("Checking lid...");
    }

    @Override
    public void throwAway() {
        System.out.println("Throwing away jelly...");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

}
