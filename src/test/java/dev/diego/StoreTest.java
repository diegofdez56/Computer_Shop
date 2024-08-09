package dev.diego;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    private Store store;
    private Computer comp1, comp2;

    @BeforeEach
    void setUp() {
        store = new Store("CompuTech", "John Doe", "12345678-9");
        comp1 = new Computer("Dell", 16, "Intel i7", "Windows 10", 1200.00);
        comp2 = new Computer("HP", 8, "Intel i5", "Windows 10", 800.00);
    }

    @Test
    void testAddComputer() {
        store.addComputer(comp1);
        assertEquals(1, store.listComputers().size());
    }

    @Test
    void testRemoveComputer() {
        store.addComputer(comp1);
        assertTrue(store.removeComputer("Dell"));
        assertEquals(0, store.listComputers().size());
    }

    @Test
    void testFindComputer() {
        store.addComputer(comp1);
        Computer result = store.findComputer("Dell");
        assertNotNull(result);
        assertEquals("Dell", result.getBrand());
    }

    @Test
    void testListComputers() {
        store.addComputer(comp1);
        store.addComputer(comp2);
        assertEquals(2, store.listComputers().size());
    }
}
