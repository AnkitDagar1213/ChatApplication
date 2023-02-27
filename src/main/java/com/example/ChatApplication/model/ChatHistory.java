package com.example.ChatApplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Chat_History")
public class ChatHistory {
    @Id
    @Column(name="Chat_Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ChatId;
    @JoinColumn(name="")
    @ManyToOne
    private User to;
    @JoinColumn(name="")
    @ManyToOne
    private User from;
    @Column(name="")
    private String message;
    @CreationTimestamp
    @Column(nullable = false,updatable = false,name="")
    private Timestamp Created_date;
    @UpdateTimestamp
    @Column(name="")
    private Timestamp Update_date;
    @ManyToOne
    @JoinColumn
    private Status statusid;
}
