package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void whatIf1000(){

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    void whatIfMoreThen1000(){
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1100);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    void whatIfBelowThen1000(){

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 0;

        assertEquals(actual, expected);
    }

}