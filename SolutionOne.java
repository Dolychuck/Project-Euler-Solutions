/**
 * A class for Project Euler solution 1
 * @author Dustin Olychuck
 * @version 7/31/2015
 */
public class SolutionOne {
    /**
     * A method to find the sum of all multiples of 3 & 5 under a given value
     * @param value Is the top value 
     * @return lowest multiples of 3 & 5
     */
    static int multiples(int value) {
        int result = 0;
        for(int i = 0; i < value; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                result = result + i;
            }
        }
        return result;
    }
}
