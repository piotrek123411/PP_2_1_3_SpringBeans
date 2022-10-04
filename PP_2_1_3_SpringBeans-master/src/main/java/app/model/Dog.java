package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    private String says;

    public Dog() {
        says = "woof";
    }

    public Dog(String says) {
        this.says = says;
    }

    @Override
    void say () {
        System.out.println(says);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }
}
