class Solution {
    public double angleClock(int hour, int minutes) {
        double hour_angle=((hour)+minutes/60.0)*30;
       double minutes_angle=minutes*6;
        double diff=Math.abs(hour_angle-minutes_angle);
        if(diff>180){
            diff=360-diff;
           
        }
         return diff;
    }
}