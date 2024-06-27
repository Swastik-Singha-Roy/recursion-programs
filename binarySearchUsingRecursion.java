import java.util.*;
public class binarySearchUsingRecursion
{
    public static void main(String args[])
    {
        int[] arr = {1,2,5,6,10,12,25,28,37,40,58,76,87};
        System.out.println(search(arr, 12, 0, arr.length - 1));
    }
    public static int search(int[] arr, int target, int start, int end)
    {
        if(start > end)
            return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target)
            return mid;
        if(arr[mid] > target)
            return search(arr, target, start, mid - 1);
        return search(arr, target, mid + 1, end);
    }
}
