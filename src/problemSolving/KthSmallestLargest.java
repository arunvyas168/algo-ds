package problemSolving;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by arunvyasnarayanan on 2/22/20.
 */
public class KthSmallestLargest {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            if((!pq.isEmpty())&&(pq.size()>k)){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int findKthSmallest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            if((!pq.isEmpty())&&(pq.size()>k)){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String args[]){
        int[] array = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(findKthLargest(array,k));
        System.out.println(findKthSmallest(array,k));

    }
}
