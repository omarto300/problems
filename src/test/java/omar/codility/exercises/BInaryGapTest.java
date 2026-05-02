package omar.codility.exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@ParameterizedClass
@CsvSource({"9,2","529,4","20,1","15,0","1041,5"})
class BInaryGapTest {

    final int value;
    final int expected;
    final BInaryGap binaryGap = new BInaryGap();

    BInaryGapTest(int value, int expected) {
        this.value = value;
        this.expected = expected;
    }

    @Test
    void solution() {
        assertEquals(expected,binaryGap.solution(value));
    }
}