package problemSolving;

/**
 * Created by arunvyasnarayanan on 2/24/20.
 */
public class practiceRevision {

    public static void segregateZeroAndOne(int[] array){
        int i=0;
        int j = array.length-1;
        while (i<j){
            if (array[i]==1){
                swap(array, i, j);
                j--;
            }else {
                i++;
            }
        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void SortZeroOneAndTwo(int[] array){

    }

    public static void main(String[] args){
        int[] array = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregateZeroAndOne(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        int[] array2 = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        SortZeroOneAndTwo(array);
        for(int i=0;i<array2.length;i++){
            System.out.print(array2[i]+", ");
        }

    }
}
