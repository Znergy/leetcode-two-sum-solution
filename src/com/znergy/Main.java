package com.znergy;

public class Main {

    public static void main(String[] args) {
        int[] arrayOfNumbers = {3, 2, 4};
        int target = 6;

        int[] indexArray = twoSum(arrayOfNumbers, target);

        System.out.println("Result: [" + indexArray[0] + ", " + indexArray[1] + "]");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexArray = new int[2];
        for(int i = 0; i <= nums.length; i++ ) {
            if((nums[i] + nums[i+1]) == target) {
                indexArray[0] = i;
                indexArray[1] = i+1;
                break;
            }
        }
        return indexArray;
    }
}
