import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController implements ActionListener
        /*
         * Defines the start and stop values of the counter
         * Creates an instance of CounterModel to set counter
         * value to startValue.
         * Start method runs while the current state of the
         * counter has not surpassed the endValue
         */

{
    private static int startValue = 0;
    private static int endValue = 60;
    static int PAUSE = 1000; // ms
    private CounterModel model;
    private CounterView view;
    private JButton start;
    private static CounterWindow cw;


    public CounterController(CounterView view, CounterModel model)
    {
        this.start = cw.getStartTimer();
        start.addActionListener(this);
        this.model = model;
        this.view = view;
    }



    public void actionPerformed(ActionEvent e)
    {
        Packer packerThread = new Packer();
        packerThread.start();
    }

    public static void main(String[] args)
    {
        CounterModel cm = new CounterModel(startValue);
        cw = new CounterWindow();
        CounterController c = new CounterController(new CounterView(cw), new CounterModel(startValue));
        cw.setVisible(true);

    }

    // private inner class

    private class Packer extends Thread
    {
        @Override
        public void run()
        {

            while(model.getMin() <= endValue)
            {
                view.display(model.getTimerString());
                model.increment();
                doNothing(PAUSE);
            }
        }

        public void doNothing(int ms)
        {
            try
            {
                Thread.sleep(ms);

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
                System.exit(0);
            }
        }
    }


}

