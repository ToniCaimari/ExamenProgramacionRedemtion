package edu.pingpong.stockx.criteria;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria {
    private List<Offer> minAsk = new ArrayList<>();
    Criteria asks = new Asks();

    public MinAsk() {
    }

    @Override

    public List<Offer> checkCriteria(Item sneaker) {
        Offer minimumAsk = asks.checkCriteria(sneaker).stream().filter(a -> a != null)
                .min(Comparator.comparing(a -> a.value())).orElse(null);
        minAsk.add(minimumAsk);

        return minAsk;
    }

}
