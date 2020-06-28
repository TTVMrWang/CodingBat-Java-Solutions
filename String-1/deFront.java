public String deFront(String str) {    
	int len = str.length();
	if (len >= 2) {
		StringBuilder stbuild = new StringBuilder(len);
		if (str.charAt(0) == 'a') {
			stbuild.append('a');
		}
		if (str.charAt(1) == 'b') {
			stbuild.append('b');
		}
		stbuild.append(str.substring(2));
		return stbuild.toString();
	}
	else if (len == 1 && str.charAt(0) == 'a') {
		return "a";
	}
	else {
		return "";
	}
}
