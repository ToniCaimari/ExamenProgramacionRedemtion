package edu.pingpong.stockx.criteria;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Ask;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria {
    private List<Offer> allAsks = new ArrayList<>();

    public Asks() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        allAsks = sneaker.offers().stream().filter(a -> a instanceof Ask).filter(a -> a != null)
                .collect(Collectors.toList());
        return allAsks;
    }

}
