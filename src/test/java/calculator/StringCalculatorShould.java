package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_numbers_should_return_sum_as_int() {
    	StringCalculator stringcalculator=new StringCalculator();
    	assertEquals(3, stringcalculator.add("1,2"));
    }
    
    @Test
    void string_with_unknown_amount_numbers_should_return_sum_as_int(){
    	StringCalculator stringcalculator=new StringCalculator();
    	assertEquals(10, stringcalculator.add("1,2,3,4"));
    }
    @Test
    void string_with_new_lines_between_numbers_should_return_sum_as_int(){
    	StringCalculator stringcalculator=new StringCalculator();
    	assertEquals(10, stringcalculator.add("1\n,2,3\n,4\n"));
    }
    @Test
    void string_with_changed_delimiter_between_numbers_should_return_sum_as_int(){
    	StringCalculator stringcalculator=new StringCalculator();
    	assertEquals(3, stringcalculator.add("//;\n1;2"));
    }
}
