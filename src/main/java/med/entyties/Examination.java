package med.entyties;


import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table
public class Examination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @CsvBindByPosition(position = 1)
    @Column
    private Long lower_back_pain;

    @CsvBindByPosition(position = 2)
    @Column
    private Long stomach_pain;

    @CsvBindByPosition(position = 3)
    @Column
    private Long renal_colic_duration_before_initial_examination;

    @CsvBindByPosition(position = 4)
    @Column
    private Long renal_colic_frequency;

    @CsvBindByPosition(position = 5)
    @Column
    private Long pain_intensity_according;

    @CsvBindByPosition(position = 6)
    @Column
    private Long nausea;

    @CsvBindByPosition(position = 7)
    @Column
    private Long vomiting;

    @CsvBindByPosition(position = 8)
    @Column
    private Long blood_in_the_urine_visually;

    @CsvBindByPosition(position = 9)
    @Column
    private Long frequency_of_urination;

    @CsvBindByPosition(position = 10)
    @Column
    private Long pain_during_urination_and_painful_urges;

    @CsvBindByPosition(position = 11)
    @Column
    private Long temperature;

    @CsvBindByPosition(position = 12)
    @Column
    private Long AVAILABLE_RESEARCH_BEFORE_THE_FIRST_CONTACT;

    @CsvBindByPosition(position = 13)
    @Column
    private Long RESEARCH_their_terms;

    @CsvBindByPosition(position = 14)
    @Column
    private Long pelvis_stone_lms_of_kidney_from_colic_was_identified_and_confirmed;

    @CsvBindByPosition(position = 15)
    @Column
    private Long the_stone_of_mochetochnik_from_side_of_colic_is_revealed_and_confirmed;

    @CsvBindByPosition(position = 16)
    @Column
    private Long expansion_of_pelvis_or_ureter_or_kidney_block_from_side_of_colic_without_stone_was_revealed;

    @CsvBindByPosition(position = 17)
    @Column
    private Long clinically_insignificant_concretions_of_CHL_from_side_of_colic_were_identified_and_confirmed;

    @CsvBindByPosition(position = 18)
    @Column
    private Long duration_of_ureteral_stone_detected_earlier;

    @CsvBindByPosition(position = 19)
    @Column
    private Long OAM1_protein;

    @CsvBindByPosition(position = 20)
    @Column
    private Long OAM1_leukocytes;

    @CsvBindByPosition(position = 21)
    @Column
    private Long OAM1_crystalluria;

    @CsvBindByPosition(position = 22)
    @Column
    private Long OAM1_microhematuria;

    @CsvBindByPosition(position = 23)
    @Column
    private Long OAM1_bacteriuria;

    @CsvBindByPosition(position = 24)
    @Column
    private Long OAM1_urine_ph;

    @CsvBindByPosition(position = 25)
    @Column
    private Long other_in_OAM;

    @CsvBindByPosition(position = 26)
    @Column
    private Long OAK_hemoglobin;

    @CsvBindByPosition(position = 27)
    @Column
    private Long OAK_le;

    @CsvBindByPosition(position = 28)
    @Column
    private Long OAK_SOE;

    @CsvBindByPosition(position = 29)
    @Column
    private Long ultrasound_1_revealed_dilation_of_heart_from_colic;

    @CsvBindByPosition(position = 30)
    @Column
    private Long ultrasound1;

    @CsvBindByPosition(position = 31)
    @Column
    private Long ultrasound1_detected_calyx_stones_from_colic_side;

    @CsvBindByPosition(position = 32)
    @Column
    private Long number_of_stones_cups;

    @CsvBindByPosition(position = 33)
    @Column
    private Long size;

    @CsvBindByPosition(position = 34)
    @Column
    private Long ULTRASON1_stones_of_cups_of_opposite_side_were_found;

    @CsvBindByPosition(position = 35)
    @Column
    private Long Ultrasound1_size_of_stones_of_cups_the_opposite_side;

    @CsvBindByPosition(position = 36)
    @Column
    private Long Ultrasound1_detected_calyx_stones_from_2_sides;

    @CsvBindByPosition(position = 37)
    @Column
    private Long pelvis_stone_or_LMS_from_colic_side_was_found;

    @CsvBindByPosition(position = 38)
    @Column
    private Long size_of_pelvis_stone_or_LMS_from_colic_side;

    @CsvBindByPosition(position = 39)
    @Column
    private Long ureteral_stone_was_found_in_vs_from_side;

    @CsvBindByPosition(position = 40)
    @Column
    private Long ureteral_stone_sz_was_found_on_side_of_colic;

    @CsvBindByPosition(position = 41)
    @Column
    private Long ureteral_stone_nz_was_found_on_side_of_colic;

    @CsvBindByPosition(position = 42)
    @Column
    private Long size_of_ureter_stone;

    @CsvBindByPosition(position = 43)
    @Column
    private Long microliths_of_CHLS;

    @CsvBindByPosition(position = 44)
    @Column
    private Long stone_of_tub_on_opposite_side;

    @CsvBindByPosition(position = 45)
    @Column
    private Long size_of_pelvis_stone_of_opposite_side_of_colic;

    @CsvBindByPosition(position = 46)
    @Column
    private Long ureteral_stone_on_opposite_side_of_colic;

    @CsvBindByPosition(position = 47)
    @Column
    private Long size_of_ureter_stone_from_side_of_anticolic;

    @CsvBindByPosition(position = 48)
    @Column
    private Long op_ultrasound1_signs_of_acute_inflammation;

    @CsvBindByPosition(position = 49)
    @Column
    private Long other_ultrasound_findings;

    @CsvBindByPosition(position = 50)
    @Column
    private Long anomalies_of_kidney_according_to_primary_ultrasound1;

    @CsvBindByPosition(position = 51)
    @Column
    private Long ultrasound_result1;

    @CsvBindByPosition(position = 52)
    @Column
    private Long obz_R_R_positive_stones_in_projection_of_kidney_CHLS;

    @CsvBindByPosition(position = 53)
    @Column
    private Long obz_R_R_positive_stone_in_projection_of_ureter;

    @CsvBindByPosition(position = 54)
    @Column
    private Long stone_shadow_size;

    @CsvBindByPosition(position = 55)
    @Column
    private Long is_possible_to_conduct_EC;

    @CsvBindByPosition(position = 56)
    @Column
    private Long why_not;

    @CsvBindByPosition(position = 57)
    @Column
    private Long EU1_functions_of_diseased_kidney;

    @CsvBindByPosition(position = 58)
    @Column
    private Double EU1_dilation_of_CHLS_on_colic_side;

    @CsvBindByPosition(position = 59)
    @Column
    private Long EU1_dilation_of_opposite_kidney;

    @CsvBindByPosition(position = 60)
    @Column
    private Long kidney_stones_from_side_of_colic_on_background_of_colntrast;

    @CsvBindByPosition(position = 61)
    @Column
    private String approximate_size_of_stone_0;

    @CsvBindByPosition(position = 62)
    @Column
    private Long kidney_stones_from_opposite_side_of_colic_on_background_of_contrast;

    @CsvBindByPosition(position = 63)
    @Column
    private Long approximate_size_of_stone_1;


    @CsvBindByPosition(position = 64)
    @Column
    private Long ureteral_stone_from_kidney_colic_on_background_of_contrast;


    @CsvBindByPosition(position = 65)
    @Column
    private Long contrast_passage_below_stone_0;


    @CsvBindByPosition(position = 66)
    @Column
    private String ureteral_stone_with_contrapole_on_background_of_contrast;


    @CsvBindByPosition(position = 67)
    @Column
    private Long contrast_passage_below_stone_1;


    @CsvBindByPosition(position = 68)
    @Column
    private Long P_logical_symptoms;


    @CsvBindByPosition(position = 69)
    @Column
    private Long preservation_of_function_of_opposite_kidney;


    @CsvBindByPosition(position = 70)
    @Column
    private Long anomalies_of_kidneys_according_to_EU1;


    @CsvBindByPosition(position = 71)
    @Column
    private Long other_obz_and_EU_data;


    @CsvBindByPosition(position = 72)
    @Column
    private Long result_EU;


    @CsvBindByPosition(position = 73)
    @Column
    private Long which_primary_study_established_correct_complete_clinical_diagnosis;


    @CsvBindByPosition(position = 74)
    @Column
    private Long problems_and_questions_at_primary_stage;


    @CsvBindByPosition(position = 75)
    @Column
    private String comments_on_problems_and_questions;

    @CsvBindByPosition(position = 76)
    @Column
    private Long urea1;

    @CsvBindByPosition(position = 77)
    @Column
    private Long creatinine1;

    @CsvBindByPosition(position = 78)
    @Column
    private Long uric_acid;

    @CsvBindByPosition(position = 79)
    @Column
    private Long SRB;

    @CsvBindByPosition(position = 80)
    @Column
    private Long ca;

    @CsvBindByPosition(position = 81)
    @Column
    private Long na;

    @CsvBindByPosition(position = 82)
    @Column
    private Long chlorides;

    @CsvBindByPosition(position = 83)
    @Column
    private Long community_protein;

    @CsvBindByPosition(position = 84)
    @Column
    private Long PTI;

    @CsvBindByPosition(position = 85)
    @Column
    private Long ACTV;

    @CsvBindByPosition(position = 86)
    @Column
    private Long MNO;

    @CsvBindByPosition(position = 87)
    private Long bilirubin;

    @CsvBindByPosition(position = 88)
    private Long alat;

    @CsvBindByPosition(position = 89)
    private Long asat;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column
    private List<Image> images;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @Column
    private List<Ultrasound> ultrasounds;
}
