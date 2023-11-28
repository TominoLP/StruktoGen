package de.tom.struktogen.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Element {
    private String type;
    private String content;
    private String comment;

}
