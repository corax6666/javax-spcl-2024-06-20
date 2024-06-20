package careerservice.assignedskills.controller;

import careerservice.assignedskills.command.AssignSkillsToEmployeeCommand;
import careerservice.assignedskills.service.AssignedSkillsService;
import careerservice.assignedskills.view.EmployeeSkillsView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/assigned-skills")
public class AssignedSkillsController {

    private final AssignedSkillsService assignedSkillsService;

    @PostMapping
    public EmployeeSkillsView assignSkillsToEmployee(@RequestBody AssignSkillsToEmployeeCommand command) {
        return assignedSkillsService.assignSkillsToEmployee(command);
    }

    @GetMapping
    public EmployeeSkillsView getAssignedSkills(@RequestParam int employeeId) {
        return assignedSkillsService.getAssignedSkills(employeeId);
    }
}
