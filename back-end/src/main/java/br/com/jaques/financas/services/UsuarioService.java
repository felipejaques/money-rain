package br.com.jaques.financas.services;

import br.com.jaques.financas.domain.Usuario;
import br.com.jaques.financas.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;
    private final ModelMapper modelMapper;

    @Autowired
    public UsuarioService(UsuarioRepository repository)
    {
        this.repository = repository;
        modelMapper = new ModelMapper();
    }

    public Usuario insert (Usuario registro){

        Usuario novoUsuario = modelMapper.map(registro, Usuario.class);
        Usuario saved = repository.save(novoUsuario);

        return modelMapper.map(saved, Usuario.class);
    }

}
