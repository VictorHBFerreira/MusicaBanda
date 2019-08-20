package br.com.fiap.restful.api;

import br.com.fiap.restful.entity.Musica;
import br.com.fiap.restful.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/musica")
public class MusicaResource {

    @Autowired
    private MusicaRepository rep;

    @GetMapping
    public List<Musica> listar(){
        return rep.findAll();
    }
    @GetMapping("{codigo}")
    public Musica buscar(@PathVariable int codigo){ return rep.findById(codigo).get();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Musica cadastrar(@RequestBody Musica musica){
        return rep.save(musica);
    }

    @PutMapping("{codigo}")
    public Musica atualizar(@RequestBody Musica musica, @PathVariable int codigo){
    musica.setCodigo(codigo);
    return rep.save(musica);
    }

    @DeleteMapping("{codigo}")
    public void deletar(@PathVariable int codigo){
        rep.deleteById(codigo);
    }

}
