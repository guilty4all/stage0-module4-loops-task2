package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int start = 0;
        double res ;
        if (power < 0 ){
            System.out.println("too much power");
        }else{
            while (start <= power){
                res = Math.pow(start,power);
                System.out.printf("%.0f \n",res);
                start++;
            }
        }

    }
}
