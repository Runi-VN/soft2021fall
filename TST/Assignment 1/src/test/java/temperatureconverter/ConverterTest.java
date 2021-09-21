package temperatureconverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("temperatureconverter.ConvertTest")
class ConverterTest {
    private static Converter converter;

    @BeforeEach
    void setUp() {
        converter = new Converter();
    }

    @Nested
    @DisplayName("testFromFahrenheitToCelsius")
    class testFahrenheitToToCelsius {

        @Test
        void testPositiveValue() {
            //Arrange
            Double fahrenheitValue = 100.00;
            Double expectedResult = 37.77777777777778;

            //Act
            var result = converter.fromFahrenheitToCelsius(fahrenheitValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testNegativeDegreeIntersect() {
            //Arrange
            Double fahrenheitValue = -40.00;
            Double expectedResult = -40.00;

            //Act
            var result = converter.fromFahrenheitToCelsius(fahrenheitValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testAbsoluteZero() {
            //Arrange
            Double fahrenheitValue = -459.67;
            Double expectedResult = -273.15;

            //Act
            var result = converter.fromFahrenheitToCelsius(fahrenheitValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testThrowsIAEWhenOOB() {
            //Arrange
            Double fahrenheitValue = -1000.00; //lower than absolute zero
            //Double expectedResult = -573.333333333;
            String expectedResult = "Converter does not support conversions lower than absolute zero. (-459,67)";

            //Act
            Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    converter.fromFahrenheitToCelsius(fahrenheitValue));

            //Assert
            assertEquals(expectedResult, exception.getMessage());
        }
    }

    @Nested
    @DisplayName("testFromCelsiusToFahrenheit")
    class testCelsiusToFahrenheit {
        @Test
        void testPositiveValue() {
            //Arrange
            Double celsiusValue = 100.00;
            Double expectedResult = 212.00;

            //Act
            var result = converter.fromCelsiusToFahrenheit(celsiusValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testNegativeDegreeIntersect() {
            //Arrange
            Double celsiusValue = -40.00;
            Double expectedResult = -40.00;

            //Act
            var result = converter.fromCelsiusToFahrenheit(celsiusValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testAbsoluteZero() {
            //Arrange
            Double celsiusValue = -273.15;
            Double expectedResult = -459.66999999999996;

            //Act
            var result = converter.fromCelsiusToFahrenheit(celsiusValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testThrowsIAEWhenOOB() {
            //Arrange
            Double celsiusValue = -1000.00; //lower than absolute zero
            //Double expectedResult = -573.333333333;
            String expectedResult = "Converter does not support conversions lower than absolute zero. (-273,15)";

            //Act
            Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    converter.fromCelsiusToFahrenheit(celsiusValue));

            //Assert
            assertEquals(expectedResult, exception.getMessage());
        }
    }
}