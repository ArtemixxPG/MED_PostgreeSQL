package med.entyties;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvNumber;
import lombok.Data;
import med.entyties.AudioInput;


import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name= "Anamnesis")
public class Anamnesis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

//    @CsvBindByName(column="Пол (м=1, ж=2)")
    @CsvBindByPosition(position = 1)
    @Column
    private String gender;

//    @CsvBindByName(column="Возраст")
    @CsvBindByPosition(position = 2)
    @Column
    private Long age;

//    @CsvBindByName(column="рост")
    @CsvBindByPosition(position = 3)
    @Column
    private Long height;

//    @CsvBindByName(column="вес, кг")
    @CsvBindByPosition(position = 4)
    @Column
    private Long weight;


    @CsvBindByPosition(position = 5)
    @Column
    private String preview_diagnosis;


    @CsvBindByPosition(position = 6)
    @Column
    private Long diagnosis;


    @CsvBindByPosition(position = 7)
    @Column
    private String indentity_dignosis_from_relative;


    @CsvBindByPosition(position = 8)
    @Column
    private Long which_relative;


    @CsvBindByPosition(position = 9)
    @Column
    private Long far_anamnesis;

    @CsvBindByPosition(position = 10)
    @CsvNumber("#.###")
    @Column
    private Double how_old_anamnesis;

    @CsvBindByPosition(position = 11)
    @Column
    private Long early_hospitalization;

    @CsvBindByPosition(position = 12)
    @Column
    private Long how_many_hospitalization;

    @CsvBindByPosition(position = 13)
    @CsvNumber("#.###")
    @Column
    private Double most_early_hospitalization;

    @CsvBindByPosition(position = 14)
    @CsvNumber("#.###")
    @Column
    private Double most_late_hospitalization;

    @CsvBindByPosition(position = 15)
    @Column
    private Long have_kidney_stone;

    @CsvBindByPosition(position = 16)
    @Column
    private Long how_many_kidney_stone_move;

    @CsvBindByPosition(position = 17)
    @Column
    private Long where_location_stone;

    @CsvBindByPosition(position = 18)
    @Column
    private Long most_early_stone_move;

    @CsvBindByPosition(position = 19)
    @Column
    private Long most_late_stone_move;

    @CsvBindByPosition(position = 20)
    @Column
    private Long was_session_kult;

    @CsvBindByPosition(position = 21)
    @Column
    private Long where_location_kult;

    @CsvBindByPosition(position = 22)
    @Column
    private Long how_many_was_kult_in_total;

    @CsvBindByPosition(position = 23)
    @CsvNumber("#.###")
    @Column
    private Double when_was_first_kult;

    @CsvBindByPosition(position = 24)
    @CsvNumber("#.###")
    @Column
    private Double when_was_last_kult;

    @CsvBindByPosition(position = 25)
    @Column
    private Long was_stenting;

    @CsvBindByPosition(position = 26)
    @Column
    private Long where_stenting;

    @CsvBindByPosition(position = 27)
    @Column
    private Long was_stenting_and_kult;

    @CsvBindByPosition(position = 28)
    @Column
    private Long how_many_was_stenting;

    @CsvBindByPosition(position = 29)
    @CsvNumber("#.###")
    @Column
    private Double when_was_first_stenting;

    @CsvBindByPosition(position = 30)
    @CsvNumber("#.###")
    @Column
    private Double when_was_last_stenting;

    @CsvBindByPosition(position = 31)
    @Column
    private Long was_duvl_stone_early;

    @CsvBindByPosition(position = 32)
    @Column
    private Long how_many_was_duvl_in_total;

    @CsvBindByPosition(position = 33)
    @Column
    private Long where_location_duvl;

    @CsvBindByPosition(position = 34)
    @CsvNumber("#.###")
    @Column
    private Double when_was_first_duvl;

    @CsvBindByPosition(position = 35)
    @CsvNumber("#.###")
    @Column
    private Double when_was_last_duvl;

    @CsvBindByPosition(position = 36)
    @Column
    private Long was_chpnl_early;

    @CsvBindByPosition(position = 37)
    @Column
    private Long how_many_was_chpnl_in_total;

    @CsvBindByPosition(position = 38)
    @Column
    private Long where_location_chpnl;

    @CsvBindByPosition(position = 39)
    @Column
    private Long when_was_first_chpnl;

    @CsvBindByPosition(position = 40)
    @Column
    private Long when_was_last_chpnl;

    @CsvBindByPosition(position = 41)
    @Column
    private Long was_open_remove_stone_early;

    @CsvBindByPosition(position = 42)
    @Column
    private Long how_many_was_open_remove_stone_in_total;

    @CsvBindByPosition(position = 43)
    @Column
    private Long where_location_open_remove_stone;

    @CsvBindByPosition(position = 44)
    @CsvNumber("#.###")
    @Column
    private Double when_was_first_open_remove_stone;

    @CsvBindByPosition(position = 45)
    @CsvNumber("#.###")
    @Column
    private Double when_was_open_remove_stone;

    @CsvBindByPosition(position = 46)
    @Column
    private Long are_these_stones_recurrent;

    @CsvBindByPosition(position = 47)
    @Column
    private Long are_these_stones_resudal;

    @CsvBindByPosition(position = 48)
    @Column
    private Long which_was_stones_early;

    @CsvBindByPosition(position = 49)
    @Column
    private Long was_another_operation_on_urinary_tract;

    @CsvBindByPosition(position = 50)
    @Column
    private Long functional_kidney;

    @CsvBindByPosition(position = 51)
    @Column
    private Long dgjp;

    @CsvBindByPosition(position = 52)
    @Column
    private Long rpj;

    @CsvBindByPosition(position = 53)
    @Column
    private Long urethral_stricture_anamnesis;

    @CsvBindByPosition(position = 54)
    @Column
    private Long anomaly_kidney_right;

    @CsvBindByPosition(position = 55)
    @Column
    private Long anomaly_kidney_left;

    @CsvBindByPosition(position = 56)
    @Column
    private Long anomaly_kidney_right_and_left;

    @CsvBindByPosition(position = 57)
    @Column
    private Long prolapse_of_the_genitals_of_women;

    @CsvBindByPosition(position = 58)
    @Column
    private Long cyst_of_kidney;

    @CsvBindByPosition(position = 59)
    @Column
    private Long snm_women;

    @CsvBindByPosition(position = 60)
    @Column
    private Long gmp;

    @CsvBindByPosition(position = 61)
    @CsvNumber("#.###")
    @Column
    private Double water_in_day;

    @CsvBindByPosition(position = 62)
    @Column
    private Long proffesion;

    @CsvBindByPosition(position = 63)
    @Column
    private String what_medications_has_been_taking_for_the_last_year;

    @CsvBindByPosition(position = 64)
    @Column
    private Long has_been_taking_ca;

    @CsvBindByPosition(position = 65)
    @Column
    private Long has_been_taking_d;

    @CsvBindByPosition(position = 66)
    @Column
    private String what_is_water;

    @CsvBindByPosition(position = 67)
    @Column
    private Long what_is_mineral_water;

    @CsvBindByPosition(position = 68)
    @Column
    private String what_eats;

  //  @CsvBindByName(column = "Гипертонич болезнь, лет")
    @CsvBindByPosition(position = 69)
    @Column
    private Long hypertension;
//
    @CsvBindByName(column = "Сах диабет, лет")
    @CsvBindByPosition(position = 70)
    @Column
    private Long diabetes_mellitus;

   // @CsvBindByName(column = "заболевания желудка и ДПК  ( гастрит =1; ЯБДПК =2; ЯБЖ =3;")
    @CsvBindByPosition(position = 71)
    @Column
    private Long diseases_of_the_stomach_and_duodenum;

  //  @CsvBindByName(column = "заболевания кишечника ( нет=0; да=1;")
    @CsvBindByPosition(position = 72)
    @Column
    private Long intestinal_diseases;

    //@CsvBindByName(column = "операции на кишечнике")
    @CsvBindByPosition(position = 73)
    @Column
    private Long operation_on_intestinal;

    //@CsvBindByName(column = "заболевания суставов, артириты ( полиартрит =1; коксартроз=2 ; прочее =3")
    @CsvBindByPosition(position = 74)
    @Column
    private Long joint_diseases_or_arthritis;

   // @CsvBindByName(column = "травмы скелета, тяж переломы  ( нет=0; да=1;")
    @CsvBindByPosition(position = 75)
    @Column
    private Long skeletal_injuries_severe_fractures;

  // @CsvBindByName(column = "другие операции на скелете и костях ( нет=0; да=1")
    @CsvBindByPosition(position = 76)
    @Column
    private Long another_operation_skeletal;

  //  @CsvBindByName(column = "заболевания щитовидной железы ( гипертериоз=1; гипотиреоз=2; тиреоидэктомия =3")
    @CsvBindByPosition(position = 77)
    @Column
    private Long diseases_of_the_thyroid_gland;

    //@CsvBindByName(column = "подвижность и физ активность ( полная=1; умеренная=2; ограниченная=3; палочка=4 костыли=5 кресло=6 лежачий =7)")
    @CsvBindByPosition(position = 78)
    @Column
    private Long mobility_and_physical_activity;

    //@CsvBindByName(column = "психич статус  ( норма=0; умеренные когнитив нарушения=1; выраженные когн нарушения=2; без сознания=3)")
    @CsvBindByPosition(position = 79)
    @Column
    private Long mental_status;

    //@CsvBindByName(column = "неврология ( норма =0 ОНМК легк анамнез=1; ОНМК с остат явл =2; ОНМК с гемипарезом=3; ЧМТ ан =4 периферия sp bifida=5; ...)")
    @CsvBindByPosition(position = 80)
    @Column
    private Long neurology;

    //@CsvBindByName(column = "гинекология анамнез ( экстирпация матки с прид =1 Роды в теч посл года  и лактация =2; ршм НЛТ =3; аденомиоз=4")
    @CsvBindByPosition(position = 81)
    @Column
    private Long gynecology_anamnesis;

    //@CsvBindByName(column = "ПРОЧИЕ СЕРЬЕЗНЫЕ ПРОБЛЕМЫ  СО ЗДОРОВЬЕМ, ВЛИЯЮЩИЕ НА ТАКТИКУ ЛЕЧЕНИЯ ( БА=1; ПИМ=2; аритмия =3 псориас =4; Ожирение =5;ПОДАГРА=6: ГИПЕРПАРАТИРЕОЗ = 7; тромбофлебин нк =8;")
    @CsvBindByPosition(position = 82)
    @Column
    private Long another_difficult_problems_with_health;

    //@CsvBindByName(column = "АЛЛЕРГИЯ ( на АБ =1 ; на йод =2; поливалентная =3; лидокаин новокаин=4)")
    @CsvBindByPosition(position = 83)
    @Column
    private Long allergy;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "audio", referencedColumnName = "id")
    private List<AudioInput> audioInputs;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "A_form", referencedColumnName = "id")
    private AdmissionForm admissionForm;

}
