package med.entyties;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table
public class Doctor {

    @EmbeddedId
    private CompositeKey key;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "post", referencedColumnName = "name")
    private Post post;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "rsult", referencedColumnName = "id")
    private Result result;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "a_form")
    private AdmissionForm admissionForm;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "conslusion")
    private Conclusion conclusion;

    @Data
    @Embeddable
    static class CompositeKey implements Serializable {
        private static final long serialVersionUID = -5119247205573449191L;
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column
        private Long id;
        @Column
        private Long fio;
    }
}
