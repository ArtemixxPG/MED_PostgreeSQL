package med.entyties;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class AdditionalPrimaryService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @CsvBindByPosition(position = 1)
    @Column
    private Long ct_time;

    @CsvBindByPosition(position = 2)
    @Column
    private Long ct;

    @CsvBindByPosition(position = 3)
    @Column
    private Long ct_stones_from_colic;

    @CsvBindByPosition(position = 4)
    @Column
    private Long stones_top_of_bowls_with_stor_colic_size;

    @CsvBindByPosition(position = 5)
    @Column
    private Long stones_top_of_bowls_with_colic_density;

    @CsvBindByPosition(position = 6)
    @Column
    private Long stones_of_medium_bowls_with_stor_colic_size;

    @CsvBindByPosition(position = 7)
    @Column
    private Long stones_of_medium_bowls_with_stor_of_colic_density;

    @CsvBindByPosition(position = 8)
    @Column
    private Long stones_of_lower_bowls_with_stor_colic_size;

    @CsvBindByPosition(position = 9)
    @Column
    private Long stones_of_lower_bowls_with_colic_density;

    @CsvBindByPosition(position = 10)
    @Column
    private Long pelvis_stones_with_stor_colic_size;

    @CsvBindByPosition(position = 11)
    @Column
    private Long pelvis_stones_with_stor_colic_density;

    @CsvBindByPosition(position = 12)
    @Column
    private Long coral_with_stor_colic;

    @CsvBindByPosition(position = 13)
    @Column
    private Long coral_with_stor_colic_max_size;

    @CsvBindByPosition(position = 14)
    @Column
    private Long coral_with_stor_colic_density;

    @CsvBindByPosition(position = 15)
    @Column
    private Long stone_vz_ureter_with_stor_colic;

    @CsvBindByPosition(position = 16)
    @Column
    private Long stone_vz_urete_with_stor_colic_density;

    @CsvBindByPosition(position = 17)
    @Column
    private Long stone_cpz_ureter_with_stor_colic;

    @CsvBindByPosition(position = 18)
    @Column
    private Long stone_cpz_ureter_with_stor_colic_density;

    @CsvBindByPosition(position = 19)
    @Column
    private Long stone_nz_ureter_with_stor_colic_size;

    @CsvBindByPosition(position = 20)
    @Column
    private Long stone_nz_ureter_with_stor_colic_density;

    @CsvBindByPosition(position = 21)
    @Column
    private Long different_combinations;

    @CsvBindByPosition(position = 22)
    @Column
    private Long ct_stones_from_opposite_side;

    @CsvBindByPosition(position = 23)
    @Column
    private Long kidney_abnormalities_from_colic;

    @CsvBindByPosition(position = 24)
    @Column
    private Long anomalies_of_kidney_from_opposite_side;

    @CsvBindByPosition(position = 25)
    @Column
    private Long cysts_from_colic;

    @CsvBindByPosition(position = 26)
    @Column
    private Long cysts_on_opposite_side;

    @CsvBindByPosition(position = 27)
    @Column
    private Long inflammatory_signs_with_stor_colic;

    @CsvBindByPosition(position = 28)
    @Column
    private Long inflammatory_signs_from_opposite_side;

    @CsvBindByPosition(position = 29)
    @Column
    private Long kidney_size_with_stor_colic;

    @CsvBindByPosition(position = 30)
    @Column
    private Long kidney_size_with_vs_storna;

    @CsvBindByPosition(position = 31)
    @Column
    private Long nephrosclerosis_with_stor_colic;

    @CsvBindByPosition(position = 32)
    @Column
    private Long nephrosclerosis_on_the_opposite_side;

    @CsvBindByPosition(position = 33)
    @Column
    private Long parenchyma_with_stor_colic;

    @CsvBindByPosition(position = 34)
    @Column
    private Long parenchyma_from_pposite_side;

    @CsvBindByPosition(position = 35)
    @Column
    private Long colic_side_function;

    @CsvBindByPosition(position = 36)
    @Column
    private Long function_from_the_opposite_side;

    @CsvBindByPosition(position = 37)
    @Column
    private Long ureteral_deformity_with_stor_colic;

    @CsvBindByPosition(position = 38)
    @Column
    private Long deformation_of_ureter_from_opposite_side;

    @CsvBindByPosition(position = 39)
    @Column
    private Long pyeloectasia_with_stor_colic_pelvis;

    @CsvBindByPosition(position = 40)
    @Column
    private Long pyeloectasia_on_opposite_side_pelvis;

    @CsvBindByPosition(position = 41)
    @Column
    private Long hydronephrosis_with_stor_colic;

    @CsvBindByPosition(position = 42)
    @Column
    private Long hydronephrosis_on_right_side;

    @CsvBindByPosition(position = 43)
    @Column
    private Long anomalies_of_kidney_vessels_with_stor_colic;

    @CsvBindByPosition(position = 44)
    @Column
    private Long anomalies_of_the_kidney_vessels_on_opposite_side;

    @CsvBindByPosition(position = 45)
    @Column
    private Long other_ct_findings_from_other_systems;

    @CsvBindByPosition(position = 46)
    @Column
    private Long other_additional_instrumental_studies;

    @CsvBindByPosition(position = 47)
    @Column
    private String additional_data;

    @CsvBindByPosition(position = 48)
    @Column
    private Long blood_glucose;

    @CsvBindByPosition(position = 49)
    @Column
    private Long other_influencing_factors_complications_of_underlying_condition;

    @CsvBindByPosition(position = 50)
    @Column
    private Long other_influencing_factors_findings_during_survey;

    @CsvBindByPosition(position = 51)
    @Column
    private Long other_influencing_factors_concomitant_conditions_exacerbations_and_decopmensation_of_others;

    @CsvBindByPosition(position = 52)
    @Column
    private Long other_influencing_factors_non_medical_factors;

    @CsvBindByPosition(position = 53)
    @Column
    private Long other_spontaneous;

    @CsvBindByPosition(position = 54)
    @Column
    private Long insignificant_and_significant;

    @CsvBindByPosition(position = 55)
    @Column
    private Long primary_diagnosis;

    @CsvBindByPosition(position = 56)
    @Column
    private Long stone_type_count;

    @CsvBindByPosition(position = 57)
    @Column
    private Long stone_type_side;

    @CsvBindByPosition(position = 58)
    @Column
    private Double stone_type_time;

    @CsvBindByPosition(position = 59)
    @Column
    private Long localization_of_wedge_of_significant_stone;

    @CsvBindByPosition(position = 60)
    @Column
    private String clinically_insignificant_stone;

    @CsvBindByPosition(position = 61)
    @Column
    private Long stone_type_r;

    @CsvBindByPosition(position = 62)
    @Column
    private Long complications_of_DZ;

    @CsvBindByPosition(position = 63)
    @Column
    private Long infected;

    @CsvBindByPosition(position = 64)
    @Column
    private Long nephrosclerosis;

    @CsvBindByPosition(position = 65)
    @Column
    private String xp_pyelonephritis_phase;

    @CsvBindByPosition(position = 66)
    @Column
    private Long CPN_CPB_opn;

    @CsvBindByPosition(position = 67)
    @Column
    private Long other_UROLOGICAL_factors;

    @CsvBindByPosition(position = 68)
    @Column
    private Long transition;

    @CsvBindByPosition(position = 69)
    @Column
    private Long additional_control_points_at_subsequent_stages;


}
