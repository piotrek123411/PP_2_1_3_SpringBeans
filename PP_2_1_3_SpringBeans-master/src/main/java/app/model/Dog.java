package app.model;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {

    private String says;
    public Dog(String says) {
        this.says = says;
    }

    void say () {
        System.out.println(says);
    }

    @Override
    public String toString() {
        return "Im a Dog";
    }

}
