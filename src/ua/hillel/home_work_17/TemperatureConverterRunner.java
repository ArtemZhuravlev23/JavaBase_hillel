package ua.hillel.home_work_17;


import java.util.Scanner;

public class TemperatureConverterRunner {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter temperature in °C: ");
        double temperatureCelsius = scanner.nextDouble();

        KelvinConverter celsiusToKelvinConverter = new KelvinConverter();
        FahrenheitConverter celsiusToFahrenheitConverter = new FahrenheitConverter();


        double kelvinTemperature = celsiusToKelvinConverter.fromCelsius(temperatureCelsius);
        System.out.println(temperatureCelsius + "°C degrees converted to " + kelvinTemperature + "K");

        double celsiusFromKelvin = celsiusToKelvinConverter.toCelsius(kelvinTemperature);
        System.out.println(kelvinTemperature + "K degrees converted to " + celsiusFromKelvin + "°C");

        double fahrenheitTemperature = celsiusToFahrenheitConverter.fromCelsius(temperatureCelsius);
        System.out.println(temperatureCelsius + "°C degrees converted to " + fahrenheitTemperature + "°F");

        double celsiusFromFahrenheit = celsiusToFahrenheitConverter.toCelsius(fahrenheitTemperature);
        System.out.println(fahrenheitTemperature + "°F degrees converted to " + celsiusFromFahrenheit + "°C");
    }
}
