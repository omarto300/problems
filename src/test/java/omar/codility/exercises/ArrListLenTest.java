package omar.codility.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrListLenTest {

  @Test
  void solution() {
    int[] input = new int[]{1,4,-1,3,2};
    ArrListLen arrListLen = new ArrListLen();
    assertEquals(4,arrListLen.solution(input));
  }

  @Test
  void solution2() {
    int[]input = new int[]{-1};
    ArrListLen arrListLen = new ArrListLen();
    assertEquals(1,arrListLen.solution(input));
  }

  @Test
  void solution3() {
    int[]input = new int[]{4,-1,1,2,3};
    ArrListLen arrListLen = new ArrListLen();
    assertEquals(5,arrListLen.solution(input));
  }
}