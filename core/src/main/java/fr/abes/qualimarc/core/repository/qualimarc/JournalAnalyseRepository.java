package fr.abes.qualimarc.core.repository.qualimarc;

import fr.abes.qualimarc.core.configuration.QualimarcConfiguration;
import fr.abes.qualimarc.core.model.entity.qualimarc.statistiques.JournalAnalyse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
@QualimarcConfiguration
public interface JournalAnalyseRepository extends JpaRepository<JournalAnalyse, Integer> {

    List<JournalAnalyse> findAllByDateTimeBetween(Date dateDebut, Date dateFin);
//    List<JournalAnalyse> findAllByDateTimeBetween(String dateDebut, String dateFin);
}
