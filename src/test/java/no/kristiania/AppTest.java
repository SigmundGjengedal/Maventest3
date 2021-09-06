package no.kristiania;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void test1(){
        assertEquals("I", App.toRoman1(1));
    }
}
