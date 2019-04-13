public class CounterModel
{
    private int counter;
    public CounterModel(int initialValue)
    {
        counter = initialValue;
    }

    public void increment()
    {
        counter++;
    }

    public int getCounter()
    {
        return counter;
    }

    public void setCounter(int counter)
    {
        this.counter = counter;
    }
}
