package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class World {
    private Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent){
        continents.add(continent);
    }
    public BigDecimal getPeopleQuantity(){
         return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                 .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum=sum.add(current));

    }
    public World()

    {
        Country china = new Country(new BigDecimal("1379302771"));
        Country india = new Country(new BigDecimal("1281935911"));
        Country uSA = new Country(new BigDecimal("326625791"));
        Country indonesia = new Country(new BigDecimal("260580739"));
        Country brasilia = new Country(new BigDecimal("207353391"));
        Country pakistan = new Country(new BigDecimal("204924861"));
        Country nigeria = new Country(new BigDecimal("190632261"));
        Country bangladesh = new Country(new BigDecimal("157826578"));
        Country russia = new Country(new BigDecimal("142257519"));
        Country japan = new Country(new BigDecimal("126451398"));
        Country mexico = new Country(new BigDecimal("124574795"));
        Country ethiopia = new Country(new BigDecimal("105350020"));
        Country phililpines = new Country(new BigDecimal("104256076"));
        Country egypth = new Country(new BigDecimal("97041072"));
        Country vietnam = new Country(new BigDecimal("96160163"));

        Continent asia = new Continent();
        Continent northAmerica = new Continent();
        Continent africa = new Continent();
        Continent southAmerica = new Continent();

        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(indonesia);
        asia.addCountry(pakistan);
        asia.addCountry(phililpines);
        asia.addCountry(bangladesh);
        asia.addCountry(vietnam);
        asia.addCountry(russia);
        asia.addCountry(japan);
        africa.addCountry(nigeria);
        africa.addCountry(ethiopia);
        africa.addCountry(egypth);
        southAmerica.addCountry(brasilia);
        northAmerica.addCountry(uSA);
        northAmerica.addCountry(mexico);

        continents.add(africa);
        continents.add(asia);
        continents.add(southAmerica);
        continents.add(northAmerica);
    }
}
