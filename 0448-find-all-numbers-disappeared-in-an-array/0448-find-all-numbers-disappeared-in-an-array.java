class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
     int n=nums.length;
     int[] count =new int [n+1];
     for(int num : nums){
        count[num]++;
     }   
     List<Integer> result =new ArrayList<>();
     for(int i=1;i<=n;i++){
        if(count[i]==0){
            result.add(i);
        }
     }
     return result;
    }
}