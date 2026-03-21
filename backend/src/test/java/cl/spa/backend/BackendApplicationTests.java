package cl.spa.backend;

import cl.spa.backend.model.Plan;
import cl.spa.backend.repository.PlanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BackendApplicationTests {
    
    @Test
    void crearPlanCorrectamente() {

        Plan plan = new Plan();
        plan.setNombre("Plan Premium");
        plan.setDescripcion("Acceso total");
        plan.setPrecio(10000.0);

        assertEquals("Plan Premium", plan.getNombre());
        assertEquals("Acceso total", plan.getDescripcion());
        assertEquals(10000.0, plan.getPrecio());
    }
}
