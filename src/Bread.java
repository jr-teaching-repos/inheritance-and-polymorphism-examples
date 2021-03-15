public class Bread extends Ingredient {

    private boolean isWholeWheat;
    private int slicesLeftInLoaf;

    public Bread(boolean requiresRefrigeration, boolean isExpired, boolean isWholeWheat, int slicesLeftInLoaf) {
        super(requiresRefrigeration, isExpired);
        this.isWholeWheat = isWholeWheat;
        this.slicesLeftInLoaf = slicesLeftInLoaf;
    }

    public void removeHeel() {
        System.out.println("Removing heel from loaf...");
    }

    public void toastBread() {
        System.out.println("Toasting bread...");
    }

    @Override
    public void throwAway() {
        System.out.println("Throwing away bread...");
    }

    public boolean isWholeWheat() {
        return isWholeWheat;
    }

    public void setWholeWheat(boolean wholeWheat) {
        isWholeWheat = wholeWheat;
    }

    public int getSlicesLeftInLoaf() {
        return slicesLeftInLoaf;
    }

    public void setSlicesLeftInLoaf(int slicesLeftInLoaf) {
        this.slicesLeftInLoaf = slicesLeftInLoaf;
    }

}
