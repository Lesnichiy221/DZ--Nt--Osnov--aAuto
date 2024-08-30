package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void whatIf1000(){

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void whatIfMoreThen1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(expected, actual);
    }

    @Test
    public void whatIfBelowThen1000(){

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 0;

        assertEquals(expected, actual);
    }

}