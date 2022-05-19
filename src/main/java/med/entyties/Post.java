package med.entyties;

import lombok.Data;


import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    @Column
    private List<Doctor> doctors;
}
