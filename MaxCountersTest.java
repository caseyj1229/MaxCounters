import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCountersTest {
    @Test
    void solution() {
        int[] A = {3,4,4,6,1,4,4};
        int[] resultA = {3,2,2,4,2};

        assertArrayEquals(resultA,MaxCounters.solution(5,A));

        int[] B = {1,2,1,2,1,1,1,1,1,1,1,3,2};
        int[] resultB = {9,10};

        assertArrayEquals(resultB,MaxCounters.solution(2,B));

        int[] C = {6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,3,4,4,6,1,4,4};
        int[] resultC = {3,2,2,4,2};

        assertArrayEquals(resultC,MaxCounters.solution(5,A));

        int[] D = {5,5,5,5,5,5,5};
        int[] resultD = {0,0,0,0};

        assertArrayEquals(resultD,MaxCounters.solution(4,D));

        int[] E = {1,5,2,5,3,4,5,1,5,1,5,1,5,1,5};
        int[] resultE = {7,7,7,7};

        assertArrayEquals(resultE,MaxCounters.solution(4,E));

    }
}