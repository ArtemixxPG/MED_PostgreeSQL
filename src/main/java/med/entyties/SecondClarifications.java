package med.entyties;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table
public class SecondClarifications {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @CsvBindByPosition(position = 1)
    @Column
    private Long measurement_of_new_parameter_according_to_algorithm_planned;

    @CsvBindByPosition(position = 2)
    @Column
    private Long days_1;

    @CsvBindByPosition(position = 3)
    @Column
    private Long repeate_planned_measurement_of_parameter_and_comparison_with_initial_data;

    @CsvBindByPosition(position = 4)
    @Column
    private Long days_2;

    @CsvBindByPosition(position = 5)
    @Column
    private Long occurrence_of_certain_point_in_time_according_to_initial_algorithm_being_executed;

    @CsvBindByPosition(position = 6)
    @Column
    private Long days_3;

    @CsvBindByPosition(position = 7)
    @Column
    private Long was_there_transition_at_pre_existing_stage;

    @CsvBindByPosition(position = 8)
    @Column
    private Long dungerous_event;

    @CsvBindByPosition(position = 9)
    @Column
    private Long important_event;

    @CsvBindByPosition(position = 10)
    @Column
    private Long clarification1;

    @CsvBindByPosition(position = 11)
    @Column
    private Long days1;

    @CsvBindByPosition(position = 12)
    @Column
    private Long clarification2;

    @CsvBindByPosition(position = 13)
    @Column
    private Long days2;

    @CsvBindByPosition(position = 14)
    @Column
    private Long clarification3;

    @CsvBindByPosition(position = 15)
    @Column
    private Long days3;

    @CsvBindByPosition(position = 16)
    @Column
    private Long clarification4;

    @CsvBindByPosition(position = 17)
    @Column
    private Long days4;

    @CsvBindByPosition(position = 18)
    @Column
    private Long clarification5;

    @CsvBindByPosition(position = 19)
    @Column
    private Long days5;

    @CsvBindByPosition(position = 20)
    @Column
    private Long main_diagnosis_2;

    @CsvBindByPosition(position = 21)
    @Column
    private Double dz2_time;

    @CsvBindByPosition(position = 22)
    @Column
    private Long hard_dz_2;

    @CsvBindByPosition(position = 23)
    @Column
    private Long complications_of_DZ;

    @CsvBindByPosition(position = 24)
    @Column
    private String conclusions;

    @CsvBindByPosition(position = 25)
    @Column
    private String decision_making_2;

    @CsvBindByPosition(position = 26)
    @Column
    private String time_decision_making_2;

    @CsvBindByPosition(position = 27)
    @Column
    private Long standard_recommended_tactics_description;

    @CsvBindByPosition(position = 28)
    @Column
    private Long does_decision_correspond_to_standard_rec_tactics;

    @CsvBindByPosition(position = 29)
    @Column
    private Long justification_of_deviation_of_tactics_from_standard;

    @CsvBindByPosition(position = 30)
    @Column
    private Long transition;

    @CsvBindByPosition(position = 31)
    @Column
    private String additional_control_points_at_subsequent_stages;

}
