package zooAnimales;

import java.util.ArrayList;

import gestion.*;

public class Animal {

	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal() {
		this(null,0,null,null);
	}