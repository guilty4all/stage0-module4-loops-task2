package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0 ;
        if (multiplyByAndToInclusive < 0) {
            while (counter <= (multiplyByAndToInclusive * -1)) {
                System.out.println(counter * multiplyByAndToInclusive);
                counter++;
            }
        } else if (multiplyByAndToInclusive == 0) {
            System.out.println("");
        }else{
            while (counter<= multiplyByAndToInclusive){
                System.out.println(counter*multiplyByAndToInclusive);
                counter++;
            }
        }
    }
}
