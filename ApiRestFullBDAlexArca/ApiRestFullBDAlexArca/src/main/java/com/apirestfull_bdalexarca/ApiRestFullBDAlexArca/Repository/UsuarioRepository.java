package com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Repository;

import com.apirestfull_bdalexarca.ApiRestFullBDAlexArca.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByName(String name);

    boolean existsById(AtomicReference<Long> id);

    void deleteById(AtomicReference<Long> id);
}
