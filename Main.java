public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(87, 1.95);
        System.out.printf("bmi%.1f", bmi);
    }
}