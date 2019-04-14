import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CounterWindow extends JFrame implements ActionListener
{
        public static final int WIDTH = 300;
        public static final int HEIGHT = 300;
        private JPanel box;
        private JButton startTimer;
        private JTextField timeText;

        public CounterWindow()
        {
            super("TIMER");
            setSize(WIDTH, HEIGHT);
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            box = new JPanel();
            add(box, "Center");
            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());
            JButton endButton = new JButton("CLOSE");
            endButton.addActionListener(this);
            buttonPanel.add(endButton);
            startTimer = new JButton("START TIMER");
            buttonPanel.add(startTimer);
            add(buttonPanel, "South");
            JLabel counterLabel = new JLabel("Timer: ");
            box.add(counterLabel);
            timeText = new JTextField("0:00");
            timeText.setEditable(false);
            box.add(timeText);
        }

        public JPanel getBox()
        {
            return box;
        }

        public JButton getStartTimer()
        {
            return startTimer;
        }

        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }

        public JTextField getTimeText()
        {
            return timeText;
        }



}


