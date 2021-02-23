package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Offer> firstCriteria = criteria.checkCriteria(sneaker);
        List<Offer> secondCriteria = otherCriteria.checkCriteria(sneaker);
        List<Offer> andCriteria = new ArrayList<Offer>();

        andCriteria = firstCriteria.stream()
                .filter(x -> (secondCriteria.stream().filter(n -> n.equals(x)).count()) >= 1)
                .collect(Collectors.toList()); // código copiado a Carlos Franco intentando entender (de momento no lo
                                               // entiendo del todo)

        return andCriteria;
    }
}
