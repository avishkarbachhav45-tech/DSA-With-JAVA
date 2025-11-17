// import java.util.*;
public class TrappingRainWater {
    public static int trappedRainWatter(int heights[]){

        int n = heights.length;

        // leftMax - array
        int leftMax[] = new int[n];
        leftMax[0] = heights[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(heights[i], leftMax[i - 1]);
        }
        
        // rightMax - array
        int rightMax[] = new int[n];
        rightMax[n-1] = heights[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(heights[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){

            //waterlevel = min(leftMax boundary), min(rightMax boundary)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            //trappedWater = waterlevel - height
            trappedWater += waterlevel - heights[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int heights[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWatter(heights));
    }
}
