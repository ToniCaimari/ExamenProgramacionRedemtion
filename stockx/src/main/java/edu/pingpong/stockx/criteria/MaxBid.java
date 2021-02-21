package edu.pingpong.stockx.criteria;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MaxBid implements Criteria {
    private List<Offer> maxBid = new ArrayList<>();
    Criteria bids = new Bids();

    public MaxBid() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Offer maximumBid = bids.checkCriteria(sneaker).stream().filter(a -> a != null)
                .max(Comparator.comparing(a -> a.value())).orElse(null);
        maxBid.add(maximumBid);

        return maxBid;
    }

}
