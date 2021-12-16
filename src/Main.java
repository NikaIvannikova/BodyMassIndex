public class Main {
    public static void main(String[] args) {
        BodyMassIndex run = new BodyMassIndex();
        float resold = run.calculate( 66, 1_50);
        System.out.println(resold);

        resold = run.calculate(120, 1_80);
        System.out.println(resold);

        resold = run.calculate(50, 1_80);
        System.out.println(resold);

    }
}
