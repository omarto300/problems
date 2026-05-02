package omar.codility.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBitMasksTest {

    @Test
    void solution() {
        CountBitMasks solution = new CountBitMasks(30);
        int A= 1073741727;
        int B = 1073741631;
        int C = 1073741679;
        assertEquals(8, solution.solution(A,B,C));
    }

    @Test
    void solutionSmall() {
        CountBitMasks solution = new CountBitMasks(6);
        int A= 56;
        int B = 7;
        int C = 42;
        assertEquals(18, solution.solution(A,B,C));
    }
}