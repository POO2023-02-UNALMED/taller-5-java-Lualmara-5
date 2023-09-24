package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal {
	private static ArrayList<Anfibio> listado=new ArrayList <>();;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		this(null,0,null,null,null,false);
	}
	public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
		listado.add(this);
	}
