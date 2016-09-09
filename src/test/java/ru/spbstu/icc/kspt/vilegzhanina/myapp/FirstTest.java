package ru.spbstu.icc.kspt.vilegzhanina.myapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstTest {

    @Test
    public void testSum(){
        First first = new First();
        assertEquals(8, first.sum(3, 5));
    }
}
