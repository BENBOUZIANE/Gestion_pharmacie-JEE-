package web;

import java.util.ArrayList;

import metier.Medicament;

public class MedicamentBeans {
	
	private Medicament m = new Medicament();
	private ArrayList<Medicament> list = new ArrayList<>();
	
	public Medicament getM() {
		return m;
	}
	public void setM(Medicament m) {
		this.m = m;
	}
	public ArrayList<Medicament> getList() {
		return list;
	}
	public void setList(ArrayList<Medicament> list) {
		this.list = list;
}}
