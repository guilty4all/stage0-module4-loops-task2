package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        int l = chars.length;
        while (count <l){
            System.out.print(chars[count]);
            count++;
        }


    }
}
