package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import edu.pingpong.stockx.criteria.AndCriteria;
import edu.pingpong.stockx.criteria.Bids;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.criteria.Size;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class AndCriteriaTest {

    @Test
    public void test() {
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("4", 333));
        sneaker.add(new Bid("9.4", 666));
        sneaker.add(new Bid("6", 222));
        sneaker.add(new Bid("3", 232));
        sneaker.add(new Bid("4", 1111));
        sneaker.add(new Ask("4", 333));
        sneaker.add(new Ask("9.4", 666));
        sneaker.add(new Ask("4", 222));
        sneaker.add(new Ask("9.4", 1111));
        sneaker.add(new Sale("6", 654));

        Criteria bids = new Bids();
        Criteria size = new Size("4");
        AndCriteria andCriteria = new AndCriteria(bids, size);
        List<Offer> listResult = andCriteria.checkCriteria(sneaker);
        Offer result = listResult.get(1);
        assertEquals(1111, result.value());
    }
}