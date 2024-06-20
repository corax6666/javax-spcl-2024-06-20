package careerservice.assignedskills.command;

import careerservice.assignedskills.model.LeveledSkill;

import java.util.List;

public record AssignSkillsToEmployeeCommand(long employeeId, List<LeveledSkill> skills) {
}
