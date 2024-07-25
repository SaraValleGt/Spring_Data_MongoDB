import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "mi_documento")
public class MiDocumento {
    @Id
    private String id;
    private String atributo1;
    private int atributo2;
    // Getters y Setters
}
