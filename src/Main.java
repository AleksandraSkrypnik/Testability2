public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilogram = 98;
        double heightMeter = 1.87;
        int bodyMassIndex = service.calculate(98, 1.87); // должно получиться 500
        System.out.println(bodyMassIndex);
    }
}