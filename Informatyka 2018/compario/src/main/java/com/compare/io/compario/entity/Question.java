package com.compare.io.compario.entity;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="questions")
public class Question {

    @Id
    @Column(name = "id_question")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "value")
    private int question;

    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "question")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Response> responsesList = new ArrayList<>();

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question=" + question +
                ", responsesList=" + responsesList +
                '}';
    }
}
