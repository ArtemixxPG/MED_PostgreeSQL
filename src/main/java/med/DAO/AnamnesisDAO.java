package med.DAO;

import med.entyties.Anamnesis;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnamnesisDAO extends JpaRepository<Anamnesis, Long> {
}
