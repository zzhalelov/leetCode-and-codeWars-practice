package codeWars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderingTheWordsTest {
    @Test
    void test1() {
        assertEquals(" dehllloorw", OrderingTheWords.orderWord("hello world"));
    }

    @Test
    void test2() {
        assertEquals("bbboy", OrderingTheWords.orderWord("bobby"));
    }

    @Test
    void test3() {
        assertEquals("Invalid String!", OrderingTheWords.orderWord(""));
    }

    @Test
    void test4() {
        assertEquals(" !!HYiou", OrderingTheWords.orderWord("!Hi You!"));
    }
}