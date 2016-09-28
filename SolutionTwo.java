/**
 * A class for Project Euler solution 2
 * @author Dustin Olychuck
 * @version 7/31/2015
 */
public class SolutionTwo {
    /**
     * @param first starting term in sequence
     * @param second second term in sequence
     * @param topValue largest value in sequence
     * @return sum of even numbers in sequence
     */    
    static int fibonacci(int first,int second,int topValue) {
        int total = 2; 
        int result = 0;
        while(true) {
            if(result >= topValue) 
                break;
            result = first + second;
            first = second;
            second = result;
            if(result % 2 == 0) {
                total = total + result;
            }
        }
        return  total;
    }
}