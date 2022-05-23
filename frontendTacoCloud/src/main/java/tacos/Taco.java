package tacos;

import java.sql.Date;
import java.util.List;
import lombok.Data;

@Data
public class Taco {
	private Long id;
	private String name;
	private Date createdAt;
	private List<Ingredient> ingredients;

}