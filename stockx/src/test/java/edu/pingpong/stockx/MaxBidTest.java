package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.criteria.MaxBid;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;

import edu.pingpong.stockx.item.Sneaker;

public class MaxBidTest {
    @Test
    public void checkCriteriaTest() {
        Criteria maxBid = new MaxBid();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("7.5", 2));
        sneaker.add(new Bid("111", 555));
        sneaker.add(new Ask("6", 65));

        maxBid.checkCriteria(sneaker);

        assertNotNull(maxBid.checkCriteria(sneaker));
        assertFalse(maxBid.checkCriteria(sneaker).isEmpty());

        for (Offer offer : maxBid.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Bid);
            assertEquals(555, offer.value());
            assertEquals("111", offer.size());
        }
    }
}