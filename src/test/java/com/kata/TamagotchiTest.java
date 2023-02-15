package com.kata;

import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.kata.tamagotchi.Tamagotchi;

public class TamagotchiTest {
    
    Tamagotchi gochi = new Tamagotchi();

    @Test
    public void test_TamagotchiIsTired() {
        gochi.setEnergy(2);
        assertEquals("(-_-)", gochi.state());
    }

    @Test
    public void test_TamagotchiIsSleeping() {
        gochi.setEnergy(0);
        assertEquals("(-_-) zZZ", gochi.state());
    }

    @Test
    public void test_TamagotchiIsNormal() {
        gochi.setEnergy(3);
        assertEquals("(:-|)", gochi.state());
    }

    @Test
    public void test_TamagotchiIsNormalEnergyMoreThan3() {
        gochi.setEnergy(4);
        assertEquals("(:-|)", gochi.state());
    }

    @Test
    public void test_TamagotchiIsSleepingEnergyTwoUnits() {
        gochi.setEnergy(0);
        gochi.sleep();
        assertEquals(2, gochi.getEnergy());
    }

    @Test
    public void test_TamagotchiIsSleepingEnergyFourUnits() {
        gochi.setEnergy(0);
        gochi.sleep();
        gochi.sleep();
        assertEquals( 4, gochi.getEnergy());
    }


  
    @Test
    public void test_TamagotchiIsMoodHunger() {
        gochi.setEnergy(1);
        assertEquals("(ఠ_ఠ)", gochi.myMoodIs());
    } 

    @Test
    public void test_TamagotchiIsMoodNormal() {
        gochi.setEnergy(5);
        assertEquals("(:-|)", gochi.state());
    }

    @Test
    public void test_TamagotchiIsMoodHappy() {
        gochi.setEnergy(9);
        assertEquals(":-)", gochi.myMoodIs());
    }

    @Test 
    public void test_TamagotchiIsPlaying(){
        gochi.play();
        assertEquals(3, gochi.getEnergy());
        assertEquals(9, gochi.getHunger());
        assertEquals(5, gochi.getMood());

    }


    @Test
    public void test_TamagotchiIsEating(){
        gochi.eat();
        assertEquals(6, gochi.getHunger());
        assertEquals(5, gochi.getEnergy());
    }
        
    }

    
