package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(9876);
    }
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);
        while(count > 0){
            int lastdigit = number % 10;
            String stringDigit = "";

            switch(lastdigit){
                case 0:
                    stringDigit = "Zero";
                    break;

                case 1:
                    stringDigit = "One";
                    break;

                case 2:
                    stringDigit = "Two";
                    break;

                case 3:
                    stringDigit = "Three";
                    break;

                case 4:
                    stringDigit = "Four";
                    break;

                case 5:
                    stringDigit = "Five";
                    break;

                case 6:
                    stringDigit = "Six";
                    break;

                case 7:
                    stringDigit = "Seven";
                    break;

                case 8:
                    stringDigit = "Eight";
                    break;

                case 9:
                    stringDigit = "Nine";
                    break;

            }
            System.out.println(stringDigit + "");
            number /= 10;
            count--;




        }
        System.out.println();


    }
    public static int reverse(int n){
        int reverseNumber = 0;

        while(n != 0){
            reverseNumber = reverseNumber * 10 + (n %  10);
            n /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int n){
        if( n < 0){
            return -1;
        }
        return (n == 0) ? 1 : (int)Math.log10(n) + 1;
    }


}
