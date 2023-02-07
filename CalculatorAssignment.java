public class CalculatorAssignment {
    static float simpleinterest(float p, float r,  float t)
    {
        float si  = (p*r*t)/100;
        System.out.println("Simple Interest is: " +si);
        return si;
    }
    static double compoundinterest(double p, double r,  double t)
    {
        double ci  = p * (Math.pow((1 + r / 100), t)) - p;
        System.out.println("Compound Interest is: " +ci);
        return ci;
    }
    public static void main(String args[]) {
        float simpleI = simpleinterest(19800, 15, 3);
        double compoundI = compoundinterest(190555,18,2);
    }
}
