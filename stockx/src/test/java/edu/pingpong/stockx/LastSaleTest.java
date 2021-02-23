package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.criteria.LastSale;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class LastSaleTest {
    @Test
    public void checkCriteriaTest() {
        Criteria lastSale = new LastSale();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Sale("7.5", 555));
        sneaker.add(new Sale("111", 111));
        sneaker.add(new Ask("6", 65));

        lastSale.checkCriteria(sneaker);

        assertNotNull(lastSale.checkCriteria(sneaker));
        assertFalse(lastSale.checkCriteria(sneaker).isEmpty());

        for (Offer offer : lastSale.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertTrue(offer instanceof Sale);
            assertEquals(111, offer.value());
            assertEquals("111", offer.size());
        }
    }
}
