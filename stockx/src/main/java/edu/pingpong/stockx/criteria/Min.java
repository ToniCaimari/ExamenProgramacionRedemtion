package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Min implements Criteria{
    private List<Offer> min= new ArrayList<>();
    private Criteria criteria;
    private Criteria otherCriteria;

    public Min(Criteria criteria, Criteria otherCriteria){
        this.criteria=criteria;
        this.otherCriteria=otherCriteria;
    }
    @Override
public List<Offer> checkCriteria(Item sneaker){
    Criteria newCriteria= new AndCriteria(criteria, otherCriteria);
    List<Offer> newCriteriaList= newCriteria.checkCriteria(sneaker);
    Offer minOffer= newCriteriaList.stream().min(Comparator.comparing(a->a.value())).orElse(null);
    min.add(minOffer);
    return min;
    
}
    
}
