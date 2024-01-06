public class AdventOfCodeDay15 {

    public static void main(String[] args) {
        String initializationSequence = "rn=1,cm-,qp=3,cm=2,qp-,pc=4,ot=9,ab=5,pc-,pc=6,ot=7";

        int sumOfResults = calculateSumOfResults(initializationSequence);
        System.out.println("Sum of Results: " + sumOfResults);
    }

    private static int calculateSumOfResults(String initializationSequence) {
        String[] steps = initializationSequence.split(",");
        int sum = 0;

        for (String step : steps) {
            int result = runHashAlgorithm(step);
            sum += result;
        }

        return sum;
    }

    private static int runHashAlgorithm(String step) {
        int currentValue = 0;

        for (int i = 0; i < step.length(); i++) {
            char currentChar = step.charAt(i);
            int asciiCode = (int) currentChar;

            currentValue += asciiCode;
            currentValue *= 17;
            currentValue %= 256;
        }

        return currentValue;
    }
}
