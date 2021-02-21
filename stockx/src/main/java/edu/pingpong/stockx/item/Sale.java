package edu.pingpong.stockx.item;

public class Sale implements Offer {
    private String size = "";
    private int ask = 0;

    public Sale(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    public String size() {
        return this.size;
    }

    public int value() {
        return this.ask;
    }
    /**
     * public int compareTo(Offer offer){
     * 
     * }
     */
    /**
     * @Override public String toString(){ System.out.println(); }
     */
    // @Override
    // public int compareTo(Offer offer) {
    // // TODO Auto-generated method stub
    // return 0;
    // }
}
