package com.compare.io.compario.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "responses")
public class Response {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "text")
    private String text;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "id_response")
    private Question question;

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", questionId=" + question.getId() +
                '}';
    }
}
