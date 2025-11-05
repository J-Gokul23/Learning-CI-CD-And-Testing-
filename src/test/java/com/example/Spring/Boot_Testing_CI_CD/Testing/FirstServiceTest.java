package com.example.Spring.Boot_Testing_CI_CD.Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class FirstServiceTest {

    @Mock
    FirstRepo firstRepo;

    @InjectMocks
    FirstService firstService;

    @Test
    @DisplayName("Testing Placing Order")
    void placeOrder() {

        Mockito.when(firstRepo.getProductByID(1)).thenReturn("Biscuits");

        String result = firstService.placeOrder(1, 1);

        Assertions.assertEquals("Biscuits Order Placed and No of quantity " + 1, result);

        System.out.println(result);

    }

    @Test
    @DisplayName("Testing User is Present or Not")
    void findUser() {

        Mockito.when(firstRepo.findUser("Gokul")).thenReturn("Gokul");

        boolean result = firstService.findUser("Gokul");

        Assertions.assertTrue(result, "User is Not Present");

    }

    @Test
    @DisplayName("Testing Throwing Exception")
    void throwingException() {

        Assertions.assertThrows(RuntimeException.class, () -> firstService.throwingException(-1));

    }

    @DisplayName("Testing Parametrized Method")
    @ParameterizedTest
    @ValueSource(strings = {"Gokul", "Steve", "Akash", "Suriya"})
    void welcomeMessage(String name) {

        String result = firstService.welcomeMessage(name);

        System.out.println(result);

    }
}