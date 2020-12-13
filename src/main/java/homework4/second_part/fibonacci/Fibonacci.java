package homework4.second_part.fibonacci;

import homework4.second_part.exception.NullValidationException;
import homework4.second_part.exception.ValidationException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

    public static long fibonacci(Integer n) throws NullValidationException, ValidationException {
        if (n == null)
            throw new NullValidationException("The value is null. Try again!");
        if (n < 0)
            throw new ValidationException("The number should be greater then 0!");
        if (n == 1 || n == 0)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Give a number: ");
            Integer N = Integer.parseInt(reader.readLine());

            //System.out.println(N);
            if (N < 1 || N == null) {
                System.out.println(fibonacci(N));
            }

            for (int i = 1; i <= N; i++)
                System.out.println(i + ": " + fibonacci(i));

        } catch (NullValidationException e) {
            System.out.println(e.getMessage());
        } catch (ValidationException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
