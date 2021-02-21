package edu.pingpong.stockx.item;

public class Bid implements Offer {
    private String size = "";
    private Integer bid = 0;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.bid;
    }

    // @Override
    // public int compareTo(Offer offer) {

    // return 0;
    // }

    @Override
    public String toString() {
        return "\n\t\t" + size() + "\t\t" + Integer.toString(value());
    }
}
/**/
