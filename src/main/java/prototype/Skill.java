package prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Skill {

    private String subject;

    private int level;

    public Skill(Skill skill) {
        this.subject = skill.subject;
        this.level = skill.level;
    }
}
