package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        assertTrue("asdf".equals(indexController.oupsHandler()), () -> "This is some expensive" + " message to build" + " for my test.");
    }
}