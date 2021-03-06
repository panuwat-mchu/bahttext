package com.squid;

import org.junit.Assert;
import org.junit.Test;

public class BahtTextTest {

    @Test
    public void when0ShouldReturnZero(){
        String expected = "ศูนย์";
        String actual = BahtText.parseText(0d);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void when5ShouldReturnFive(){
        String expected = "ห้า";
        String actual = BahtText.parseText(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when10ShouldReturnTen(){
        String expected = "สิบ";
        String actual = BahtText.parseText(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when11ShouldReturnEleven(){
        String expected = "สิบเอ็ด";
        String actual = BahtText.parseText(11);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when12ShouldReturnTwelve(){
        String expected = "สิบสอง";
        String actual = BahtText.parseText(12);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when15ShouldReturnFifthteen(){
        String expected = "สิบห้า";
        String actual = BahtText.parseText(15);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when20ShouldReturnTwenty(){
        String expected = "ยี่สิบ";
        String actual = BahtText.parseText(20);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when21ShouldReturnTwentyOne(){
        String expected = "ยี่สิบเอ็ด";
        String actual = BahtText.parseText(21);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when25ShouldReturnTwentyFive(){
        String expected = "ยี่สิบห้า";
        String actual = BahtText.parseText(25);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when30ShouldReturnThirty(){
        String expected = "สามสิบ";
        String actual = BahtText.parseText(30);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when31ShouldReturnThirtyOne(){
        String expected = "สามสิบเอ็ด";
        String actual = BahtText.parseText(31);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when32ShouldReturnThirtyTwo(){
        String expected = "สามสิบสอง";
        String actual = BahtText.parseText(32);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when50ShouldReturnFifty(){
        String expected = "ห้าสิบ";
        String actual = BahtText.parseText(50);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when51ShouldReturnFiftyOne(){
        String expected = "ห้าสิบเอ็ด";
        String actual = BahtText.parseText(51);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when100ShouldReturnOneHundred(){
        String expected = "หนึ่งร้อย";
        String actual = BahtText.parseText(100);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when101ShouldReturnOneHundredOne(){
        String expected = "หนึ่งร้อยเอ็ด";
        String actual = BahtText.parseText(101);
        Assert.assertEquals(expected,actual);
    }


}
