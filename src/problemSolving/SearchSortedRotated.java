package problemSolving;

/**
 * Created by arunvyasnarayanan on 2/17/20.
 */
public class SearchSortedRotated {

    public static int sortedRotatedSearchUtil(int[] array, int key, int start, int end){
        if(end<start){
            return -1;
        }
        int mid = start+(end-start)/2;
        if (key == array[mid]){
            return mid;
        }

        if (array[start]<=array[mid]){
            if ((array[start]<=key)&&(key<array[end])){
                return sortedRotatedSearchUtil(array, key, start, mid-1);
            }else{
                return sortedRotatedSearchUtil(array, key, mid+1, end);
            }
        }else{
            if ((array[mid]<key)&&(key<=array[end])){
                return sortedRotatedSearchUtil(array, key, mid+1, end);
            }else {
                return sortedRotatedSearchUtil(array, key, mid-1, end);
            }
        }

    }

    public static int sortedRotatedSearch(int[] array, int key){
        int length = array.length;
        return sortedRotatedSearchUtil(array, key, 0, length-1);
    }

    public static void main(String args[]){
        int[] array = {4,5,6,7,0,1,2};
        int searchIndex = sortedRotatedSearch(array,2);
        System.out.println(searchIndex);
    }
}
