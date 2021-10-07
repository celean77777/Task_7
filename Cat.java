package model;

public class Cat {
    private String name;
    private int appetite;
    private boolean sotiety;

    public Cat(String name, int appetite, boolean sotiety) {
        this.name = name;
        this.appetite = appetite;
        this.sotiety = sotiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSotiety() {
        return sotiety;
    }

    public void setSotiety(boolean sotiety) {
        this.sotiety = sotiety;
    }
}
