package fr.abes.qualimarc.core.service;

import fr.abes.qualimarc.core.model.entity.qualimarc.reference.FamilleDocument;
import fr.abes.qualimarc.core.model.entity.qualimarc.reference.RuleSet;
import fr.abes.qualimarc.core.repository.qualimarc.FamilleDocumentRepository;
import fr.abes.qualimarc.core.repository.qualimarc.RuleSetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceService {
    private FamilleDocumentRepository familleDocumentRepository;

    private RuleSetRepository ruleSetRepository;

    @Autowired
    public ReferenceService(FamilleDocumentRepository familleDocumentRepository, RuleSetRepository ruleSetRepository) {
        this.familleDocumentRepository = familleDocumentRepository;
        this.ruleSetRepository = ruleSetRepository;
    }

    public List<FamilleDocument> getTypesDocuments() {
        return familleDocumentRepository.findAll();
    }

    public List<RuleSet> getTypesAnalyses() {
        return ruleSetRepository.findAll();
    }
}
