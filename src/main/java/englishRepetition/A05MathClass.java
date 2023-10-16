package englishRepetition;

import java.util.Scanner;

public class A05MathClass {
    public static void main(String[] args) {
        double x=3.14;
        double y=-10;

        double z=Math.max(x,y);//max value
        System.out.println(z);

        double a1=Math.abs(y);//Absolut value - mutlak deger
        System.out.println(a1);//10.0

        double a2=Math.sqrt(Math.abs(y));//square root // karekok
        System.out.println(a2);//3.1622776601683795

        double a3=Math.round(x);//Returns the closest long whole number to the argument. for double
                                //Returns the closest int whole number to the argument. for float
        System.out.println(a3);//3.0

        double a4=Math.ceil(x);//return the closest bigger whole number
        System.out.println(a4);//4.0

        double a5=Math.floor(x);//return the closest smaller whole number
        System.out.println(a5);//3.0

        /*
Math.abs(double a): Returns the absolute value of a double value.

Math.abs(float a): Returns the absolute value of a float value.

Math.abs(int a): Returns the absolute value of an int value.

Math.abs(long a): Returns the absolute value of a long value.

Math.ceil(double a): Returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.

Math.floor(double a): Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer.

Math.round(float a): Returns the closest int to the argument.

Math.round(double a): Returns the closest long to the argument.

Math.max(double a, double b): Returns the greater of two double values.

Math.max(float a, float b): Returns the greater of two float values.

Math.max(int a, int b): Returns the greater of two int values.

Math.max(long a, long b): Returns the greater of two long values.

Math.min(double a, double b): Returns the smaller of two double values.

Math.min(float a, float b): Returns the smaller of two float values.

Math.min(int a, int b): Returns the smaller of two int values.

Math.min(long a, long b): Returns the smaller of two long values.

Math.exp(double a): Returns Euler's number e raised to the power of a double value.

Math.log(double a): Returns the natural logarithm (base e) of a double value.

Math.log10(double a): Returns the base-10 logarithm of a double value.

Math.pow(double a, double b): Returns the value of the first argument raised to the power of the second argument.

Math.sqrt(double a): Returns the square root of a double value.

Math.sin(double a): Returns the trigonometric sine of an angle (in radians).

Math.cos(double a): Returns the trigonometric cosine of an angle (in radians).

Math.tan(double a): Returns the trigonometric tangent of an angle (in radians).

Math.asin(double a): Returns the arc sine of a value (in radians).

Math.acos(double a): Returns the arc cosine of a value (in radians).

Math.atan(double a): Returns the arc tangent of a value (in radians).

Math.atan2(double y, double x): Converts rectangular coordinates (x, y) to polar (r, theta) and returns the theta component.

Math.random(): Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
         */

//take input and calculate hypothenus
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a");
        double a=scanner.nextDouble();
        System.out.println("please enter b");
        double b=scanner.nextDouble();

        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println(c);

        scanner.close();


    }

}
