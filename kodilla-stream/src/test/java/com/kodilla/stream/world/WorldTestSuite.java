package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country Argentina = new Country("Argentina", new BigDecimal(100));
        Country Poland = new Country("Poland", new BigDecimal(500));
        Country Chile = new Country("Chile", new BigDecimal(50));
        Country Peru = new Country("Peru", new BigDecimal(80));

        Continent Europe = new Continent("Europe");
        Continent SouthAmerica = new Continent("South America");

        Europe.addCountry(Poland);
        SouthAmerica.addCountry(Argentina);
        SouthAmerica.addCountry(Chile);
        SouthAmerica.addCountry(Peru);

        World world = new World();
        world.addContinents(Europe);
        world.addContinents(SouthAmerica);

        //When
        Assert.assertEquals(new BigDecimal(730), world.getPeopleQuantity());

    }

}
