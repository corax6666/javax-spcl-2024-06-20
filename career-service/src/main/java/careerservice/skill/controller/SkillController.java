package careerservice.skill.controller;

import careerservice.skill.command.CreateSkillCommand;
import careerservice.skill.service.SkillService;
import careerservice.skill.view.SkillView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/skills")
public class SkillController {

    private SkillService skillService;

    @GetMapping
    public List<SkillView> listSkills() {
        return skillService.listSkills();
    }

    @PostMapping
    public SkillView create(@RequestBody CreateSkillCommand command) {
        return skillService.create(command);
    }

}
