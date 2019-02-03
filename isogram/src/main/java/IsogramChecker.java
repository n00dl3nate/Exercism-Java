import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        char tempArray[] = phrase.toLowerCase().toCharArray();
        Arrays.sort(tempArray);
        for (int i = 0; i < tempArray.length-1; i++) {
            if(tempArray[i] == tempArray[i+1] && Character.isLetter(tempArray[i]) == true){
                return false;
            }
        }
        return true;
    }
}
