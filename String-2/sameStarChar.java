public boolean sameStarChar(String str) {
  int z = -1;
  for(int i = 1; i < str.length() - 1; i++)
  {
    if(str.charAt(i) == '*') {
      if(str.charAt(i - 1) == str.charAt(i + 1)){
        z = i;
      }
      else {
        return false;
      }
    }
  }
  if(z > 0 || z == -1) {
    return true;
  }
  else {
    return false;
  }
}
