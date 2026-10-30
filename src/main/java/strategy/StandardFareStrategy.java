package strategy;

public class StandardFareStrategy implements FareStrategy{

    @Override
    public double calculateFare(double baseFare){

        return baseFare;
    }

}
