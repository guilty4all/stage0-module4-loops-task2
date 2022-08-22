package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int start = 0;
        if (power < 0 ){
            System.out.println("too much power");
        }else{
            while (start <= power){
                System.out.println(2^start);
                start++;
            }
        }

    }
}
