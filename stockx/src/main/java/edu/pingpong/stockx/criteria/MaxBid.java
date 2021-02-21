package edu.pingpong.stockx.criteria;

import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import java.util.List;
import java.util.stream.Collectors;

public class MaxBid implements Criteria {
    private static final List<Offer> maxBid = null;
    Bids bids;

    public MaxBid() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return maxBid;
    }

}
