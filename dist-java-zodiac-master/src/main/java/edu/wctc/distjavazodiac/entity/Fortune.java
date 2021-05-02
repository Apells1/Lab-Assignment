package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Entity
@NoArgsConstructor
@Table(name = "Fortune")
public class Fortune {
    @Id
    @Column (name = "fortune_id")
    private int id;
    @Column (name = "text")
    private String text;
}
