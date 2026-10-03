class energymethod
{
    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy)
    {
        return morningEnergy + eveningEnergy;
    }
}
public static void main(String[] args)
{
    double totalEnergy = energymethod.calculateTotalEnergy(10.5, 15.3);
    System.out.println("Total Energy Generated: " + totalEnergy + " kWh");
}