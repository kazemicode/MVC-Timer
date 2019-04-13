public class CounterModel
    /*
     * Keeps track of the current state of the counter
     * Defines the initial value of the counter
     * Increments the counter
     */
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

}
