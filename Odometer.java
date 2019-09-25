class Odometer
{
    private int miles, usedFuel, fuelEfficiency;

	public Odometer()
	{
        miles = 0; fuelEfficiency = 0; usedFuel = 0;
    }
	public String toString()
	{
		return ("Miles driven: " + miles + "\n" + "Fuel Efficeiency: " + fuelEfficiency  + "\n" + "Total gallons of used gas: " + usedFuel);
	}
	public void set_Odometer(int m)
	{
        miles += m;
    }
    public void set_FuelEfficency(int fe)
    {
        fuelEfficiency = fe;
    }
    public void set_UsedFuel()
    {
        usedFuel = miles / fuelEfficiency;
    }
    public void reset_Odometer ()
    {
        miles = 0;
    }
}