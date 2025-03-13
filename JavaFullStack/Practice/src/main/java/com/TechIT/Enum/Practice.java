package com.TechIT.Enum;

public class Practice {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(i);
        }

        int index = 0;
        for(int x : nums)
        {
            System.out.print(index+" ");
            index++;
        }
    }
}
