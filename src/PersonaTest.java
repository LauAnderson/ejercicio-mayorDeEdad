import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonaTest {
    @Test
    public void siNombreCompletoEsCorrecto(){
        Persona persona1 = new Persona( "Lorena", "Diaz", "lorenadiaz@gmail.com",20, LocalDate.of (2001, 10, 21));
        assertEquals("Lorena Diaz", persona1.mostrarNombre());

    }
    @Test
    public void esMayor(){
        Persona persona1 = new Persona( "Lorena", "Diaz", "lorenadiaz@gmail.com", 20, LocalDate.of (2001, 10, 21));
        assertEquals(true, persona1.esMayorDeEdad());
    }

}