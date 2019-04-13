public class CounterController
{
    private int startValue;
    private int endValue;
    private CounterModel model;

    public CounterController(int startValue, int endValue)
    {
        this.startValue = startValue;
        this.endValue = endValue;
        model = new CounterModel(startValue);
    }


    public void start()
    {
        while(model.getCounter() <= endValue)
        {
            CounterView.display(model.getCounter());
            model.increment();
            try
            {
                Thread.sleep(1000);

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        CounterController c = new CounterController(0, 60);
        c.start();
    }
}
