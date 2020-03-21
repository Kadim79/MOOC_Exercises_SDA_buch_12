package mooc.week5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex91 {

    public static void main(String[] args) {

        MyDate day = new MyDate(25, 2, 2011);
        System.out.println(day.toString());

        MyDate newDay = day.afterNumberOfDays(7);
        System.out.println(newDay.toString());

        day.earlier(newDay);

        for (int i = 1; i <= 7; ++i) {
            System.out.println("Friday after  " + i + " weeks is " + newDay);
            newDay = newDay.afterNumberOfDays(7);
        }

        System.out.println("This week's Friday is " + day);
        System.out.println("The date 790 days from this week's Friday is "
                + day.afterNumberOfDays(790));
        System.out.println(day.differenceInYears(newDay));
    }
}


class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {

        if (day > 30 || month > 12)
            System.out.println("You entered wrong data. Please try again!");

        this.day = day;
        this.month = month;
        this.year = year;
        this.toString();
    }

    public String toString() {

        String day = String.valueOf(this.day);
        String month = String.valueOf(this.month);
        String year = String.valueOf(this.year);
        if (this.day < 10)
            day = "0" + this.day;
        if (this.month < 10)
            month = "0" + this.month;

        return day + "." + month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {

        if (convertToDateFormat(this).compareTo(convertToDateFormat(compared)) < 0)
        {
            System.out.println("This date is before the compared one!");
            return true;
        }
        else
        {
            System.out.println("This date is after the compared one!");
            return false;
        }

    }

    public LocalDate convertToDateFormat(MyDate date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return LocalDate.parse(this.toString(),formatter);
    }

    public void advance() {
        this.day += 1;
    }

    public void advance(int numberOfDays) {

        this.day += numberOfDays;
        checkUpdate();
    }

    public void checkUpdate() {

        if (this.day > 30) {

            this.month += this.day / 30;
            this.year += this.month / 12;
            this.month = (this.month % 12 == 0) ? 1 : this.month % 12;
            this.day = (this.day % 30 == 0) ? 30 : this.day % 30;
        }
    }

    public MyDate afterNumberOfDays(int days) {

        MyDate newDate = new MyDate(this.day, this.month, this.year);
        newDate.day += days;
        newDate.checkUpdate();
        return newDate;
    }

    public String differenceInYears(MyDate comparedDate) {

        return "The difference between " + this.toString() + " and " + comparedDate.toString() +
                " is " + Math.abs(this.year - comparedDate.year) + " years, " +
                Math.abs(this.month - comparedDate.month) + " months and " +
                Math.abs(this.day - comparedDate.day) + " days.";
    }
}

