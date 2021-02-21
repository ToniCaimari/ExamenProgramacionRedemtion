package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class AndCriteria implements Criteria {
    private List<Offer> newCriteria = new ArrayList<>();
    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        newCriteria = sneaker.offers().stream()
                .filter(a -> a.this.criteria.equals(this.criteria) && a -> a.this.criteria.equals(this.otherCriteria))
                .orElse(null);
        return newCriteria;
        return null;
    }
}
