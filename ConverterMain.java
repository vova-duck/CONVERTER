package HomeWork14_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConverterMain {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("press any button to start, type quit to stop");
        String input;
        while (!(input = reader.readLine()).equals("quit")){;
        convertTemperature();}


    }

    public static void convertTemperature() throws IOException {
       try {
           System.out.println("type temperature: ");
           double temperature = Double.parseDouble(reader.readLine());
        System.out.println("Type system KELVIN or FAHRENHEIT");
        String type = reader.readLine();
        System.out.println("After covers temperature is " + createConverter(TypesOfScales.valueOf(type)).convert(temperature));
       }catch (NumberFormatException e) {System.out.println("Invalid value");
       }

    }
    public static Converter createConverter(TypesOfScales type){
        switch (type){
            case KELVIN:
                return new KelvinConverter();
            case FAHRENHEIT:
                return new FahrenheitConverter();
            default:
                throw new IllegalStateException("We don`t convert that " + type);
        }

    }
}