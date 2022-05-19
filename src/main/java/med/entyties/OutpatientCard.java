package med.entyties;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table
public class OutpatientCard {

    @EmbeddedId
    private CompositeKey key;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
    private List<AdmissionForm> admissionForm;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
    private List<Examination> examination;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
    private List<Clarifications> clarifications;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
    private List<SecondClarifications> secondClarifications;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
    private List<Conclusion> conclusions;


    @Data
    @Embeddable
    static class CompositeKey implements Serializable {
        private static final long serialVersionUID = 8313716893888896488L;
        @Column
        private Long id;
        @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        @JoinColumn(name = "id_patient")
        @JoinColumn(name = "id_passport")
        @JoinColumn(name = "series")
        @JoinColumn(name = "number")
        @JoinColumn(name = "polis")
        private Patient patient;
    }
}
