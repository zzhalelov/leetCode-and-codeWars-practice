package leetCode.map.firstUniqueCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {
    FirstUniqueCharacter test = new FirstUniqueCharacter();

    @Test
    public void test1() {
        assertEquals(0, test.firstUniqChar("leetcode"));
    }

    @Test
    public void test2() {
        assertEquals(2, test.firstUniqChar("loveleetcode"));
    }

    @Test
    public void test3() {
        assertEquals(-1, test.firstUniqChar("aabb"));
    }
}