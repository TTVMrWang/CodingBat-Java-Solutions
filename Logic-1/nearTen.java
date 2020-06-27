public boolean nearTen(int num) {
  int[] checklist = {num%10, (num+1)%10, (num+2)%10};
  
  for(int i = 0; i <3; i++){
    if(0 <= checklist[i] && checklist[i] <3 ){
      return true;
    }
  }
  
  return false;
}
