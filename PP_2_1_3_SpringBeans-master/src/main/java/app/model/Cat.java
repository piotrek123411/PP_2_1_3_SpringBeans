package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    private String says;
    public Cat(String says) {
        this.says = says;
    }

    void say () {

    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
