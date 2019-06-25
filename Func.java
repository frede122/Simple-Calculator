public class Func {

    public static float soma(float a, float b) {
        return a + b;
    }

    public static float dividir(float a, float b) throws ArithmeticException {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException();
        }
    }

    public static float subtrair(float a, float b) throws NegaException {
        if ((a - b) >= 0) {
            return a - b;
        } else {
            throw new NegaException();
        }
    }

}