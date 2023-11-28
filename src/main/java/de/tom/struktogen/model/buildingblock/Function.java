package de.tom.struktogen.model.buildingblock;

import de.tom.struktogen.model.Element;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Function extends Element {
    private String functionName;
    private List<String> parameters;
}
