package com.project.NearbyConnect.enitities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private Long adId;
    
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    private String title;
    private String description;
    private String city;
    private double price;
    private LocalDateTime postDate;
}
