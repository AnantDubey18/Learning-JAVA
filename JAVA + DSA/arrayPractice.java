public class arrayPractice {
    public static boolean DuplicateConstraints(int nums[]){
          for (int i=0; i<nums.length; i++ ){
            for(int j=i+1; j<nums.length; j++){
                if ( nums[i]==nums[j]){
                    return true;
                }
            }
          }
          return false;
    }
 
    
    public static void main(String[] args) {
        int nums [] = {1, 2, 2, 5, 7};

        System.out.println(DuplicateConstraints(nums));
    }
}
