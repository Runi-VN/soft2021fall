package temperatureconverter;

/**
 * Converts temperatures. Possible values: Fahrenheit, Celsius.
 */
public class Converter {
    private final static int CONSTANT = 32;
    private final static Double ABS_ZERO_FAHRENHEIT = -459.67;
    private final static Double ABS_ZERO_CELSIUS = -273.15;

    public Converter() {
    }

    /**
     * Converts a fahrenheit value to celsius if within bounds.
     *
     * @param fahrenheitValue value to convert
     * @return the converted value as a Double
     */
    public Double fromFahrenheitToCelsius(Double fahrenheitValue) {
        if (fahrenheitValue < ABS_ZERO_FAHRENHEIT)
            throw new IllegalArgumentException(String.format("Converter does not support conversions lower than absolute zero. (%.2f)", ABS_ZERO_FAHRENHEIT));
        return (fahrenheitValue - CONSTANT) / 1.8;
    }

    /**
     * Converts a celsius value to fahrenheit if within bounds.
     *
     * @param celsiusValue value to convert
     * @return the converted value as a Double
     */
    public Double fromCelsiusToFahrenheit(Double celsiusValue) {
        if (celsiusValue < ABS_ZERO_CELSIUS)
            throw new IllegalArgumentException(String.format("Converter does not support conversions lower than absolute zero. (%.2f)", ABS_ZERO_CELSIUS));
        return (celsiusValue * 1.8) + CONSTANT;
    }
}
