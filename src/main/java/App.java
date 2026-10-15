public class App {

    public double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        App obj = new App();

        System.out.println(
            "Simple Interest = " + obj.simpleInterest(10000, 5, 2));
    }
}