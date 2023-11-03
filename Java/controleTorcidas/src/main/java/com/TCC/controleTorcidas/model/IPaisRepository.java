package com.TCC.controleTorcidas.model;
import org.springframework.data.repository.CrudRepository;

//Herda de Crud, que aceita 2 tipos genericos que é o objetos que estamos falando (Pais) e o tipo do id dele, que nesse caso 
//é long. O crud, abreviacao de:

//C Create
//R Restore
//U Update 
//D Delete

public interface IPaisRepository extends CrudRepository<Pais,Long>{

}


