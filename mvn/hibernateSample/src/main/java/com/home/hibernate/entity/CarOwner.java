package com.home.hibernate.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

@Entity
@Data
public class CarOwner
{
   @Id
   @GeneratedValue( strategy = GenerationType.AUTO )
   private int             id;
   private String          name;
   @Transient
   private String          details;
   @ManyToMany( cascade = CascadeType.ALL, mappedBy = "owners" )
   private Collection<Car> cars = new ArrayList<>();


   public CarOwner( String name )
   {
      this.name = name;
   }


}
