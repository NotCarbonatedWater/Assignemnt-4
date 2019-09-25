class Temperature
{
    private double DegreesC, DegreesF;

	public Temperature()
	{
        DegreesC = 0; DegreesF = 0;
    }
	public void cToF (int c)
	{
        DegreesF = ((9*c)/5) + 32;
    }
    public void fToC (int f)
    {
        DegreesC = ((f - 32) * 5) / 9;
    }
    public String toString()
	{
		return ("Celsius: " + DegreesC + " = " + "Fahrenheit: " + DegreesF);
	}
}
