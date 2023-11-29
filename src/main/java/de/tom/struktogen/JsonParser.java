package de.tom.struktogen;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.tom.struktogen.model.Structogram;

import java.awt.*;

public class JsonParser {

    public String getJsonOfStructogram(Structogram structogram) {
        if (structogram == null) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(structogram);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Structogram getStructogramOfJson(String json) {
        if (json == null) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, Structogram.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
