public boolean endOther(String a, String b) {
  int aLen = a.length();
	int bLen = b.length();
	String end;
	String temp;
	a = a.toLowerCase();
	b = b.toLowerCase();
	if(aLen >= bLen) {
		end = a.substring(aLen - bLen);
		temp = b;
	}
	else {
		end = b.substring(bLen - aLen);
		temp = a;
	}
	
	return (end.equals(temp));
}
