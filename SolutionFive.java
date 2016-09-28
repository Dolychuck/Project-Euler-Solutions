import java.util.ArrayList;
/**
 * A class for Project Euler solution 5
 * @author Dustin Olychuck
 * @version 7/31/2015
 */
public class SolutionFive {
    /**
     * @param num number to be checked for prime
     * @return true if number is prime
     */
    static boolean isPrime(int num) {
        if(num == 2)
            return true;
        for(int i = num - 1; i > 2; i--) {
            if(num % i == 0 || num % 2 == 0)
                return false;
        }
        return true;
    }

    /**
     * @num top number being checked for prime
     * @return list of numbers under num that are prime numbers
     */
    static ArrayList<Integer> primeValue(int num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 2; i < num; i++) {
            if(isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    /**
     * @param numo numerator 
     * @param deno denominator
     * @param factor amount of factors of deno exist
     * @return number of times the denominator factors into the numerator
     */
    static int factors(int numo,int deno,int factor) {
        if(numo % deno != 0)
            return factor;
        else
            return factors(numo/deno,deno,factor+1);
    }

    /**
     * @param num The top value from 1-N
     * @returns lowest multiple of all numbers from 1-N
     */
    static int lowestMultiple(int num) {
        ArrayList<Integer> list = primeValue(num);
        int result = 1;
        for(int i = 0; i < list.size();i++) {
            int most = 0;
            for(int j = num; j > 0;j--) {
                if(most < factors(j,list.get(i),0))
                    most = factors(j,list.get(i),0);
            }
            result = result * (int) Math.pow(list.get(i),most);
        }
        return result;
    }
}