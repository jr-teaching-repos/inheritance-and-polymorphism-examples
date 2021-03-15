public class Knife extends KitchenTool{

    private boolean isSerrated;
    private double lengthOfBladeInInches;

    public Knife(int costInCents, boolean isClean, boolean isSerrated, double lengthOfBladeInInches) {
        super(costInCents, isClean);
        this.isSerrated = isSerrated;
        this.lengthOfBladeInInches = lengthOfBladeInInches;
    }

    public void sharpen() {
        System.out.println("Sharpening blade...");
    }

    public void cutSomething() {
        System.out.println("Cutting something with blade...");
    }

    public boolean isSerrated() {
        return isSerrated;
    }

    public void setSerrated(boolean serrated) {
        isSerrated = serrated;
    }

    public double getLengthOfBladeInInches() {
        return lengthOfBladeInInches;
    }

    public void setLengthOfBladeInInches(double lengthOfBladeInInches) {
        this.lengthOfBladeInInches = lengthOfBladeInInches;
    }

}
