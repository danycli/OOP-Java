package Helper;

public class Formula {
    public static double Formula1_AMinusBWholeSquare(double a, double b) {
        double result = Math.pow((a - b), 2);
        return result;
    }

    public static double Formula2_APlusBWholeSquare(double a, double b) {
        double result = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;
        return result;
    }

    public static double Formula3_aSquare_Minus_bSquare(double a, double b) {
        double result = (a - b) * (a + b);
        return result;
    }

    public static double Formula4(double a, double b) {
        double result = Math.pow(a / b, 2) / (a / b) + (3.0 / 2.0);
        return result;
    }

    public static double Quadratic_1_AdditionValue(double a, double b, double c) {
        double quadratic = (b * b) - (4 * a * c);
        if (quadratic < 0) {
            quadratic = -quadratic;
        }
        double root = (-b + Math.sqrt(quadratic)) / (2 * a);
        return root;
    }

    public static double Quadratic_2_Subtraction(double a, double b, double c) {
        double quadratic = (b * b) - (4 * a * c);
        if (quadratic < 0) {
            quadratic = -quadratic;
        }
        double root = (-b - Math.sqrt(quadratic)) / (2 * a);
        return root;
    }

    // Additional Tasks
    public static double Formula1(int X, int Y) {
        double result = (Math.pow(((double)X / Y), 2)) + ((double)X / Y);
        return result;
    }

    public static double Formula2(int X, int Y) {
        double result = (X - Y) * (Math.pow(X, 2) + Math.pow(Y, 2) + (X * Y));
        return result;
    }

    public static double Formula3(int X, int Y, int Z) {
        double result = Math.pow(X, 2) * ((double) X / Z + (double)Y / Z + (double) Z / 3);
        return result;
    }
}