package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.model.ValueNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
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
        assertThat(indexController.index()).isEqualTo("index");
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

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS(){
        System.out.println("TESTING ON MAC OS");
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindowsOS(){
        System.out.println("TESTING ON Windows");
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8(){
        System.out.println("Testing on java 8");
    }

    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11(){
        System.out.println("Testing on java 11");
    }

    @EnabledIfEnvironmentVariable(named="USER", matches = "Ciprian")
    @Test
    void testIfUserCiprian(){
        System.out.println("USER is Ciprian in env variables");
    }

    @EnabledIfEnvironmentVariable(named="USER", matches = "Fred")
    @Test
    void testIfUserFred(){

    }

}