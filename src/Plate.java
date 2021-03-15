public class Plate extends KitchenTool {

    private boolean isRound;
    private String color;

    public Plate(int costInCents, boolean isClean, boolean isRound, String color) {
        super(costInCents, isClean);
        this.isRound = isRound;
        this.color = color;
    }

    public void spin() {
        System.out.println("Spinning plate...");
    }

    public void breakPlate() {
        System.out.println("Breaking plate...");
    }

    public boolean isRound() {
        return isRound;
    }

    public void setRound(boolean round) {
        isRound = round;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
