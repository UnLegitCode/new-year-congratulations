package ru.unlegit.nyc.model;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "congratulations")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Congratulation {

    @Id
    @GeneratedValue
    Long id;
    @Column(length = 48)
    String author;
    @Column(columnDefinition = "text")
    String content;
}