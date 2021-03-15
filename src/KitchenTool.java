public class KitchenTool {

    private int costInCents;
    private boolean isClean;

    public KitchenTool(int costInCents, boolean isClean) {
        this.costInCents = costInCents;
        this.isClean = isClean;
    }

    public void wash() {
        System.out.println("Washing tool...");
    }
    public void pickUp() {
        System.out.println("Picking up tool...");
    }

    public int getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

}
