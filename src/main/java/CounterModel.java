import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterModel
        /*
         * Keeps track of the current state of the counter
         * Defines the initial value of the counter
         * Increments the counter
         */
{
    private int min, sec;
    private String timerString;
    public CounterModel(int startValue)
    {
        min = startValue;
        sec = 0;

        timerString = "0:00";
    }

    public void increment()
    {
        sec++;
        if(sec == 60)
        {
            sec = 0;
            min++;
        }

        timerString = min + ":";

        if(sec < 10)
        {
            timerString += "0";
        }
        timerString += sec;
    }

    public String getTimerString()
    {
        return timerString;
    }

    public int getMin()
    {
        return min;
    }



}
