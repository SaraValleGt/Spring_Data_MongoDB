import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documentos")
public class MiDocumentoController {
    @Autowired
    private MiDocumentoService service;

    @PostMapping
    public MiDocumento crear(@RequestBody MiDocumento documento) {
        return service.guardar(documento);
    }

    @GetMapping
    public List<MiDocumento> listar() {
        return service.obtenerTodos();
    }

    @GetMapping("/{id}")
    public MiDocumento obtener(@PathVariable String id) {
        return service.obtenerPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable String id) {
        service.eliminar(id);
    }
}
