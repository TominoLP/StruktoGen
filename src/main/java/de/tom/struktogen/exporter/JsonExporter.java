package de.tom.struktogen.exporter;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.tom.struktogen.model.Structogram;


public class JsonExporter {

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
