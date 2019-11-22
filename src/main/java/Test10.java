public class Test10 {

    public static void main(String[] args){

        //f(Test) -> tseT
        System.out.println(reverse("Test").equals("tseT"));
    }

    public static String reverse(String input){

        StringBuilder output = new StringBuilder("");

        for(int i = (input.length()-1); i >=0; i--){
            output.append(input.charAt(i));
        }

        return output.toString();
    }
}
