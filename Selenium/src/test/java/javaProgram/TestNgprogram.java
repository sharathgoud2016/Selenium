package javaProgram;
import org.testng.annotations.Test;

public class TestNgprogram {

	    @Test
	    public void testAddition() {
	        int result = addNumbers(2, 3);
	        assert result == 5 : "Addition test failed!";
	    }




	    @Test
	    public void testSubtraction() {
	        int result = subtractNumbers(5, 2);
	        assert result == 3 : "Subtraction test failed!";
	    }




	    private int addNumbers(int a, int b) {
	        return a + b;
	    }




	    private int subtractNumbers(int a, int b) {
	        return a - b;
	    }

	}

