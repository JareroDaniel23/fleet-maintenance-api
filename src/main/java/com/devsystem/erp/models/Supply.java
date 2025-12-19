package com.devsystem.erp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "supplies")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supply {

    @Id
    private String sku;
    private String name;
    private double costPerUnit;
    private String unit;



}
