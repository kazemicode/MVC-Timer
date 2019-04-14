import java.awt.Graphics;
public class CounterView
        /*
         * Displays the current value of counter
         */
{
    private CounterWindow cw;

    public CounterView(CounterWindow cw)
    {
        this.cw = cw;
    }


    public void display(String timerString)
    {
        cw.getTimeText().setText(timerString);
    }

}
