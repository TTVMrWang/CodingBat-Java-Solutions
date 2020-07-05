public boolean prefixAgain(String str, int n) {
  String s = str.substring(0, n);
  for(int i = n; i <= str.length() - n; i++) {
    if(str.substring(i, i + n).equals(s)) {
      return true;
    }
  }
  
  return false;
}
