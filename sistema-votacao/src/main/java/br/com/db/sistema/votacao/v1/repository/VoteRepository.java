package br.com.db.sistema.votacao.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.db.sistema.votacao.v1.model.entity.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long>
{
    boolean existsByAssociateIdAndAgendaId( Long associateId, Long agendaId );
}
