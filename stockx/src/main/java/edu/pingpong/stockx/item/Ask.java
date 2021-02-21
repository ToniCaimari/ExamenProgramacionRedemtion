package edu.pingpong.stockx.item;

public class Ask implements Offer {
    private String size = "";
    private int ask = 0;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.ask;
    }

    @Override
    public String toString() {
        return "\n\t\t" + size() + "\t\t" + Integer.toString(value());
    }

    // @Override
    // public int compareTo(Offer offer) {
    // // TODO Auto-generated method stub
    // return 0;
    // }
}
