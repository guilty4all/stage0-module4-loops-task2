package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0 ;
        int fact = 0;
        while (count<=printToInclusive){
            fact *= count;
            System.out.println(fact);
            count++;
        }
    }
}
