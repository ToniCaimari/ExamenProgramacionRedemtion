package edu.pingpong.stockx;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.stockx.item.Item;
import edu.pingpong.stockx.item.Sneaker;

public class StockxTest {
    

    @Before
    public void creaSneaker(){
        Item sneaker = new Sneaker("555088-105", "Jordan 1 Retro High Dark Mocha");
    }
    
}
