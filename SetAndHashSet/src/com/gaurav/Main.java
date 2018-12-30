package com.gaurav;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);


//        System.out.println("Planets");
//        for (HeavenlyBody planet: planets){
////            System.out.println("\t" + planet.getName());
//            System.out.println("Moons of " + planet.getName());
//            for (HeavenlyBody body: solarSystem.get(planet.getName()).getSatellite()){
//                System.out.println("\t\t" + body.getName());
//            }
//        }

        System.out.println("Planets");
        for (HeavenlyBody planet: planets){
            System.out.println("\t" + planet.getName());
        }


        HeavenlyBody body = solarSystem.get("Mars");
        System.out.println("Moons of "+ body.getName());
        for (HeavenlyBody jupMoon: body.getSatellite()){
            System.out.println("\t" + jupMoon.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet: planets){
            moons.addAll(planet.getSatellite());
        }

        System.out.println("All Moons");
        for (HeavenlyBody moon: moons){
            System.out.println("\t " + moon.getName());
        }



        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        System.out.println("=========1========");
        System.out.println(planets.add(pluto));
        System.out.println("=========2========");

        for (HeavenlyBody planet: planets){
            System.out.println(planet.getName() + " : " +
                    planet.getOrbitalPeriod());
        }
        System.out.println("=========3========");

        Object o = new Object();
        System.out.println(o.equals(o));
        System.out.println("pluto".equals(""));

    }
}