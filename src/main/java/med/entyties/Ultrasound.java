package med.entyties;

import lombok.Data;

import javax.persistence.*;
import java.io.InputStream;

@Data
@Entity
@Table
public class Ultrasound {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private Double size;

    @Column
    @Lob
    private byte[] video;

}
