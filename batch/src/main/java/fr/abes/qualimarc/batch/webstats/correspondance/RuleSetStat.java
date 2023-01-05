package fr.abes.qualimarc.batch.webstats.correspondance;

import com.opencsv.CSVWriter;
import fr.abes.qualimarc.batch.webstats.Export;
import fr.abes.qualimarc.core.model.entity.qualimarc.reference.RuleSet;
import fr.abes.qualimarc.core.repository.qualimarc.RuleSetRepository;

import java.util.List;

public class RuleSetStat extends Export<RuleSet> {

    private final RuleSetRepository ruleSetRepository;

    public RuleSetStat(RuleSetRepository ruleSetRepository) {
        this.ruleSetRepository = ruleSetRepository;
    }

    @Override
    protected void lineToCsv(CSVWriter writer, RuleSet dto) {
        writer.writeNext(new String[]{dto.getId().toString(), dto.getLibelle()});
    }

    @Override
    protected List<RuleSet> getTuples() {
        return ruleSetRepository.findAll();
    }
}
