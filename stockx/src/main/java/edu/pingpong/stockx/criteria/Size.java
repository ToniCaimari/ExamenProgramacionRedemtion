package edu.pingpong.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import java.util.ArrayList;

public class Size implements Criteria {
    private List<Offer> sameSize = new ArrayList<>();
    private String size;
    Criteria sizes = new Size(size);

    public Size(String size) {
        this.size = size;
    };

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> sameSize = sneaker.offers().stream().filter(a -> a.size().equals(this.size))
                .collect(Collectors.toList());
        return sameSize;
    }

}
