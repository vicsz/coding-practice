import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test5 {

    private static Object reverseString(String input) {

        String[] stringArray = input.split(" ");

        List<String> stringList = Arrays.asList(stringArray);

        Collections.reverse(stringList);

        return String.join(" ", stringList);
    }

    private static Object reverseStringManual(String input){

        StringBuilder returnSentence = new StringBuilder();

        StringBuilder currentWord = new StringBuilder("");

        for(int i = input.length()-1; i >= 0; i--){

            if (input.charAt(i) == ' '){
                returnSentence.append(currentWord).append(" ");
                currentWord = new StringBuilder("");
            } else {
                currentWord.insert(0, input.charAt(i));
            }
        }

        returnSentence.append(currentWord);

        return returnSentence.toString();
    }

    public static void main (String[] args){

        System.out.println(reverseString("bob likes dogs").equals("dogs likes bob"));

        System.out.println(reverseStringManual("bob likes dogs"));
    }


}
