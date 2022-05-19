package med.entyties;

import lombok.Data;
import med.entyties.Patient;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table
public class Passport {

    @EmbeddedId
    private CompositeKey key;

    @Column
    private Date dateOfIssue;

    @Column
    private String codeOfDepartment;

    @OneToOne
    @JoinColumn(name = "id_patient")
    @JoinColumn(name = "id_passport")
    @JoinColumn(name = "series_passport")
    @JoinColumn(name = "number_passport")
    @JoinColumn(name = "polis")
    private Patient patient;

    @Data
    @Embeddable
    static class CompositeKey implements Serializable {
        private static final long serialVersionUID = -5640177748206441422L;
        @Column
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        @Column
        private Long series;
        @Column
        private Long number;


    }
}
