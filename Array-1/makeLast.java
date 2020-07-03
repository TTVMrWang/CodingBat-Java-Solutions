public int[] makeLast(int[] nums) {
  int len = nums.length * 2;
	int[] dubsArr = new int[len];
	dubsArr[len - 1] = nums[nums.length - 1];
	return dubsArr;
}
