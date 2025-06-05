package gettersetter;

public class Duck extends Animal {
    private boolean swim;

    @Override
    public void action() {
        System.out.println("DUck Action");
    }

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }
}
