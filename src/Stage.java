public abstract class Stage {
    protected int length;
    protected String description;
    protected int count = 0;
    public String getDescription() {
        return description;
    }
    public abstract void go(Car c);
}

