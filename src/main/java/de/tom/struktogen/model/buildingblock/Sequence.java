package de.tom.struktogen.model.buildingblock;

import de.tom.struktogen.model.Element;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class Sequence extends Element {
    private List<Element> elements = new ArrayList<>();
}
