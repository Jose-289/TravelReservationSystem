package strategy;

public class HighSeasonFareStrategy implements FareStrategy{

    @Override
    public double calculateFare(double baseFare){

        return baseFare * 1.25;
    }
}
