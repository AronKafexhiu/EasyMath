import java.util.ArrayList;
import java.util.Arrays;

public class EasyMath {
    public double PI = 3.14159265359;
    //returns the greatest number in nums
    public static int max(int[] nums) {
        int max = nums[0];
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }
    //returns the least number in nums
    public static int min(int[] nums) {
        int min = nums[0];
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] < min) min = nums[i];
        }
        return min;
    }
    //returns the least common multiple of a and b
    public static int lcm(int a, int b) {
        int highestPossible = a * b;
        for(int i = 1;i < highestPossible;i++) {
            if(i % a == 0 && i % b == 0) {
                return  i;
            }
        }
        return highestPossible;
    }
    //returns the least common multiple of the numbers in the array
    public static int lcm(int[] numbers) {
        int highestPossible = 1;
        boolean shouldStop = false;
        for(int i = 0;i < numbers.length;i++) {
            highestPossible *= numbers[i];
        }
        for(int i = 1;i < highestPossible;i++) {
            for(int j = 0;j < numbers.length;j++) {
                if(i % numbers[j] == 0) {
                    shouldStop = true;
                }
                else {
                    shouldStop = false;
                    break;
                }
            }
            if(shouldStop) {
                return  i;
            }
        }
        return highestPossible;
    }
    //returns the greatest common divisor of a and b
    public static int gcd(int a, int b) {
        int theLeast;
        int greatestCommonDivisor = 1;
        if(a < b) {
            theLeast = a;
        }
        else {
            theLeast = b;
        }
        for(int i = 1;i <= theLeast;i++) {
            if(a % i == 0 && b % i == 0) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
    //returns the greatest common divisor of the numbers in the array
    public static int gcd(int[] numbers) {
        int theLeast = numbers[0];
        int greatestCommonDivisor = 1;
        boolean shouldStop = false;
        for(int i = 0;i < numbers.length;i++) {
            if(i < theLeast) theLeast = numbers[i];
        }
        for(int i = 1;i <= theLeast;i++) {
            for(int j = 0;j < numbers.length;j++) {
                if(numbers[j] % i == 0) {
                    shouldStop = true;
                }
                else {
                    shouldStop = false;
                    break;
                }
            }
            if(shouldStop) {
                greatestCommonDivisor = i;
            }
        }
        return greatestCommonDivisor;
    }
    //returns the square root of a, if a is not a square number it returns -1
    public static double sqrt(double a) {
        for(int i = 1;i < a;i++) {
            if(i * i == a) {
                return i;
            }
        }
        return -1;
    }
    //returns base to the power of exponent
    public static double pow(int base,int exponent) {
        double power = 1;
        for(int i = 1;i <= exponent;i++) {
            power *= base;
        }
        return power;
    }
    //returns x percent of a
    public static double percentageOf(double percentage,double a) {
        return  (percentage * a) / 100;
    }
    //returns how percent of a is b
    public static double howPercentOf(double a,double b) {
        return (b/a) * 100;
    }
    //returns absolute value
    public static int absoluteValue(int a) {
        if(a < 0) a *= -1;
        return a;
    }
    public static double reciprocalValue(int a) {
        return 1/(double)a;
    }
    //returns log of a with base "base"
    public static int log(int a, int base) {
        for(int i = 0;i < a;i++) {
            if(EasyMath.pow(base,i) == a) return i;
        }
        return -1;
    }
    //returns true if number is prime and false if not
    public static boolean isPrime(int a) {
        for(int i = 2;i < a;i++) {
            if(a % i == 0) {
                return false;
            }
        }
        if(a == 1) return false;
        return true;
    }
    //returns num of digits
    public static int numOfDigits(long a) {
        return Long.toString(a).length();
    }
    //returns an array of all the divisors of a
    public static int[] divisors(int a) {
        int[] divForPrimeNumbers = {1,a};
        ArrayList<String> divisors = new ArrayList<>();
        if(EasyMath.isPrime(a)) return divForPrimeNumbers;
        int counter = 0;
        for(int i = 1;i <= a;i++) {
            if(a % i == 0 ) {
                divisors.add(Integer.toString(i));
                counter++;
            }
        }
        int[] divisorsArr = new int[counter];
        for(int i = 0;i < divisors.size();i++) {
            divisorsArr[i] = Integer.parseInt(divisors.get(i));
        }
        return divisorsArr;
    }
    public static int[] primeDivisors(int a) {
        int[] divForPrimeNumbers = {1,a};
        ArrayList<String> divisors = new ArrayList<>();
        if(EasyMath.isPrime(a)) return divForPrimeNumbers;
        int counter = 0;
        for(int i = 1;i <= a;i++) {
            if(a % i == 0 && isPrime(i)) {
                divisors.add(Integer.toString(i));
                counter++;
            }
        }
        int[] divisorsArr = new int[counter];
        for(int i = 0;i < divisors.size();i++) {
            divisorsArr[i] = Integer.parseInt(divisors.get(i));
        }
        return divisorsArr;
    }
    public static int factorial(int a) {
        int factorialValue = 1;
        if(a < 0) {
            throw new Error("a less than 0");
        }
        if(a == 0) return 1;
        for(int i = 1;i <= a;i++) {
            factorialValue *= i;
        }
        return factorialValue;
    }
    //returns union of A and B
    public static int[] setUnion(int[] a, int[] b) {
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> bList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        for(int i = 0;i < a.length;i++) {
            aList.add(Integer.toString(a[i]));
        }
        for(int i = 0;i < b.length;i++) {
            bList.add(Integer.toString(b[i]));
        }
        for(int i = 0;i < aList.size();i++) {
            newList.add(aList.get(i));
        }
        for(int i = 0;i < bList.size();i++) {
            if(!aList.contains(bList.get(i))) {
                newList.add(bList.get(i));
            }
        }
        int[] newSet = new int[newList.size()];
        for(int i = 0;i < newList.size();i++) {
            newSet[i] = Integer.parseInt(newList.get(i));
        }
        return newSet;
    }
    //returns intersection of A and B
    public static int[] setIntersection(int[] a, int[] b) {
        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> bList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        for(int i = 0;i < a.length;i++) {
            aList.add(Integer.toString(a[i]));
        }
        for(int i = 0;i < b.length;i++) {
            bList.add(Integer.toString(b[i]));
        }
        for(int i = 0;i < aList.size();i++) {
            if(bList.contains(aList.get(i)) && !newList.contains(aList.get(i))) {
                newList.add(aList.get(i));
            }
        }
        int[] newSet = new int[newList.size()];
        for(int i = 0;i < newList.size();i++) {
            newSet[i] = Integer.parseInt(newList.get(i));
        }
        return newSet;
    }
    //returns a rounded to the nearest 10
    public static long roundToNearest10(long a) {
        String number = Long.toString(a);
        int lastDigit = Character.getNumericValue(number.charAt(number.length() - 1));
        if(lastDigit > 4) {
            a += (10 - lastDigit);
        } else {
            a -= lastDigit;
        }
        return a;
    }
    //returns a rounded to the nearest 100
    public static long roundToNearest100(long a) {
        String number = Long.toString(a);
        int twoLastDigits = Integer.parseInt(number.substring(number.length() - 2));
        if(twoLastDigits > 49) {
            a += (100 - twoLastDigits);
        } else {
            a -= twoLastDigits;
        }
        return a;
    }
    //returns a rounded to the nearest 1000
    public static long roundToNearest1000(long a) {
        String number = Long.toString(a);
        int threeLastDigits = Integer.parseInt(number.substring(number.length() - 3));
        if(threeLastDigits > 499) {
            a += (1000 - threeLastDigits);
        } else {
            a -= threeLastDigits;
        }
        return a;
    }
    //returns floor of a
    public static int floor(double a) {
        return (int) a;
    }
    //returns ceiling of a
    public static int ceiling(double a) {
        int integer = (int) a;
        double decimalPart = a - integer;
        return (int) (a + decimalPart);
    }
    //returns the average of numbers
    public static double average(double[] numbers) {
        double sum = 0;
        for(int i = 0;i < numbers.length;i++) {
            sum += numbers[i];
        }
        return sum/numbers.length;
    }
    public static double mode(double[] numbers) {
        Arrays.sort(numbers);
        double mode = numbers[0];
        double modeCount = 1;
        double tempModeCount = modeCount;
        for(int i = 1;i < numbers.length;i++) {
            for(int j = i;i > 0;i--) {
                if(numbers[i] == numbers[j]) {
                    tempModeCount = modeCount;
                    modeCount++;
                }
            }
            if(modeCount > tempModeCount) {
                mode = numbers[i];
            }
        }
        return mode;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //                                                              GEOMETRY                                                                                       //

    //returns perimeter of square with side = a
    public static double perimeterOfSquare(double a) {
        return 4 * a;
    }
    //returns area of square with side = a
    public static double areaOfSquare(double a) {
        return a * a;
    }
    //returns perimeter of rectangle with sides = a, b
    public static double perimeterOfRectangle(double a, double b) {
        return 2 * a + 2 * b;
    }
    //returns area of rectangle with sides = a, b
    public static double areaOfRectangle(double a, double b) {
        return a * b;
    }
    //returns perimeter of triangle with sides = a, b, c
    public static double perimeterOfTriangle(double a, double b, double c) {
        return a + b + c;
    }
    //returns area of triangle with base = b and height = h
    public static double areaOfTriangle(double b, double h) {
        return (b*h)/2;
    }
    //returns perimeter of 4-Nodded with sides = a, b, c, d
    public static double perimeterOfTFourNoddedShapes(double a, double b, double c, double d) {
        return a + b + c + d;
    }
    //returns area of trapezoid with base1 = b1, base2 = b2 and height = h
    public static double areaOfTrapezoid(double b1, double b2, double h) {
        return  ((b1 + b2) / 2) * h;
    }
    //returns area of parallelogram with base = b and height = h
    public static double areaOfParallelogram(double b, double h) {
        return b * h;
    }
}