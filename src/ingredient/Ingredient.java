package ingredient;

public class Ingredient {
    private boolean requiresRefrigeration;
    private boolean isExpired;
    protected int calories;

    public Ingredient(boolean requiresRefrigeration, boolean isExpired) {
        this.requiresRefrigeration = requiresRefrigeration;
        this.isExpired = isExpired;
    }

    public void addWater() {
        System.out.println("Adding water to ingredient...");
    }

    public void applyHeat() {
        System.out.println("Applying heat to ingredient...");
    }

    public void throwAway() {
        System.out.println("Throwing away ingredient...");
    }

    public boolean isRequiresRefrigeration() {
        return requiresRefrigeration;
    }

    public void setRequiresRefrigeration(boolean requiresRefrigeration) {
        this.requiresRefrigeration = requiresRefrigeration;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

}
