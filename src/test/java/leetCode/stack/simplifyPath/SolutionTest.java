package leetCode.stack.simplifyPath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void test1() {
        String path = "/home/";
        assertEquals("/home", solution.simplifyPath(path));
    }

    @Test
    public void test2() {
        String path = "/home//foo/";
        assertEquals("/home/foo", solution.simplifyPath(path));
    }

    @Test
    public void test3() {
        String path = "/home/user/Documents/../Pictures";
        assertEquals("/home/user/Pictures", solution.simplifyPath(path));
    }

    @Test
    public void test4() {
        String path = "/../";
        assertEquals("/", solution.simplifyPath(path));
    }

    @Test
    public void test5() {
        String path = "/.../a/../b/c/../d/./";
        assertEquals("/.../b/d", solution.simplifyPath(path));
    }
}