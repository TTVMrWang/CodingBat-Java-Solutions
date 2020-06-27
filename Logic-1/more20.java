public boolean more20(int n) {
  int r = n % 20;
  if (r == 1  || r == 2) {
    return true;
  }
  
  return false;
}
