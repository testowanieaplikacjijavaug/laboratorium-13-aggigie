package timecalculator;

import java.util.Arrays;

public class TimeCalculator {
    public final double[] values = {1,  0.2408467, 0.61519726, 1.8808158, 11.862615, 29.447498, 84.016846, 164.79132 };
    public final String[] planets = {"Ziemia", "Merkury", "Wenus", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

    public double calculate(String planet, double seconds) throws IllegalArgumentException{
        int planetIndex = Arrays.asList(planets).indexOf(planet);
        if(planetIndex < 0){
            throw new IllegalArgumentException("Given planet is not supported.");
        }
        if(seconds < 0){
            throw new IllegalArgumentException("We don't go back in time here.");
        }
        return seconds / 31557600 / values[planetIndex];
    }
}
