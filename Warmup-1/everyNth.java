public String everyNth(String str, int n) {
  int nSize = (int) Math.ceil((double) str.length() / n);
  char[] nchar = new char[nSize];
  int index = 0;

  for(int i = 0; i < str.length(); i += n) {
      nchar[index] = str.charAt(i);
      index++;
  }
 
  return new String(nchar);
}
