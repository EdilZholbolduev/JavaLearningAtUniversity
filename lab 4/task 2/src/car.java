
import lombok.*;


@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class car {

    private String model;
    @EqualsAndHashCode.Include
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;

    public void delivery(int quantity){
        this.quantity =+ quantity;
    }
    public void sell(int quantity){
        this.quantity -= quantity;
    }

}