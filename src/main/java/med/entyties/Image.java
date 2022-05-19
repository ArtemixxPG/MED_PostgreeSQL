package med.entyties;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String imageType;

    @Column
    private Double size;

    @Column
    @Lob
    private byte[] image;

}
