public class BmiService {
    public int calculate(int weightKilogram, double heightMeter) {
        int bodyMassIndex = (int) (weightKilogram / (heightMeter * heightMeter));

        return bodyMassIndex;

    }
}
