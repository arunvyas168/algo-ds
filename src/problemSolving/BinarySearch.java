package problemSolving;

/**
 * Created by arunvyasnarayanan on 2/17/20.
 */
public class BinarySearch {

    public static int binarySearch_util(int[] array, int elem, int start, int end){
        if (end<start){
            return -1;
        }
        int mid = (start+end)/2;
        if (array[mid] == elem){
            return mid;
        }else if(array[mid]>elem){
            return binarySearch_util(array, elem, start, mid-1);
        }else{
            return binarySearch_util(array,elem, mid+1, end);
        }
    }

    public static int binarySearch(int[] array, int elem){
        int start = 0;
        int end = array.length-1;
        return binarySearch_util(array, elem, start, end);
    }

    public static void main(String args[]){
        int[] inputArray = { 2, 3, 4, 10, 40, 70, 80};
        int findNumber = 13;
        int result = binarySearch(inputArray, findNumber);
        System.out.println(result);
    }
}
