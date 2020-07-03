public boolean xyzThere(String str) {
  int len = str.length() - 2;
	for(int i = 0; i < len; i++) {
		if(str.charAt(i) == 'x' && str.charAt(i+1) == 'y' && str.charAt(i+2) == 'z') {
			if(i == 0 || str.charAt(i-1) != '.')
				return true;
		}
	}
	
	return false;
}
