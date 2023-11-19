package home_work_17;

public class FahrenheitConverter extends TemperatureConverter {

    @Override
    public double fromCelsius(double celsius) {
        return celsius * 1.8 + 32;
    }

    @Override
    public double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}