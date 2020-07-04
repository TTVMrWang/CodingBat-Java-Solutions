public boolean xyBalance(String str) {
  int len = str.length() - 1;
	char ch;
	for(int i = len; i >= 0; i--)
	{
		ch = str.charAt(i);
		if(ch == 'x')
			return false;
		else if(ch == 'y')
			return true;
	}
	
	return true;  
}
