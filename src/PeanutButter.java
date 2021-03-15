public class PeanutButter extends Ingredient {

    private boolean isCrunchy;
    private boolean isOrganic;

    public PeanutButter(boolean requiresRefrigeration, boolean isExpired, boolean isCrunchy, boolean isOrganic) {
        super(requiresRefrigeration, isExpired);
        this.isCrunchy = isCrunchy;
        this.isOrganic = isOrganic;
    }

    public void mixInOil() {
        System.out.println("Mixing in oil...");
    }

    public void addChocolate() {
        System.out.println("Adding chocolate because why not??");
    }

    public boolean isCrunchy() {
        return isCrunchy;
    }

    public void setCrunchy(boolean crunchy) {
        isCrunchy = crunchy;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

}
