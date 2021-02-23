package edu.pingpong.stockx;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.pingpong.stockx.criteria.Sales;
import edu.pingpong.stockx.criteria.Criteria;
import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sale;
import edu.pingpong.stockx.item.Sneaker;

public class SalesTest {
    @Test
    public void nonEmptySalesCriteriaTest() {
        Criteria sales = new Sales();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("7.5", 555));
        sneaker.add(new Ask("6", 65));
        sneaker.add(new Sale("8", 15));

        sales.checkCriteria(sneaker);

        assertNotNull(sales.checkCriteria(sneaker));
        assertFalse(sales.checkCriteria(sneaker).isEmpty());
    }

    @Test
    public void emptySalesCriteriaTest() {
        Criteria sales = new Sales();
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("7.5", 555));
        sneaker.add(new Ask("6", 65));

        sales.checkCriteria(sneaker);

        assertTrue(sales.checkCriteria(sneaker).isEmpty());
    }

}