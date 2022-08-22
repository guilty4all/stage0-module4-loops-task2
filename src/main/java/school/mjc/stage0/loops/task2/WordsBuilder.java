package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int count = 0;
        int l = chars.length;
        String result = "";
        while (count <l){
            result += chars[count];
            count++;
        }
        System.out.println(result);

    }
}
