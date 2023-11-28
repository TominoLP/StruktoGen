package de.tom.struktogen.model.buildingblock;

import de.tom.struktogen.model.Element;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Decision extends Element {
    private String condition;
    private Element trueBranch;
    private Element falseBranch;
}
