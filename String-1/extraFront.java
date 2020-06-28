public String extraFront(String str) {
	String temp;
	if (str.length() >= 3) {
		temp = str.substring(0, 2);
	}
	else {
		temp = str;
	}
	return (temp + temp + temp);
}
