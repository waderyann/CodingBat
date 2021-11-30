public boolean sum28(int[] nums) {
  int count = 0;
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 2){
      count += 2;
    }
  }
  if (count == 8){
    return true;
  }
  return false;
}
