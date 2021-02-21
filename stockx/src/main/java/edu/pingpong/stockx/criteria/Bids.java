package edu.pingpong.stockx.criteria;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Bid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {
    private List<Offer> allBids = new ArrayList<>();

    public Bids() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        allBids = sneaker.offers().stream().filter(a -> a instanceof Bid).filter(a -> a != null)
                .collect(Collectors.toList());
        return allBids; /**
                         * Codigo copiado de Berta intentando entender lo que hace [creamos "allBids"
                         * que es una lista resultado de aplicar un stream a la lista offers de sneaker
                         * (donde están todos los productos) y de filtrar aquellos que sean Bid y no
                         * sean null]
                         */
    }

}
