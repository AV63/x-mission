package src.code.arraysAndStrings;

public class Solution {

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int lastIndexWithoutVal = 0;

        for (int currentIndex = 0; currentIndex < n; currentIndex++) {
            if (nums[currentIndex] != val) {
                nums[lastIndexWithoutVal] = nums[currentIndex];
                lastIndexWithoutVal++;
            }
        }

        return lastIndexWithoutVal;
    }

}

class Test{

    public static void main(String[] args) {

    }

}
