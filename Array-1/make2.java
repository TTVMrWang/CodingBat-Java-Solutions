public int[] make2(int[] a, int[] b) {
  int[] comb = new int[2];
	if(a.length >= 2) {
		comb[0] = a[0];
		comb[1] = a[1];
	}
	else if(a.length == 1) {
		comb[0] = a[0];
		comb[1] = b[0];
	}
	else {
		comb[0] = b[0];
		comb[1] = b[1];	
	}
	return comb;
}
