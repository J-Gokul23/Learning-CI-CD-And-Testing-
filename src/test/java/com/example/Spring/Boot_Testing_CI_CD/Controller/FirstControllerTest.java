package com.example.Spring.Boot_Testing_CI_CD.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class FirstControllerTest {

    @Mock
    FirstController firstController;

    @Test
    void firstMessage() {

        Mockito.when(firstController.firstMessage()).thenReturn("This is the Test message");

        String result = firstController.firstMessage();

        Assertions.assertEquals("This is the Test message",result);

    }
}