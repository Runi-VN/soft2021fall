package romanconverter;

import java.util.NoSuchElementException;
import java.util.TreeMap;

/**
 * Converts values to roman numerals. Possible values: int
 */
public class Converter {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    private final static int MINIMUM = 1;
    private final static int MAXIMUM = 3999;

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }


    public Converter() {
    }

    /**
     * Converts a given int value to its roman counterpart if within bounds.
     *
     * @param arabicValue value to convert
     * @return the converted value as a String.
     */
    public String fromArabicToRoman(int arabicValue) {
        if (arabicValue < 1 || arabicValue > 3999)
            throw new IllegalArgumentException(String.format("ArabicValue cannot be lower than %d or greater than %d.", MINIMUM, MAXIMUM));
        var location = map.floorKey(arabicValue); //Returns the greatest key less than or equal to the given key, else null
        if (location == arabicValue) {
            return map.get(arabicValue);
        }
//        else if (location == null) {
//            throw new NoSuchElementException("Could not convert to Roman. Value: " + arabicValue);
//        }
        return map.get(location) + fromArabicToRoman(arabicValue - location); //recursive get until found or null
    }
}
