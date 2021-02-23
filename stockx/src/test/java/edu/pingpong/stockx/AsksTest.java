package edu.pingpong.stockx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Asks;

import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class AsksTest {
    @Test
    public void nonEmptyAsksCriteriaTest() {
        Criteria asks = new Asks();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("7.5", 555));
        sneaker.add(new Ask("6", 65));

        asks.checkCriteria(sneaker);

        assertNotNull(asks.checkCriteria(sneaker));
        assertFalse(asks.checkCriteria(sneaker).isEmpty());
    }

    @Test
    public void emptyAsksCriteriaTest() {
        Criteria asks = new Asks();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("7.5", 555));
        sneaker.add(new Sale("6", 65));

        asks.checkCriteria(sneaker);

        assertTrue(asks.checkCriteria(sneaker).isEmpty());
    }

}