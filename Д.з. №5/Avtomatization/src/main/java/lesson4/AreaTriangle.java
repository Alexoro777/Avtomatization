package lesson4;

public class AreaTriangle {
    public static double calculateTriangle (int a, int b, int c) throws TriangleSideLessThanZeroException {
        if (a <= 0 || b <= 0 || c <= 0);
        if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
            throw new TriangleSideLessThanZeroException();
        }

        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
