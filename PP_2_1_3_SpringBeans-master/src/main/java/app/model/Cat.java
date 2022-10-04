package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    private String says;

    public Cat(){
        says = "meow";
    }

    public Cat(String says) {
        this.says = says;
    }
    @Override
    void say () {
        System.out.println(says);
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
