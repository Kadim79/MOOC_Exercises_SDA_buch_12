package mooc.week5;

import java.time.LocalDateTime;

public class Ex89 {

    public static void main(String[] args) throws InterruptedException {

        Clock clock = new Clock(23, 59, 55);
        Clock clock1 = new Clock();

        clock.tick(1000, 5);
        clock1.tick(1000, 5);
    }
}

class Clock {

    private String hours;
    private String minutes;
    private String seconds;
    private boolean chooseClockFeatures;


    public Clock() {

        chooseClockFeatures = true;
        this.takeRealTime();
        System.out.println("Time is seted to current time :  " + this.toString());
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = String.valueOf(hours);
        this.minutes = String.valueOf(minutes);
        this.seconds = String.valueOf(seconds);
        System.out.println("Time seted by me :  " + this.toString());
    }

    public void takeRealTime() {
        LocalDateTime time = LocalDateTime.now();
        this.hours = convertTimeFormat(time.getHour());
        this.minutes = convertTimeFormat(time.getMinute());
        this.seconds = convertTimeFormat(time.getSecond());
    }

    public void updateClock() {
        if (Integer.parseInt(this.seconds) > 59) {
            this.minutes = convertTimeFormat(Integer.parseInt(this.minutes)+1);
            this.seconds = "00";
        }

        if (Integer.parseInt(this.minutes)> 59) {
            this.hours = convertTimeFormat(Integer.parseInt(hours)+1);
            this.minutes = "00";
        }

        if (Integer.parseInt(this.hours)>23)
            this.hours = "00";
    }

    public void tick(int seconds, int timeInterval) throws InterruptedException {

        if (chooseClockFeatures == false) {
            for (int i = 0; i < timeInterval; i++) {
                Thread.sleep(1000);
                this.seconds = convertTimeFormat(Integer.parseInt(this.seconds)+1);
                updateClock();
                System.out.println("Timer: " + toString());
            }
        } else {
            for (int i = 0; i < timeInterval; i++) {
                Thread.sleep(1000);
                takeRealTime();
                System.out.println("Real time clock: " + toString());
            }
        }
        System.out.println();
    }

    public String convertTimeFormat(int time){

        if(time<10)
            return "0"+String.valueOf(time);
        else
            return String.valueOf(time);
    }

    @Override
    public String toString() {
        return hours + ":" + minutes + ":" + seconds;
    }
}
