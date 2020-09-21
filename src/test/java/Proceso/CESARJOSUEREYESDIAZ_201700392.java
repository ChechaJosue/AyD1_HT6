/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proceso;

/**
 *
 * @author ChechaJosue
 */

import Objetos.Carrera;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

public class CESARJOSUEREYESDIAZ_201700392 {
    @InjectMocks
    private AsignarHorario asighorario;
    @Mock
    private Horario horario;
    @Mock 
    private Carrera carrera;
    @Mock 
    private RegistroAcademico regacademico;
    
    
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Before
    public void inicializar(){
        regacademico = new RegistroAcademico(2017, "00392");
        carrera = new Carrera(9, "Sistemas");
        asighorario = new AsignarHorario();
    }
    
    @Test
    public void AsignarHorarioTest() throws Exception {
        when(asighorario.generarHorario(carrera, regacademico)).thenCallRealMethod();
        horario =  asighorario.generarHorario(carrera, regacademico);
        
        System.out.println("@Test -> AsignarHorarioTest()");
        
        System.out.println("    El horario no debe ser nulo");
        assertNotNull(horario);
        
        System.out.println("    El codigo no puede ser nulo");
        assertNotNull(horario.getCodigoHorario());
        
        System.out.println("    La descripcion no puede ser nulo");
        assertNotNull(horario.getDescripcion());
        
        System.out.println("    El codigo de la carrera debe ser 9");
        assertEquals(9, carrera.getCodigo());
        
        System.out.println("    La descripcion de la carrera debe ser Sistemas");
        assertEquals("Sistemas", carrera.getDescripcion());
        
    }
}
