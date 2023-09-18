package jackson;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@NoArgsConstructor
public class Artist {

    private String name;

    private LocalDate dateOfBirth;

    private Map<String, String> appearanceOnStage;
}
