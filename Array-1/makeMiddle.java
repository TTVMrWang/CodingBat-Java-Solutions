public int[] makeMiddle(int[] nums) {
  int[] midArr = new int[2];
	int half = nums.length/2;
	midArr[0] = nums[half-1];
	midArr[1] = nums[half];
	return midArr;
}
