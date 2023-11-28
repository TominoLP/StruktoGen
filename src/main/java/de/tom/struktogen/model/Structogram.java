package de.tom.struktogen.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Structogram {
    private String title;
    private List<Element> elements = new ArrayList<>();
    private Date creationDate;
}
