package flower.store;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    private double price;
    private String name;
}
