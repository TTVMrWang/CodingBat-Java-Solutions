public String repeatFront(String str, int n) {
  String s = "";
  for(int i = 0; i < n; n--) {
    s += str.substring(0, n);
  }
  
  return s;
}
