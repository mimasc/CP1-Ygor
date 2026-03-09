package br.com.fiapride.model;

 public class Veiculos {
// encapsulamento dos atributos
 private String individuo; //dono do carro
 private String placa; //placa do carro
 private int gasolina; //quantidade de gasolina no tanque 

 // operações
 public void adicionarGasolina(double v) {
 gasolina = gasolina + (int) v;
 }

 public void gastaGasolina(double v) {
	 gasolina = gasolina - (int) v;
 }
 private String get_individuo() {
	 return individuo;
 }
 public void setGasolina(double gasolina) {
	 this.gasolina = (int) gasolina;
 }
 public String getPlaca() {
	 return placa;
 }
 public void setPlaca(String placa) {
	 this.placa = placa;
 }
 public void setIndividuo(String individuo) {
	 this.individuo = individuo;
 }
 public int getGasolina() {
	 return gasolina;
 }
 }
