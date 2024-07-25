import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiDocumentoService {
    @Autowired
    private MiDocumentoRepository repository;

    public MiDocumento guardar(MiDocumento documento) {
        return repository.save(documento);
    }

    public List<MiDocumento> obtenerTodos() {
        return repository.findAll();
    }

    public MiDocumento obtenerPorId(String id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(String id) {
        repository.deleteById(id);
    }
}
