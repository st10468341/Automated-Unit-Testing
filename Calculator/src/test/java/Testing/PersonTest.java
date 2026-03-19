/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Testing;

import com.mycompany.calculator.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testIsAdult() {
        Person john = new Person("John", 20);
        assertTrue(john.isAdult());

        Person kid = new Person("Timmy", 12);
        assertFalse(kid.isAdult());
    }

    @Test
    void testGetters() {
        Person jane = new Person("Jane", 30);
        assertEquals("Jane", jane.getName());
        assertEquals(30, jane.getAge());
    }
}
