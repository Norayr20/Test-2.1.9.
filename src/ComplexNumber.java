import java.util.Objects;

public class ComplexNumber {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num2 = new ComplexNumber(2.0, 3.0);
        ComplexNumber num3 = new ComplexNumber(4.0, 5.0);

        System.out.println("num1 equals num2: " + num1.equals(num2));
        System.out.println("num1 equals num3: " + num1.equals(num3));
    }
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        ComplexNumber that = (ComplexNumber) o;

        if (Double.compare(that.re, re) != 0)
            return false;
        return Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}

