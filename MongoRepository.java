import org.springframework.data.mongodb.repository.MongoRepository;

public interface MiDocumentoRepository extends MongoRepository<MiDocumento, String> {
    // Puedes definir métodos personalizados aquí
}
