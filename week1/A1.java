import java.util.ArrayList;

public class Solution {
    static int min(int a , int b){
    if(a<b) return a;
    else return b;
}
    public int maxArea(int[] height) {
        //brute force solution is doing nested for loops to check max area between 2 lines : O(n^2)
        int start=0;
        int end=height.length-1;
        int maxArea=0;
        int i=0;
        while(start<end){
        int area=(end-start)*min(height[start],height[end]);
        if(area>maxArea){
            maxArea=area;
        }
        
        if(height[start]<height[end]){
            start++;
        }
        else end--;
        i++;
        }

        return maxArea;

    }
} 
