public boolean arrayFront9(int[] nums) {
  int max = nums.length;
  if (max > 4) {
    max = 4;
  }
  
  for (int i = 0; i < max; i++) {
    if(nums[i] == 9) {
      return true;
    }
  }
  
  return false;
}
