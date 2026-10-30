package strategy;

public class FareService {

    private FareStrategy strategy;

    public FareService(FareStrategy strategy){

        this.strategy = strategy;
    }

    public double calculateFare(double baseFare){

        return strategy.calculateFare(baseFare);
    }
}
