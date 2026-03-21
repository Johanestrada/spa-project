package cl.spa.backend;

import cl.spa.backend.model.Plan;
import cl.spa.backend.repository.PlanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BackendApplicationTests {

    @Autowired
    private PlanRepository planRepository;

    @Test
    void guardarPlan() {
        // Crear plan
        Plan plan = new Plan();
        plan.setNombre("Plan Básico");
        plan.setDescripcion("Acceso limitado");
        plan.setPrecio(5.000);

        // Guardar en BD
        Plan guardado = planRepository.save(plan);

        // Verificaciones
        assertNotNull(guardado);
        assertNotNull(guardado.getId());
        assertEquals("Plan Básico", guardado.getNombre());
    }
}
