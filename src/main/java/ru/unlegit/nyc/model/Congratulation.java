package ru.unlegit.nyc.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "congratulations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Congratulation {

    @Id
    @GeneratedValue
    Long id;
    @Column(length = 32)
    String author;
    @Column(columnDefinition = "text")
    String content;
    @CreatedDate
    long creationTime;
}