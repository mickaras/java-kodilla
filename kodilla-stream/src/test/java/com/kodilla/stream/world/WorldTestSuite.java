package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity(){
        World world = new World();

        BigDecimal calculatedPopulation = world.getPeopleQuantity();

        Assert.assertEquals(new BigDecimal("4805273346"), calculatedPopulation);
    }
}
