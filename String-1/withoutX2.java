public String withoutX2(String str) {
  int len = str.length();
	if (len >= 2) {
		char ch = str.charAt(0);
		StringBuilder stbuild = new StringBuilder(len);
		if (ch != 'x') {
			stbuild.append(ch);
		}
		ch = str.charAt(1);
		if (ch != 'x') {
			stbuild.append(ch);
		}
		stbuild.append(str.substring(2));
		return stbuild.toString();
	}
	else if (len == 1 && str.charAt(0) == 'x') {
		return "";
	}
	else {
		return str;
	}
}
