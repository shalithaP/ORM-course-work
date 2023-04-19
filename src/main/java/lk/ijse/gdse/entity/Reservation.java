package lk.ijse.gdse.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
@NoArgsConstructor
@Getter
@Setter
@ToString
@Data
@AllArgsConstructor
@Entity
public class Reservation {
    @Id
    private String res_id;
    @CreationTimestamp
    private Date date;
    @ManyToOne
    private Student student_id;
    @ManyToOne
    private Rooms room_type_id;
    private String status;



}

