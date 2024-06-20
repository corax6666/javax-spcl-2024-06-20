package careerservice;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

class ModuleTest {

    @Test
    void architecture() {
        ApplicationModules applicationModules = ApplicationModules.of(CareerServiceApplication.class);
        applicationModules.verify();

        new Documenter(applicationModules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }
}
