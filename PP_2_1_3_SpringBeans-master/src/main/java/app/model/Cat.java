package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    private String says;
    @Autowired
    public Cat(String says) {
        this.says = says;
    }

    void say () {
        System.out.println(says);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
