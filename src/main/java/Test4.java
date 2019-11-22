public class Test4 {

    static class MySet{

        private int size = 0 ;

        private static final int MAX_SIZE = 10;

        private int[] contents = new int[MAX_SIZE];

        public int length() {
            return size;
        }

        public void push(int i) {

            contents[size] = i;
            size++;
        }

        public int pop() {

            if (size == 0)
                throw new RuntimeException("Set Already Empty");

            size--;

            return contents[size];
        }
    }

    public static void main(String[] args){

        //Test Default Creation
        MySet mySet = new MySet();
        System.out.println(mySet.length() == 0);

        //Test Addition and Removal of One Element
        mySet.push(1);
        System.out.println(mySet.length() == 1);

        System.out.println(mySet.pop() == 1);
        System.out.println(mySet.length() == 0);

        //Test Removal when Empty
        try {
            mySet.pop();
            System.out.println("false");
        } catch (RuntimeException exception){
            System.out.println("true");
        }

        //Other Items
        //Test Overflow
        //Test Array Reduction

    }

}
