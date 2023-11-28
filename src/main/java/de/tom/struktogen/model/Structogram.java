package de.tom.struktogen.model;

import lombok.Getter;
import lombok.Setter;

import javax.lang.model.element.Element;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Structogram {
    private String title;
    private List<Element> elements;
    private Date creationDate;
}
