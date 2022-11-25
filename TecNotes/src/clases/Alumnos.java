package clases;

import clases.Hash;

public class Alumnos {

 private String carnet;
 private String nombre;
 private String apellido;
 private String carrera;
 private String email;
 private String pw;

 public String getCarnet() {
  return carnet;
 }

 public void setCarnet(String carnet) {
  this.carnet = carnet;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getApellido() {
  return apellido;
 }

 public void setApellido(String apellido) {
  this.apellido = apellido;
 }

 public String getCarrera() {
  return carrera;
 }

 public void setCarrera(String carrera) {
  this.carrera = carrera;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public void setPw(String pw) {
  this.pw = Hash.sha1(pw);
 }

 public String getPw() {
  return pw;
 }
}
