package day25java;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import day25java.Student;

public class AssertAll {
	
	
	    @Test
	    void groupedAssertions() {
	        Student student = new Student("Ramesh", "famous");

	  
	        assertAll("student", () -> assertEquals("Ramesh", student.getFirstName()),
	                () -> assertEquals("famous", student.getLastName()));
	    }
	 
	    @Test
	    void dependentAssertions() {
	        
	  
	        Student student = new Student("Ramesh", "famous");
	        assertAll("properties",
	            () -> {
	                String firstName = student.getFirstName();
	                assertNotNull(firstName);

	                
	                assertAll("first name",
	                    () -> assertTrue(firstName.startsWith("R")),
	                    () -> assertTrue(firstName.endsWith("h"))
	                );
	            },
	            () -> {
	                
	                String lastName = student.getLastName();
	                assertNotNull(lastName);

	                
	                assertAll("last name",
	                    () -> assertTrue(lastName.startsWith("f")),
	                    () -> assertTrue(lastName.endsWith("s"))
	                );
	            }
	        );
	    }
	}