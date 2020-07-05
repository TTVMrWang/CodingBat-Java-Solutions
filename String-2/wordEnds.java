public String wordEnds(String str, String word) {
  String s = "";
  int i = 0;
  int end = 0;
  int l =str.length();
  while(i < str.length()) {
    end = i + word.length();
    if(end > l) {
      end = l;
    }
    if(str.substring(i, end).equals(word)) {
      if(i > 0) {
        s += str.charAt(i - 1);
      }
      if(i + word.length() < l) {
        s += str.charAt(end);
      }
      
    }
    i++;
  }
  return s;
}
