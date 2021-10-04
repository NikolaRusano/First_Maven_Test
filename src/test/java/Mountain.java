import lombok.*;

import java.util.Objects;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Data
public  class Mountain {
    private  final String name;
    private  double latitude, longtitude;
    private String country;


    
}
