package de.tom.struktogen.model.buildingblock;

import de.tom.struktogen.model.Element;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Loop extends Element {
    private String loopCondition;
    private Element loopBody;
    private String loopType; // while, do-while, for
}
