public int[] biggerTwo(int[] a, int[] b) {
  int sum = a[0] + a[1] - b[0] - b[1];
	if(sum >= 0)
		return a;
	return b;
}
