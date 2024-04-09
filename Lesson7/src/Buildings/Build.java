package Buildings;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Build {
    private String type;

    public Build(String type) {
        this.type = type;
    }


}