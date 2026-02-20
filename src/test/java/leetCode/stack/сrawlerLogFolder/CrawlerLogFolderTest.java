package leetCode.stack.сrawlerLogFolder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrawlerLogFolderTest {
    CrawlerLogFolder crawlerLogFolder = new CrawlerLogFolder();

    @Test
    public void test1() {
        String[] logs = {"d1/", "d2/", "../", "d21/", "./"};
        int res = crawlerLogFolder.minOperations(logs);
        assertEquals(2, res);
    }

    @Test
    public void test2() {
        String[] logs = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        int res = crawlerLogFolder.minOperations(logs);
        assertEquals(3, res);
    }

    @Test
    public void test3() {
        String[] logs = {"d1/", "../", "../", "../"};
        int res = crawlerLogFolder.minOperations(logs);
        assertEquals(0, res);
    }
}