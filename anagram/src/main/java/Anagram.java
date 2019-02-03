import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Character.toLowerCase;

public class Anagram{

    public String word;
    public List<String> results;
    public List<String> r;
    public String s;

    public Anagram(String word) {
        this.word = word;
        this.results = new ArrayList<>();
        this.r = new ArrayList<>();
        this.s = new String();
    }

    public List<String> match(List<String> words){
        this.s = this.fix(words.get(1));
        for (int i = 0; i < words.size() ; i++) {
            if(this.fix(words.get(i)).contentEquals(this.fix(this.word))){
                this.results.add(words.get(i));
            }
        }
        return results;
    }

    public String fix(String word){
       char[] CharArray = word.toCharArray();
       CharArray[0] = toLowerCase(CharArray[0]);
       Arrays.sort(CharArray); String result = new String(CharArray); return result;
    }
}
