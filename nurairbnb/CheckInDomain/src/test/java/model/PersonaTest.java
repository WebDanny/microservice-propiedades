package model;

import core.BusinessRuleValidationException;
import core.Entity;
import org.junit.jupiter.api.Test;
import value.objects.CIValue;
import value.objects.PersonNameValue;

import java.util.Date;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class PersonaTest{
    @Test
     void testConstructor() throws BusinessRuleValidationException {
        Persona persona = new Persona("John", "Doe", "123456789");

        assertEquals("John", persona.getName());
        assertEquals("Doe", persona.getLastname());
        assertEquals("123456789", persona.getCi());
    }

    @Test
     void testConstructorWithId() throws BusinessRuleValidationException {
        Persona persona = new Persona(
                UUID.randomUUID(), "Jane", "Smith", new Date(), "987654321", true
        );
        assertEquals("Jane", persona.getName());
        assertEquals("Smith", persona.getLastname());
        assertEquals("987654321", persona.getCi());
    }
}
