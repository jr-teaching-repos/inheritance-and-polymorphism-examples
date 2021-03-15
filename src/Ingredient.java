public class Ingredient {
    private boolean requiresRefrigeration;
    private boolean isExpired;

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
