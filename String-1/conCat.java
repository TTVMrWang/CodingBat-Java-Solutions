public String conCat(String a, String b) {
	int lenA = a.length();
	int lenB = b.length();
	if (lenA >= 1 && lenB >= 1) {
		if (a.charAt(lenA - 1) == b.charAt(0)) {
			return (a + b.substring(1));
		}
		else {
			return (a + b);
		}
	}
	
	return (a + b);
}
