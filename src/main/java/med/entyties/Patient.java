package med.entyties;

import lombok.Data;
import org.springframework.data.annotation.Id;


import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class Patient {

    @EmbeddedId
    private CompositeKey key;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_admission_form")
    private AdmissionForm admissionForm;

    @Column
    private String fio;

    @Data
    @Embeddable
   static class CompositeKey implements Serializable {
        private static final long serialVersionUID = -152379067885174953L;
        @Column
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;


        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JoinColumn(name = "id_passport")
        @JoinColumn(name = "series")
        @JoinColumn(name = "number")
        private Passport passport;

        @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        @JoinColumn(name = "polis")
        private Polis polis;

    }
}
