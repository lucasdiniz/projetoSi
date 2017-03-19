package br.edu.ufcg.computacao.si1.repository;

import br.edu.ufcg.computacao.si1.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    Usuario findByEmail(String email);
    Usuario findByEmailAndSenha(String email, String senha);
}
