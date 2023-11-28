package de.tom.struktogen.model.buildingblock;

import de.tom.struktogen.model.Element;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Assignment extends Element {
    private String variableName;
    private String expression;
    private String type; // int, double, String, boolean, char

}
