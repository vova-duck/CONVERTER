package HomeWork14_1;

public class KelvinConverter implements Converter{
    @Override
    public double convert(double temperatureC) {
        return temperatureC + 273.0;
    }
}
