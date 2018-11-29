public class BinarySearch {

    public static void main(String[] args) {

    }

    public static int binarySearch(int[] sortedArray, int targetValue) {

        int minIndex = sortedArray[0];
        int maxIndex = sortedArray[sortedArray.length - 1];
        int midIndex = maxIndex / 2; //Have to learn how to floor for this part
        int answer;
        
        while(minIndex != maxIndex){
            if(sortedArray[midIndex] == targetValue){
                answer = midIndex;
                break;
            }else if(sortedArray[midIndex] < targetValue){
                minIndex = midIndex;
                midIndex = maxIndex - ((maxIndex - minIndex) / 2); //Have to learn how to floor for this part
            }else if(sortedArray[midIndex] > targetValue){
                maxIndex = midIndex;
                midIndex = maxIndex / 2; //Have to learn how to floor for this part
            } else {
                answer = -1;
                break;
            }
        }
        return answer;
    }

}