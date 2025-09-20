import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    void add(Complex c) {
        System.out.println("Sum: " + (real + c.real) + " + " + (imag + c.imag) + "i");
    }

    void subtract(Complex c) {
        System.out.println("Difference: " + (real - c.real) + " + " + (imag - c.imag) + "i");
    }

    void multiply(Complex c) {
        int r = real * c.real - imag * c.imag;
        int i = real * c.imag + imag * c.real;
        System.out.println("Product: " + r + " + " + i + "i");
    }

    public static void main(String[] args) {
 System.out.print("Himanshu Saini 24csu350");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary of first number: ");
        Complex c1 = new Complex(sc.nextInt(), sc.nextInt());

        System.out.print("Enter real and imaginary of second number: ");
        Complex c2 = new Complex(sc.nextInt(), sc.nextInt());

        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
    }
}
