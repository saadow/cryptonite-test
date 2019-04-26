package com.saadow.cryptonitetest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Location implements Serializable {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.PROTECTED)
	private int id;
	private String name;
	private double x;
	private double y;
	private boolean head;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "route", insertable = false, updatable = false)
	private Route route;
}
