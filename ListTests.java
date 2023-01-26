import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    @Test
    public void testFilter1() {
        ArrayList<String> input1 = new ArrayList<String>();
        List<String> expected = new ArrayList<String>();
        String key = "apple";

        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
                return (s.contains("apple"));
            }
        };

        input1.add("pineapple");
        input1.add("apple");

        expected.add("pineapple");
        expected.add("apple");

        assertArrayEquals(expected.toArray(), ListExamples.filter(input1, sc).toArray());
    }
}