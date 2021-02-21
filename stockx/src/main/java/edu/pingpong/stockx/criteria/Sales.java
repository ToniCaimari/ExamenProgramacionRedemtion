package edu.pingpong.stockx.criteria;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria {
    private List<Offer> allSales = new ArrayList<>();

    public Sales() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        allSales = sneaker.offers().stream().filter(a -> a instanceof Sale).filter(a -> a != null)
                .collect(Collectors.toList());
        return allSales;

    }

}
