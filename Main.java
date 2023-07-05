import java.util.Scanner;

public class Main {
    /**
     * findMin - function that help you find a minimum number from given array
     *
     * @param n - length of given array
     * @param arr - array to work with them
     * @return - returns minimum number of array
     */
    static int findMin(int n, int[] arr) {
        int min = arr[0]; // declaring a new min value
        for (int i = 1; i < n; i++) { // starting from second element
            if (arr[i] < min) { // checking if the element of array less
                min = arr[i]; // updating a value
            }
        }
        return min; // returning result
    }
    /**
     * findAverage - function sum up all numbers and dividing by the number of numbers
     *
     * @param n - length of given array
     * @param arr - array to work with them
     * @return - returns average of array
     */
    static double findAverage(int n, int[] arr) {
        double sum = arr[0]; // declaring a new value
        for (int i = 1; i < n; i++) { // starting from second element
            sum += arr[i]; // adding element to value
        }
        return sum / n; // returning result
    }

    /**
     * isNumberPrime - function checking is the given number prime or composite
     *
     * @param n - number to check
     * @return - returns true if number prime, false otherwise
     */
    static boolean isNumberPrime(int n) {
        int sum = 0; // declaring a new value
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { // check is the number divisible to others
                sum++; //
            }
        }
        return sum == 0;
    }

    /**
     * findFact - function that find factorial of given number
     *
     * @param n - number to find factorial
     * @return - return factorial of number
     */
    static int findFact(int n) {
        if (n == 1) { // base case
            return 1;
        }
        else {
            return n * findFact(n-1); // repeating statement
        }
    }

    /**
     * findFib - function find fibonacci number
     *
     * @param n - fibonacci number to find
     * @return - returns founded fibonacci number
     */
    static int findFib(int n) {
        if (n == 1 || n == 2) { // base case
            return 1;
        }
        else {
            return findFib(n-1) + findFib(n-2); // repeating statement
        }
    }

    /**
     * findPow - function that return result of power of two given numbers
     *
     * @param a - number
     * @param n - power of number
     * @return - returns a power of n
     */
    static int findPow(int a, int n) {
        if (n == 1) { // base case
            return a;
        }
        else {
            return a * findPow(a, n-1); // repeating statement
        }
    }

    /**
     * getReverse - function return string that copying given array but in reverse order
     *
     * @param n - length of given array
     * @param arr - array to reverse
     * @return - reverse string
     */
    static String getReverse(int n, int[] arr) {
        if (n == 1) { // base case
            return Integer.toString(arr[0]);
        }
        else {
            return Integer.toString(arr[n-1]) + " " + getReverse(n-1, arr); // repeating statement
        }
    }

    /**
     * isFullDigit - function that check is all string contain digits
     *
     * @param line - given string to check
     * @return - returns true if string contain all digits, false otherwise
     */
    static boolean isFullDigit(String line) {
        if (line.length() == 1) { // base case
            return Character.isDigit(line.charAt(0));
        }
        else {
            return Character.isDigit(line.charAt(0)) && isFullDigit(line.substring(1)); // repeating statement
        }
    }

    /**
     * findBinom - function returns binomial coefficient by two number
     *
     * @param n - first bottom argument
     * @param k - second top argument
     * @return - returns binomial coefficient of two numbers
     */
    static int findBinom(int n, int k) {
        if (k == 0 || k == n) { // base case
            return 1;
        }
        else {
            return findBinom(n-1, k-1) + findBinom(n-1, k); // repeating statement
        }
    }

    /**
     * findGCD - function find the greatest common divisor of two numbers
     *
     * @param a - first number
     * @param b - second number
     * @return - returns gcd of two numbers
     */
    static int findGCD(int a, int b) {
        if (b == 0) { // base case
            return a;
        }
        else {
            return findGCD(b, a % b); // repeating statement
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Choose method from 1 to 10");
            int choice = sc.nextInt();
            switch (choice) {
                case 0 -> {
                    System.out.println("Unknown Method");
                    running = false;
                }
                case 1 -> {
                    System.out.print("Enter length of array: ");
                    int n1 = sc.nextInt();
                    System.out.print("Enter array: ");
                    int[] nums1 = new int[n1];
                    for (int i = 0; i < n1; i++) {
                        nums1[i] = sc.nextInt();
                    }
                    System.out.println("Minimum number from array is " + findMin(n1, nums1) + "\n");
                }
                case 2 -> {
                    System.out.print("Enter length of array: ");
                    int n2 = sc.nextInt();
                    System.out.print("Enter array: ");
                    int[] nums2 = new int[n2];
                    for (int i = 0; i < n2; i++) {
                        nums2[i] = sc.nextInt();
                    }
                    System.out.println("Average of array is " + findAverage(n2, nums2) + "\n");
                }
                case 3 -> {
                    System.out.print("Enter the number: ");
                    int n3 = sc.nextInt();
                    if (isNumberPrime(n3)) System.out.println("Prime\n");
                    else System.out.println("Composite\n");
                }
                case 4 -> {
                    System.out.print("Enter the number: ");
                    int n4 = sc.nextInt();
                    System.out.println("Factorial of " + n4 + " is " + findFact(n4) + "\n");
                }
                case 5 -> {
                    System.out.print("Enter the number: ");
                    int n5 = sc.nextInt();
                    System.out.println(n5 + "-th element of Fibonacci sequence is " + findFib(n5) + "\n");
                }
                case 6 -> {
                    System.out.print("Enter the number: ");
                    int a6 = sc.nextInt();
                    System.out.print("Enter the power of a number: ");
                    int n6 = sc.nextInt();
                    System.out.println(a6 + " power of " + n6 + " is " + findPow(a6, n6) + "\n");
                }
                case 7 -> {
                    System.out.print("Enter length of array: ");
                    int n7 = sc.nextInt();
                    System.out.print("Enter array: ");
                    int[] nums7 = new int[n7];
                    for (int i = 0; i < n7; i++) {
                        nums7[i] = sc.nextInt();
                    }
                    System.out.println("Your reverse array is '" + getReverse(n7, nums7) + "'\n");
                }
                case 8 -> {
                    System.out.print("Enter your string: ");
                    String s8 = sc.nextLine();
                    if (isFullDigit(s8)) System.out.println("Yes");
                    else System.out.println("No");
                }
                case 9 -> {
                    System.out.print("Enter bottom number: ");
                    int n9 = sc.nextInt();
                    System.out.print("Enter top number: ");
                    int k9 = sc.nextInt();
                    System.out.println("Binomial coefficient by your two numbers is " + findBinom(n9, k9) + "\n");
                }
                case 10 -> {
                    System.out.print("Enter first number: ");
                    int a10 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b10 = sc.nextInt();
                    System.out.println("GCD of your two numbers is " + findGCD(a10, b10) + "\n");
                }
                default -> System.out.println("Out of range");
            }
        }


    }
}