package med.entyties;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Clarifications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @CsvBindByPosition(position = 1)
    @Column
    private Long was_there_transition_at_pre_existing_stage;

    @CsvBindByPosition(position = 2)
    @Column
    private Long clarification1;

    @CsvBindByPosition(position = 3)
    @Column
    private Long clarification1_comment;

    @CsvBindByPosition(position = 4)
    @Column
    private Long days1;

    @CsvBindByPosition(position = 5)
    @Column
    private Long clarification2;

    @CsvBindByPosition(position = 6)
    @Column
    private Long days2;

    @CsvBindByPosition(position = 7)
    @Column
    private Long clarification3;

    @CsvBindByPosition(position = 8)
    @Column
    private Long days3;

    @CsvBindByPosition(position = 9)
    @Column
    private Long clarification4;

    @CsvBindByPosition(position = 10)
    @Column
    private Long days4;

    @CsvBindByPosition(position = 11)
    @Column
    private Long clarification5;

    @CsvBindByPosition(position = 12)
    @Column
    private Long days5;

    @CsvBindByPosition(position = 13)
    @Column
    private Long what_clarification_established_correct_complete_clinical_diagnosis;

    @CsvBindByPosition(position = 14)
    @Column
    private Long investigation_that_gave_error_of_1st_kind;

    @CsvBindByPosition(position = 15)
    @Column
    private Long investigation_that_gave_error_of_2st_kind;

    @CsvBindByPosition(position = 16)
    @Column
    private Long main_diagnosis_1;

    @CsvBindByPosition(position = 17)
    @Column
    private Long stone_type_count;

    @CsvBindByPosition(position = 18)
    @Column
    private Long stone_type_side;

    @CsvBindByPosition(position = 19)
    @Column
    private Double stone_type_time;

    @CsvBindByPosition(position = 20)
    @Column
    private Long localization_of_wedge_of_significant_stone;

    @CsvBindByPosition(position = 21)
    @Column
    private String clinically_insignificant_stone;

    @CsvBindByPosition(position = 22)
    @Column
    private Long stone_type_r;

    @CsvBindByPosition(position = 23)
    @Column
    private Long complications_of_DZ;

    @CsvBindByPosition(position = 24)
    @Column
    private Long infected;

    @CsvBindByPosition(position = 25)
    @Column
    private Long nephrosclerosis;

    @CsvBindByPosition(position = 26)
    @Column
    private String xp_pyelonephritis_phase;

    @CsvBindByPosition(position = 27)
    @Column
    private Long CPN_CPB_opn;

    @CsvBindByPosition(position = 28)
    @Column
    private Long another_urolog_factors;

    @CsvBindByPosition(position = 29)
    @Column
    private Long struct_uretr;

    @CsvBindByPosition(position = 30)
    @Column
    private Long drenaj_ana_stend;

    @CsvBindByPosition(position = 31)
    @Column
    private Long another_not_urolog_factors;

    @CsvBindByPosition(position = 32)
    @Column
    private Long close_diagnosis_1;

    @CsvBindByPosition(position = 33)
    @Column
    private Long close_diagnosis_2;

    @CsvBindByPosition(position = 34)
    @Column
    private Long full_diagnosis_on_day;

    @CsvBindByPosition(position = 35)
    @Column
    private String decision_making_1;

    @CsvBindByPosition(position = 36)
    @Column
    private Long standard_recommended_tactics_description;

    @CsvBindByPosition(position = 37)
    @Column
    private Long does_decision_correspond_to_standard_rec_tactics;

    @CsvBindByPosition(position = 38)
    @Column
    private Long justification_of_deviation_of_tactics_from_standard;

    @CsvBindByPosition(position = 39)
    @Column
    private Long transition;

    @CsvBindByPosition(position = 40)
    @Column
    private String additional_control_points_at_subsequent_stages;
}
