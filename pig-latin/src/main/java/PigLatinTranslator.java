public class PigLatinTranslator {

    public String translate(String word){
        String result = "";
        char tempArray[] = word.toLowerCase().toCharArray();
        String firstLetter = Character.toString(word.charAt(0));
        String secondLetter = Character.toString(word.charAt(1));
        String thirdLetter = Character.toString(word.charAt(2));

        if(word.contains("qu")) {
            if (firstLetter == "q") {
                result = word.substring(2) + "quay";
            }
            else{
                result = word.substring(3)+firstLetter+secondLetter+thirdLetter + "y";
            }
        }

        if(firstLetter.matches("a|e|i|o|u")){
            result = word + "ay";
        }

        if(!firstLetter.matches("a|e|i|o|u" ) && !word.contains("qu")) {
            result = word.substring(1) + firstLetter + "ay";
            if (!firstLetter.matches("a|e|i|o|u") && !secondLetter.matches("a|e|i|o|u")) {
                result = word.substring(2) + firstLetter + secondLetter + "ay";
            }
        }

//        if(secondLetter + thirdLetter == "qu") {
//            result = word.substring(1) + firstLetter + "quay";
//        }



        return result;
    }

}
