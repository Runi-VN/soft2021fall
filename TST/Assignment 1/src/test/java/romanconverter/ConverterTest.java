package romanconverter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("romanconverter.ConvertTest")
class ConverterTest {

    private static Converter converter;

    @BeforeEach
    void setUp() {
        converter = new Converter();
    }

    @Nested
    @DisplayName("testArabicToRoman")
    class testFromArabicToRoman {

        @Test
        void testPositiveSingularValue() {
            //Arrange
            int arabicValue = 100;
            String expectedResult = "C";

            //Act
            String result = converter.fromArabicToRoman(arabicValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testPositiveMultiValue() {
            //Arrange
            int arabicValue = 2099;
            String expectedResult = "MMXCIX";

            //Act
            String result = converter.fromArabicToRoman(arabicValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testMinimum() {
            //Arrange
            int arabicValue = 1;
            String expectedResult = "I";

            //Act
            String result = converter.fromArabicToRoman(arabicValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testMaximum() {
            //Arrange
            int arabicValue = 3999;
            String expectedResult = "MMMCMXCIX";

            //Act
            String result = converter.fromArabicToRoman(arabicValue);

            //Assert
            assertEquals(expectedResult, result);
        }

        @Test
        void testThrowsIAEWhenOOBMinimum() {
            //Arrange
            int arabicValue = 0; //lower than minimum
            String expectedResult = "ArabicValue cannot be lower than 1 or greater than 3999.";

            //Act
            Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    converter.fromArabicToRoman(arabicValue));

            //Assert
            assertEquals(expectedResult, exception.getMessage());
        }

        @Test
        void testThrowsIAEWhenOOBMaximum() {
            //Arrange
            int arabicValue = 4000; //higher than maximum
            String expectedResult = "ArabicValue cannot be lower than 1 or greater than 3999.";

            //Act
            Exception exception = assertThrows(IllegalArgumentException.class, () ->
                    converter.fromArabicToRoman(arabicValue));

            //Assert
            assertEquals(expectedResult, exception.getMessage());
        }
    }
}