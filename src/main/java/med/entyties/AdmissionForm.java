package med.entyties;

import lombok.Data;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table
public class AdmissionForm {

    @EmbeddedId
    private CompositeKey key;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "anamnesis", referencedColumnName = "id")
    private Anamnesis anamnesis;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_doctor")
    @JoinColumn(name = "fio")
    private Doctor doctor;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_patient")
    @JoinColumn(name = "id_passport")
    @JoinColumn(name = "series")
    @JoinColumn(name = "number")
    @JoinColumn(name = "polis")
    private Patient patient;

    @Data
    @Embeddable
    static class CompositeKey implements Serializable {

        private static final long serialVersionUID = -804116500335397644L;
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column
        private Long id;


    }
}
