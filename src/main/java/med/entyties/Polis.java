package med.entyties;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table
public class Polis {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private Long number;

    @Column
    private String medicalDepartment;

    @Column
    private Date dateOfIssue;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_patient")
    @JoinColumn(name = "id_passport")
    @JoinColumn(name = "series_passport")
    @JoinColumn(name = "number_passport")
    @JoinColumn(name = "polis")
    private Patient patient;

}
