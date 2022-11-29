package me.restcrud.repository;

import me.restcrud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Updated upstream
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "select u from Usuario u where upper(trim(u.nome)) like %?1%")
    List<Usuario> buscarPorNome(String nome);
>>>>>>> Stashed changes
}
