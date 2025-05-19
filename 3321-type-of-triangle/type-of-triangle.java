class Solution {
    public String triangleType(int[] nums) {
        int sideA = nums[0];
        int sideB = nums[1];
        int sideC = nums[2];
        
        int sumsideAB = sideA + sideB;
        int sumsideBC = sideB + sideC;
        int sumsideAC = sideA + sideC;

        if(sumsideAB <= sideC || sumsideBC <= sideA || sumsideAC <= sideB) return "none" ;

        if( sideA == sideB && sideC == sideB && sideA == sideC ) return "equilateral";

        if( sideA == sideB || sideC == sideB || sideA == sideC ) return "isosceles";

        return "scalene";
    }
}