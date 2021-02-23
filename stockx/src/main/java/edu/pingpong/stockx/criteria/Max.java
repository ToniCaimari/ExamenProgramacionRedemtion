package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;




import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

public class Max implements Criteria {
    private List<Offer> max= new ArrayList<>();
    private Criteria criteria;
    private Criteria otherCriteria;

    public Max(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Criteria newCriteria = new AndCriteria(criteria, otherCriteria);

        List<Offer> andCriteriaList = newCriteria.checkCriteria(sneaker);
        
        Offer maxOffer=  andCriteriaList.stream().max(Comparator.comparing(n -> n.value())).orElse(null);
        max.add(maxOffer);
        return max;
    }
}