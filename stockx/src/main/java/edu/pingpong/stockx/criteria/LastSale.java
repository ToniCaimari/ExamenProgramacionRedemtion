package edu.pingpong.stockx.criteria;

import java.util.ArrayList;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

import java.util.List;

public class LastSale implements Criteria {
    private List<Offer> last = new ArrayList<>();
    Criteria sales = new Sales();

    public LastSale() {
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Offer lastOne = sales.checkCriteria(sneaker).stream().reduce((first, second) -> second).orElse(null);
        last.add(lastOne);
        return last;
    }

}
