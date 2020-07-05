public String repeatEnd(String str, int n) {
  str = str.substring(str.length() - n);
  String s = "";
  for(int i = 0; i < n; i++) {
    s += str;
  }
  
  return s;
}
