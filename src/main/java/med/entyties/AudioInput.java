package med.entyties;

import lombok.Data;

import javax.persistence.*;
import java.io.InputStream;

@Data
@Entity
@Table
public class AudioInput {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String content_type;

    @Column
    private Long size;

    @Column
    @Lob
    private byte[] audio;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "anamnesis", referencedColumnName = "id")
    private Anamnesis anamnesis;
}
