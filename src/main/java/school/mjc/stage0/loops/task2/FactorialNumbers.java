package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int count = 0 ;
        int fact = 1;
        while (count<=printToInclusive){
            if(count == 0){
                System.out.println(1);
                count++;
            }else{
                fact *= count;
                System.out.println(fact);
                count++;
            }
        }
    }
}
