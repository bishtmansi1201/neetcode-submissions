// // Brute force
// class Solution {
//     public boolean hasDuplicate(int[] nums) {
//         for (int i=0; i < nums.length; i++){
//             for (int j= i+1; j< nums.length;j++){
//                 if (nums[i] == nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

// //sorting
// public class Solution{
//     public boolean hasDuplicate(int[] nums){
//         Arrays.sort(nums);
//         for( int i=1; i< nums.length; i++){
//             if(nums[i] == nums[i-1]){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// //Hash set
// public class Solution{
//     public boolean hasDuplicate(int[] nums){
//         Set<Integer> seen = new HashSet<>();
//         for (int num : nums ){
//             if (seen.contains(num)){
//                 return true;
//             }
//             seen.add(num);
//         }
//         return false;
//     }
// }

//Hash set length
public class Solution{
    public boolean hasDuplicate(int[] nums){
        return Arrays.stream(nums).distinct().count()< nums.length;
    }
}


