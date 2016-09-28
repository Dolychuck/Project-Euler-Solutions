/**
 * A class for Project Euler solution 3
 * @author Dustin Olychuck
 * @version 7/31/2015
 */
public class SolutionThree {
    /**
     * A method to find largest prime factors of a given value
     * @param value The value which is being factored for primes
     * @param largest The current largest factor (initiate with 0)
     * @return largest prime factor of a given value
     */
    static long primeFactors(long value,long largest) {
        if(largest >= value) 
            return value;
        for(long i = 2; i < value;i++) {
            if(value % i == 0) {
                return primeFactors(value/i,i);
            }
        }
        return value;
    }
}