package com.ZEROBANK.JAVA_Questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SameLetters {
    /*
    Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
     */
    public static void main(String[] args) throws Exception {

        System.out.println("Codility(125) = " + Codility(3));


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        String password = scanner.next();


        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";


        List<String> list = new ArrayList<>(Arrays.asList("Ahmad", "Sul", "Ahmad", "Suol", "Fasad", "Ahmad"));

        System.out.println("RemoveAhmad(list) = " + RemoveAhmad((ArrayList<String>) list));
        ArrayList<Integer> nums = new ArrayList<>();


        String DivisibleBy15 = "DivisibleBy15: ";
        String DivisibleBy3 = "DivisibleBy3: ";
        String DivisibleBy5 = "DivisibleBy5: ";

        for (int i = 1; i < 101; i++) {
            nums.add(i);

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0) {
                DivisibleBy15 += i + " ";
            }
            if (i % 3 == 0 && i % 15 != 0) {
                DivisibleBy3 += i + " ";
            }
            if (i % 5 == 0 && i % 15 != 0) {
                DivisibleBy5 += i + " ";
            }
        }
        System.out.println(DivisibleBy15);
        System.out.println(DivisibleBy3);
        System.out.println(DivisibleBy5);

        System.out.println("removeSomeElements(nums) = " + removeSomeElements(nums));


    }


    public static String oddOrEven(int a) {

        String oddOr = "";

        if (a == 0) {
            oddOr = "even";
        } else {

            if (a % 2 == 0) {
                oddOr = "even";
            } else {
                oddOr = "odd";
            }
        }
        return oddOr;
    }


    public static void Division(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }
        int count = 0;

        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }

        System.out.println(count + " and remainder is " + num1);

    }


    public static String FINRA() {

        String numbers = "";

        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                numbers += " FINRA ";
            } else if (i % 3 == 0) {
                numbers += " FIN ";
            } else if (i % 5 == 0) {
                numbers += " RA ";
            } else {
                numbers += i + " ";
            }
        }
        return numbers;
    }


    /*
    Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
     */


    public static ArrayList<String> RemoveAhmad(ArrayList<String> list) {

//1.        list.removeAll(Arrays.asList("Ahmad"));
//2.
        ArrayList<String> AhmadYok = new ArrayList<>();
        for (String each : list) {

            if (!each.equals("Ahmad")) {
                AhmadYok.add(each);
            }
        }
        return AhmadYok;
    }

    /*
    ArrayList -- Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */
    public static ArrayList<Integer> removeSomeElements(ArrayList<Integer> list) {

        ArrayList<Integer> limitedNums = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 100) {
                limitedNums.add(i);
            }
        }
        return limitedNums;
    }

    public static boolean PassWordvalidation(String password) {

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";

        boolean HasLower = password.matches(lowercase),

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars),

                Valid = false;

        if (password.length() >= 6 && !password.contains(" "))
            if (HasLower && HasUppere && HasDigits && HasSpecial)
                Valid = true;

        return Valid;
    }

    /*
    Write a function:
that, given a positive integer N,

prints the consecutive numbers from 1 to N, each on a separate line.
 However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
 If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of
 the respective words Codility, Test and Coders in this given order.

For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest
 and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

     */

    public static String Codility(int N) {

        String result = "";

        for (int i = 1; i <= N; i++) {
            if (i % 5 == 0 && i % 3 == 0 && i % 2 == 0) {
                result += " CodilityTestCoders ";
            } else if (i % 3 == 0 && i % 2 == 0) {
                result += " CodilityTest \n";
            } else if (i % 3 == 0 && i % 5 == 0) {
                result += " TestCoders \n";
            } else if (i % 2 == 0 && i % 5 == 0) {
                result += " CodilityCoders \n";
            } else if (i % 2 == 0) {
                result += " Codility \n";
            } else if (i % 3 == 0) {
                result += " Test \n";
            } else if (i % 5 == 0) {
                result += " Coders \n";
            } else {
                result += i + "\n";
            }
        }
        return result;
    }

    public static int[] array(int N) {

        int arr[] = new int[N];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            sum += i;
        }
        arr[arr.length - 1] = -sum;

        return arr;
    }





}

