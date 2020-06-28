public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
   if (isMorning && !isMom) {
     return false;
   }
   else if (isAsleep) {
     return false;
   }
   
  return true;
}
