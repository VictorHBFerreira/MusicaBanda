package br.com.fiap.restful.repository;

import br.com.fiap.restful.entity.Banda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BandaRepository extends JpaRepository<Banda, Integer> {
}
