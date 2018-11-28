public class ArrayShift {

    public static void main(String [] args){
        System.out.println("Rest in peace Stephen Hillenburg, enjoy that sweet, sweet victroy yeah...");
        int[] myArray = new int[3];
        int[] myOtherArray = new int[4];

        int [] oddAnswer = insertShiftArray(myArray, 9);
        int [] evenAnswer = insertShiftArray(myOtherArray, 9);

        System.out.println(oddAnswer);
        System.out.println(evenAnswer);
    }

    public static int[] insertShiftArray(int[] oldArray, int nuevo){
        int[] newArray = new int[oldArray.length+1];
        int center;

        // figures out the center for odd & even arrays so we can put the new thing in that spot
        if (oldArray.length % 2 != 0){
            center = (oldArray.length/2) + 1;
        } else {
            center = oldArray.length/2;
        }

        /** LOGIC
         * 1. old numbers get shoved into the new array UNTIL
         * 2. we arrive at the midpoint (put new value in)
         * 3. now everything is off by one so continue for the rest of the array, with that in mind
         */
        for (int i = 0; i < oldArray.length; i++) {
            if( i < center){
                newArray[i] = oldArray[i];
            } else if(i == center) {
                newArray[i] = nuevo;
            } else {
                newArray[i] = oldArray[i-1];
            }
        }
        return newArray;
    }






}