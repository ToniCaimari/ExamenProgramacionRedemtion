package edu.pingpong.stockx;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.pingpong.stockx.item.Ask;
import edu.pingpong.stockx.item.Bid;
import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sneaker;

public class SneakerTest {

    @Test
    public void toStringTest() {
        Item sneaker = new Sneaker("Estilo", "Nombre");
        assertEquals("\n\t" + "Nombre" + "\n\t\t" + "Estilo", sneaker.toString());
    }

    @Test
    public void addBidTest() {
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("9.5", 50));
        sneaker.add(new Bid("5", 100));
        assertEquals(2, sneaker.offers().size());
    }

    @Test
    public void addBidAskTest() {
        Item sneaker = new Sneaker("Estilo", "Nombre");
        sneaker.add(new Bid("9.5", 50));
        sneaker.add(new Bid("5", 10));
        sneaker.add(new Ask("7", 200));
        sneaker.add(new Ask("8.5", 30));
        assertEquals(4, sneaker.offers().size());
    }
}
