package Top_Interview_150.Array_String;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];
        k = k % n;
        for (int i = 0 ; i < n ; i++)
        {
            rotated[(i + k) % n] = nums[i];
        }
        for (int i = 0 ; i < n ; i++)
        {
            nums[i] = rotated[i];
        }
    }
}
