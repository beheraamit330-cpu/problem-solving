class Solution {
    public static double angleClock(int hour, int minutes) {
        if (hour==12) {
            hour = 0;
        }
        double h_angle = (hour*30)+minutes*0.5;
        double m_angle = minutes*6;
        double angle_bet = Math.abs(h_angle-m_angle);
        if(angle_bet>180){
            angle_bet = 360-angle_bet;
        }
        return angle_bet;
    }
}

/**
logic

hour_hands:
12h ---> 360-degree
1h  ---> 30-degree

minute-hands;
60m ---> 360-degree
1m  ---> 6-degree

relete: 60m ---> 1h
        60m ---> 30-degree
        1m  ---> 0.5-degree

A clock has 360 degrees.
12 hours → each hour = 360/12 = 30°
But the hour hand also moves with minutes.
In 60 minutes, it moves 30°.

Start
Input hour and minutes

If hour == 12:
    hour = 0

Calculate hour angle:
    h = hour*30 + minutes*0.5

Calculate minute angle:
    m = minutes*6

Find difference:
    ans = abs(h-m)

If ans > 180:
    ans = 360-ans

Return ans;
**/

// Time Complexity: O(1)

// Space Complexity: O(1)

