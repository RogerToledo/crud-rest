package me.restcrud.controllers;

import me.restcrud.model.Usuario;
import me.restcrud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GrettingsController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @RequestMapping(value = "/mostranome/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String grettingText(@PathVariable String name){

        return "Hello " + name + "!";
    }

    @RequestMapping(value = "/olamundo/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String olaMundo(@PathVariable String name) {

        return "Olá Mundo " + name;
    }

    @GetMapping(value = "/listatodos")
    @ResponseBody
    public ResponseEntity<List<Usuario>> listaUsuario(){
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
        List<Usuario> usuarioList = usuarioRepository.findAll();

        return new ResponseEntity<>(usuarioList, HttpStatus.OK);
    }
<<<<<<< Updated upstream
=======
    @GetMapping(value = "/buscausuarioid")
    @ResponseBody
    public ResponseEntity<Usuario> buscaUsuarioId(@RequestParam(name = "userId") Long userId){
        Usuario usuario = usuarioRepository.findById(userId).get();

        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @GetMapping(value = "/buscausuarionome")
    @ResponseBody
    public ResponseEntity<List<Usuario>> buscarUsuarioNome(@RequestParam String nome){
        nome = nome.trim().toUpperCase();

        List<Usuario> usuarioList = usuarioRepository.buscarPorNome(nome);

        return new ResponseEntity<>(usuarioList, HttpStatus.OK);
    }
>>>>>>> Stashed changes

    @PostMapping(value = "/salvar")
    @ResponseBody
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
        Usuario usuarioSalvo = usuarioRepository.save(usuario);

        return new ResponseEntity<>(usuarioSalvo, HttpStatus.CREATED);
    }
<<<<<<< Updated upstream
=======

    @PutMapping(value = "/atualizar")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Usuario usuario){
        if (usuario.getId() == null){
            return new ResponseEntity<>("O id do usuário deve ser informado.", HttpStatus.OK);
        }

        Usuario usuarioAtualizado = usuarioRepository.saveAndFlush(usuario);

        return new ResponseEntity<>(usuarioAtualizado, HttpStatus.OK);
    }

>>>>>>> Stashed changes
    @DeleteMapping(value = "/delete")
    @ResponseBody
    public ResponseEntity<String> delete(@RequestParam Long userId) {
        usuarioRepository.deleteById(userId);

        return new ResponseEntity<>("User deletado com sucesso.", HttpStatus.OK);
    }
}
