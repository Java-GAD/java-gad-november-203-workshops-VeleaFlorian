package overloading;

public class OverrLoad {
    public int multiply(int a, int b) {
        return a * b;
    }

    public long multiply(int a, long b, long c) {
        return a * b * c;
    }

    public double multiply(int a, double d) {
        return a * d;
    }

}
