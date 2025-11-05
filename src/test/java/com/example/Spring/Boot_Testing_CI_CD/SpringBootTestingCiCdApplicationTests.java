package com.example.Spring.Boot_Testing_CI_CD;

import com.example.Spring.Boot_Testing_CI_CD.Testing.FirstTest;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootTestingCiCdApplicationTests {

    FirstTest firstTest;



    @BeforeAll
    static void testingBeforeAll() {
        System.out.println("BeforeAll Method");
    }

    @AfterAll
    static void testingAfterAll() {
        System.out.println("AfterAll Method");
    }

    @BeforeEach
    @DisplayName("creatingFirstTestObject")
    @Disabled("creatingFirstTestObject method is disable because its not in the case")
    void creatingFirstTestObject() {
        System.out.println("Creating firstTest Object");
        firstTest = new FirstTest();
    }

    @Test
    @DisplayName("FirstTest")
    @Disabled("contextLoads method is disable because its not in the case")
    void contextLoads() {
        System.out.println("TestCase1");
        System.out.println("Name:" + firstTest.fullName());
    }


    void testPlaceOrderMethod(){





    }

}
