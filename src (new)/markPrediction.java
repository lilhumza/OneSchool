import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class markPrediction {
    private static final List<Integer> x = asList(1, 2, 3, 4, 5, 6, 7);
    private static final List<Integer> y = asList(2, 2, 3, 4, 5, 6, 7);


    static Integer numberOfDataValues = x.size();

    static List<Double> xSquared = x
            .stream()
            .map(position -> Math.pow(position, 2))
            .collect(Collectors.toList());

    static List<Double> ySquared = y
            .stream()
            .map(position -> Math.pow(position, 2))
            .collect(Collectors.toList());

    static List<Integer> xMultipliedByY = IntStream.range(0, numberOfDataValues)
            .map(i -> x.get(i) * y.get(i))
            .boxed()
            .collect(Collectors.toList());

    static Integer xSummed = x
            .stream()
            .reduce((prev, next) -> prev + next)
            .get();

    static Integer ySummed = y
            .stream()
            .reduce((prev, next) -> prev + next)
            .get();

    static Double sumOfXSquared = xSquared
            .stream()
            .reduce((prev, next) -> prev + next)
            .get();

    static Double sumOfYSquared = ySquared
            .stream()
            .reduce((prev, next) -> prev + next)
            .get();

    static Integer sumOfXMultipliedByY = xMultipliedByY
            .stream()
            .reduce((prev, next) -> prev + next)
            .get();

    private static Double predictForValue(int predictForDependentVariable) {

        int slopeNominator = numberOfDataValues * sumOfXMultipliedByY - ySummed * xSummed;
        Double slopeDenominator = numberOfDataValues * sumOfXSquared - Math.pow(xSummed, 2);
        Double slope = slopeNominator / slopeDenominator;

        double interceptNominator = ySummed - slope * xSummed;
        double interceptDenominator = numberOfDataValues;
        Double intercept = interceptNominator / interceptDenominator;

        return (slope * predictForDependentVariable) + intercept;
    }

    static float correlationCoefficient()
    {
        float corr = (float)(numberOfDataValues * sumOfXMultipliedByY - xSummed * ySummed)/
                (float)(Math.sqrt((numberOfDataValues * sumOfXSquared -
                        xSummed * xSummed) * (numberOfDataValues * sumOfYSquared -
                        ySummed * ySummed)));

        return (float) (Math.pow(corr, 2) * 100);
    }

    public static void main(String[] args) {
        System.out.println(predictForValue(8) + " Predicted \n" + correlationCoefficient() + " Accuracy");
    }
}
