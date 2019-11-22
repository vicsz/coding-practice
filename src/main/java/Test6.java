public class Test6 {

    private static int getFibannoci(int i) {
        if ((i == 0) || (i == 1))
            return i;

        return getFibannoci(i-1) + getFibannoci(i-2);
    }

    public static void main(String[] args){

        //f(0) -> 0
        System.out.println(getFibannoci(0) == 0);

        //f(1) -> 1
        System.out.println(getFibannoci(1) == 1);

        //f(6) -> 8
        System.out.println(getFibannoci(6) == 8);
    }


}
