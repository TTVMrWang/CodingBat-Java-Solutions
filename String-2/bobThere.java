public boolean bobThere(String str) {
  int len = str.length() - 2;
	for(int i = 0; i < len; i++)
	{
		if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
			return true;
	}
	
	return false;
}
