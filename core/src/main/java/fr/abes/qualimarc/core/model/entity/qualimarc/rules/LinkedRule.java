package fr.abes.qualimarc.core.model.entity.qualimarc.rules;

import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.abes.qualimarc.core.utils.BooleanOperateur;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Règle liée composée d'une règle simple et d'un opérateur
 */
@Getter @Setter
@Entity
@Table(name = "LINKED_RULE")
@NoArgsConstructor
public class LinkedRule {
    @Id
    @Column(name = "ID_LINKED_RULE")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @NotNull
    @JoinColumn(name = "RULE_ID")
    private SimpleRule rule;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "OPERATOR")
    private BooleanOperateur operateur;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_COMPLEX_RULE")
    private ComplexRule complexRule;

    public LinkedRule(Integer id, SimpleRule rule, BooleanOperateur operateur, ComplexRule complexRule) {
        this.id = id;
        this.rule = rule;
        this.operateur = operateur;
        this.complexRule = complexRule;
    }

    public LinkedRule(SimpleRule rule, BooleanOperateur operateur) {
        this.rule = rule;
        this.operateur = operateur;
    }

}
