package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Size;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Offer;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class SizeTest {

    @Test
    public void test() {
        Size size = new Size("4");

        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("4", 333));
        sneaker.add(new Bid("9.4", 666));
        sneaker.add(new Bid("6", 222));
        sneaker.add(new Bid("4", 232));
        sneaker.add(new Bid("4", 1111));
        sneaker.add(new Ask("4", 333));
        sneaker.add(new Ask("9.4", 666));
        sneaker.add(new Ask("4", 222));
        sneaker.add(new Ask("9.4", 1111));
        sneaker.add(new Sale("6", 654));

        size.checkCriteria(sneaker);

        assertNotNull(size.checkCriteria(sneaker));
        assertFalse(size.checkCriteria(sneaker).isEmpty());

        for (Offer offer : size.checkCriteria(sneaker)) {
            assertNotNull(offer);
            assertEquals(5, size.checkCriteria(sneaker).size());
            ;
            assertEquals("4", offer.size());

        }
    }
}