package HomeWork14_1;

public class FahrenheitConverter implements Converter{
    @Override
    public double convert(double TemperatureC) {
        return TemperatureC * 1.8 + 32;
    }
}
