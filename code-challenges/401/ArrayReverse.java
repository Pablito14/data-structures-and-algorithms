public class ArrayReverse {

    public static void main(String[] args) {
        String[] example = new String[3];
        example[0] = "zero";
        example[1] = "one";
        example[2] = "two";
        String[] answer = reverseArray(example);
        System.out.println(answer);
    }

    public static String[] reverseArray(String[] arrayToReverse){
        String[] reversedArray = new String[arrayToReverse.length];
        int i = 0;
        int j = arrayToReverse.length-1;

        while(j < 0){
            reversedArray[i] = arrayToReverse[j];
            i++;
            j--;
        }
        return reversedArray;
    }













}
