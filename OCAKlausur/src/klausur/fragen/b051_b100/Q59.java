/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klausur.fragen.b051_b100;

/**
 *
 * @author mamiri
 */
public class Q59 {

    public static void main(String[] args) {
        Planet[] plantes = {
            new Planet("Mercury", 0),
            new Planet("Venus", 0),
            new Planet("Venus", 1),
            new Planet("Venus", 2)};
        System.out.println(plantes);
        System.out.println(plantes[2]);
        System.out.println(plantes[2].moons);
    }

}

class Planet {

    public String name;
    public int moons;

    public Planet(String name, int moons) {
        this.name = name;
        this.moons = moons;
    }

}

/**
 * What is the output? a) Planets Earth 1
 *
 * b) [LPlanets.Planet;@15db9742 Earth 1
 *
 * c) [LPlanets.Planet;@15db9742 Plantes.Planet@6d06d69c 1
 *
 * d) [LPlanets.Planet;@15db9742 
 *    Plantes.Planet@6d06d69c
 *   [LPlanets.Planet;@15db9742
 *
 * e) [LPlanets.Planet;@15db9742 
 *    Plantes.Planet@6d06d69c
 *    0
 *
 *
 *
 *
 *
 *
 *
 *
 */
