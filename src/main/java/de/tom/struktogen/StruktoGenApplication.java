package de.tom.struktogen;

import com.fasterxml.jackson.databind.ObjectMapper;
import de.tom.struktogen.model.Structogram;
import de.tom.struktogen.model.buildingblock.Assignment;
import de.tom.struktogen.model.buildingblock.Decision;
import de.tom.struktogen.model.buildingblock.Loop;
import de.tom.struktogen.model.buildingblock.Sequence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class StruktoGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(StruktoGenApplication.class, args);
        Structogram structogram = new Structogram();
        structogram.setTitle("Example Structogram");
        // ... set other metadata ...

        Decision decision = new Decision();
        decision.setCondition("x > 0");

        Sequence trueBranch = new Sequence();
        trueBranch.getElements().add(new Assignment("y", "x * 2")); // Updated
        decision.setTrueBranch(trueBranch);

        Sequence falseBranch = new Sequence();
        falseBranch.getElements().add(new Assignment("y", "0")); // Already correct
        decision.setFalseBranch(falseBranch);

        Loop loop = new Loop();
        loop.setLoopType("while");
        loop.setLoopCondition("x > 0");
        Sequence loopBody = new Sequence();
        loopBody.getElements().add(new Assignment("x", "x - 1")); // Updated
        loop.setLoopBody(loopBody);

        structogram.getElements().add(decision);
        structogram.getElements().add(loop);

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(structogram);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
