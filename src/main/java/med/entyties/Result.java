package med.entyties;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @CsvBindByPosition(position = 1)
    @Column
    private Long result_of_treatment;

    @CsvBindByPosition(position = 2)
    @Column
    private Long stages;

    @CsvBindByPosition(position = 3)
    @Column
    private Long urological_complications;

    @CsvBindByPosition(position = 4)
    @Column
    private Long not_urological_complications;

    @CsvBindByPosition(position = 5)
    @Column
    private Long emergence_of_new_conditions_in_course_of_treatment;

    @CsvBindByPosition(position = 6)
    @Column
    private Long duration_of_inpatient_treatment;

    @CsvBindByPosition(position = 7)
    @Column
    private Long disability_projected_term;

    @CsvBindByPosition(position = 8)
    @Column
    private Long number_of_recommended_medications;

    @CsvBindByPosition(position = 9)
    @Column
    private Long antibiotics_after_discharge_for_few_days;

    @CsvBindByPosition(position = 10)
    @Column
    private Long systematic_monitoring_is_required;

    @CsvBindByPosition(position = 11)
    @Column
    private Long WISQOL;

    @CsvBindByPosition(position = 12)
    @Column
    private Long quality_of_life_SF_36;

    @CsvBindByPosition(position = 13)
    @Column
    private Long patient_satisfaction_with_treatment;

    @CsvBindByPosition(position = 14)
    @Column
    private Long prognosis_of_further_course_of_disease;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="anamnesis", referencedColumnName = "id")
    private Anamnesis anamnesis;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
    private List<Examination> examinationList;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="2nd_clarification", referencedColumnName = "id")
    private SecondClarifications secondClarifications;
}
