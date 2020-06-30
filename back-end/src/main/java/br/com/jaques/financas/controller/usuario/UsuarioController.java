package br.com.jaques.financas.controller.usuario;

import br.com.jaques.financas.domain.Usuario;
import br.com.jaques.financas.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Usuario insert(@Valid @RequestBody Usuario novoRegistro) {
        return service.insert(novoRegistro);
    }

}
