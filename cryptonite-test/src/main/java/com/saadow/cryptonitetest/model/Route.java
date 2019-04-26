package com.saadow.cryptonitetest.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route implements Serializable {
	@Id
	@GeneratedValue
	@Setter(AccessLevel.PROTECTED)
	private int id;
	private String name;
	private Location head;
	@OneToMany (mappedBy = "route", fetch = FetchType.LAZY)
	private List<Location> locations;
}
