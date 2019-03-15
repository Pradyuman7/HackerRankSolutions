import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfTests = scanner.nextInt();
        for (int i = 0; i < numberOfTests; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long k = scanner.nextLong();
            long modulus = scanner.nextLong();

            ComplexNumber result = fastComplexExponentian(new ComplexNumber(a % modulus,b % modulus), k, modulus);
            System.out.print(printModOfValue(result.getRealPart(), modulus));
            System.out.print(" ");
            System.out.print(printModOfValue(result.getImaginaryPart(), modulus));
            System.out.println("");

        }
    }

    private static ComplexNumber fastComplexExponentian(ComplexNumber base, Long exponent, Long modulus) {

        ComplexNumber result = new ComplexNumber(1,0);
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = result.multiply(base, modulus);
            }
            base = base.squareWithMod(modulus);
            exponent >>= 1;
        }
        return result;
    }

    private static long printModOfValue(long a, long modulus) {
        if (a > 0) {
            return a % modulus;
        } else if(a < 0) {
            while(a < 0) {
                a = (((a % modulus) + modulus) % modulus);
                if(a > 0) {
                    break;
                }
            }
            return a % modulus;
        } else {
            return 0;
        }
    }

}

class ComplexNumber {

    private final long realPart;
    private final long imaginaryPart;

    public ComplexNumber(long realPart, long imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public long getRealPart() {
        return realPart;
    }

    public long getImaginaryPart() {
        return imaginaryPart;
    }


    // (a + ib) ^ 2 = (a^2 - b^2) + i (2 * a * b)
    public ComplexNumber squareWithMod(long modulus) {

        long a = this.realPart % modulus;
        long b = this.imaginaryPart % modulus;

        long realPartSquare = ((a * a) % modulus - (b * b) % modulus) % modulus;
        long imaginaryPartSquare = ((2 % modulus) * a * b) % modulus;

        return new ComplexNumber(realPartSquare, imaginaryPartSquare);
    }

    // (a + bi) * (c + di) = (ac - bd) + i (bc + ad)
    public ComplexNumber multiply(ComplexNumber complexNumber, long modulus) {

        long a = this.realPart % modulus;
        long b = this.imaginaryPart % modulus;

        long c = complexNumber.getRealPart() % modulus;
        long d = complexNumber.getImaginaryPart() % modulus;

        long newRealPart = (((a * c) % modulus) - ((b * d) % modulus)) % modulus;
        long newImaginaryPart = (((a * d) % modulus) + ((b * c) % modulus)) % modulus;

        return new ComplexNumber(newRealPart, newImaginaryPart);
    }
}
