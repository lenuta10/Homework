package intro_to_java_homework;

public class Algorithms {

    public static int sum(int number)
    {
        int sum = 0;
        for(int i = 1; i <= number; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static int smallestNumber(int[] numbers){

        int smallest = 0;
        if(numbers.length > 0)
            smallest = numbers[0];
        for(int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < smallest)
                smallest = numbers[i];
        }
        return smallest;
    }

    public static int maxDigitFromNumber(int number)
    {
        int maxDigit = 0;
        int result;
        while(number > 0)
        {
            result = number % 10;
            if(result == 9)
                return result;
            if(result > maxDigit)
                maxDigit = result;
            number = number / 10;
        }
        return maxDigit;
    }

    public static boolean isPalindrome(Integer number)
    {
        String numberToString = number.toString();
        int i = 0;
        int j = number.toString().length() - 1;

        while(i < j)
        {
            if (numberToString.charAt(i) != numberToString.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static boolean isPrime(int number)
    {
        for(int i = 2; i <= number / 2; i++)
        {
            if(number % i == 0)
                return false;
        }
        return true;
    }

    public static void allPrimeNumbers(int number)
    {
        if(number < 2)
            System.out.println("Give a number greater then 1!");
        else
            System.out.print(2);
        for(int i = 3; i < number; i++)
        {
            if (isPrime(i))
                System.out.print(", " + i);
        }
    }

    public static void main(String ... args)
    {
        System.out.println("1. Sum of first 100 numbers higher then 0 = " + sum(100));

        int[] numbers = {1, 2, 3, 4, 100, 0, -3, -100, 3, 9, 21, -11};
        System.out.println("2. The smallest number from the above array is: " + smallestNumber(numbers));

        System.out.println("3. The max digit from the number 43534601 is: " + maxDigitFromNumber(43534601));

        int number = 1234321;

        if(isPalindrome(number))
            System.out.println("4.1 The number " + number + " is a palindrome !");
        else
            System.out.println("4.1 The number " + number + " is not a palindrome !");

        int number1 = 12343212;

        if(isPalindrome(number1))
            System.out.println("4.2 The number " + number1 + " is a palindrome !");
        else
            System.out.println("4.2 The number " + number1 + " is not a palindrome !");

        int number3 = 99;
        System.out.print("5. All prime numbers lower than " + number3 + " are: " );
        allPrimeNumbers(number3);

    }
}
