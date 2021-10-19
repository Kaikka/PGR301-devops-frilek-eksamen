package no.kristiania.frilekeksamen;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class FrilekEksamenApplicationTests {

    @Test
    void idiotTest() {
        int x = 20;
        assertEquals(x, 20);
    }

}
