public String lastChars(String a, String b) {
	int lenB = b.length();
	String combStr = "";
	combStr += (a.length() >= 1) ? a.charAt(0) : '@';
	combStr += (lenB >= 1) ? b.charAt(lenB - 1) : '@';
	return combStr;
}
