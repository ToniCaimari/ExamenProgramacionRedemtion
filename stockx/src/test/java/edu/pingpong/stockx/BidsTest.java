package edu.pingpong.stockx;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Bids;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sneaker;

public class BidsTest {
    @Test
    public void BidsCriteriaTest() {
        Criteria bids = new Bids();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("7.5", 555));
        sneaker.add(new Ask("6", 65));

        bids.checkCriteria(sneaker);

        assertNotNull(bids.checkCriteria(sneaker));
    }

}
