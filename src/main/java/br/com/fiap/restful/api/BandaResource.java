package br.com.fiap.restful.api;

import br.com.fiap.restful.entity.Banda;
import br.com.fiap.restful.repository.BandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/banda")
public class BandaResource {

    @Autowired
    private BandaRepository rep;

    @GetMapping
    public List<Banda> listar(){
        return rep.findAll();
    }
    @GetMapping("{codigo}")
    public Banda buscar(@PathVariable int codigo){
        return rep.findById(codigo).get();
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Banda cadastrar(@RequestBody Banda banda){
        return rep.save(banda);
    }

    @PutMapping("{codigo}")
    public Banda atualizar(@RequestBody Banda banda, @PathVariable int codigo){
        banda.setCodigo(codigo);
        return rep.save(banda);
    }

    @DeleteMapping("{codigo}")
    public void deletar(@PathVariable int codigo){
        rep.deleteById(codigo);
    }

}