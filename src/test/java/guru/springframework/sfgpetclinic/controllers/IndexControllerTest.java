package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.ValueNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class IndexControllerTest {

    IndexController indexController;


    @BeforeEach
    void setUp() {
        indexController = new IndexController();

    }

    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {

        assertEquals("index", indexController.index());
//        assertEquals("indexd", indexController.index(), "Wrong View Returned");

    }

    @Test
    @DisplayName("Test Exception")
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, ()-> {
            indexController.oupsHandler();
        });
    }

    @Test
    void testAssumptionTrue(){

        assumeTrue("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));

    }

    @Test
    void testAssumptionTrueAssumtionIsTrue(){

        assumeTrue("GURU".equalsIgnoreCase("guru"));

    }

}