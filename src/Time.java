public class Time {
    int hour, min, sec;
    Time(int tSec){
        sec = tSec%60;
        int tMin=tSec/60;
        min = tMin%60;
        int tHour=tSec/3600;
        hour = tHour;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}