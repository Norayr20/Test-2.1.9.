public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber num2 = new ComplexNumber(3.0, 4.0);

        System.out.println("num1: " + num1.getRe() + " + " + num1.getIm() + "i");
        System.out.println("num2: " + num2.getRe() + " + " + num2.getIm() + "i");

        if (num1.equals(num2)) {
            System.out.println("num1 and num2 are equal");
        } else {
            System.out.println("num1 and num2 are not equal");
        }
    }
    public static class ComplexNumber {
        private double re;
        private double im;

        public ComplexNumber() {
        }
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
            return
                    Double.compare(that.re, re) == 0 &&
                            Double.compare(that.im, im) == 0;
        }
        @Override
        public int hashCode() {
            return (int) ((re - 3) * (im + 4));
        }
    }
}
