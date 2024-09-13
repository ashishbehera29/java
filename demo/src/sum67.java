public class sum67 {
    
    public int sum67(int[] nums) {
        boolean b = true;
       int sum=0;
     for(int i=0;i<nums.length;i++){
       if(nums[i]==6){
         b=false;
         
         
       }
       else if(nums[i]==7 && !b){
         b=true;
         
       }
      else if(b){
        sum=sum+nums[i];
      }
     }
     return sum;
     }
     
     
     
}
