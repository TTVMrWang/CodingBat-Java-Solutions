public String startWord(String str, String word) {
	int lenStr = str.length();
	int lenWord = word.length();
	String temp;
	if (lenStr >= lenWord) {
		temp = str.substring(1, lenWord);
		if (word.substring(1).equals(temp)) {
			return (str.charAt(0)+temp);
		}
		else {
			return "";
		}
	}
	else {
		return "";
	}
}
