package com.makingdevs.nahum

import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface ChapterRepository extends ReactiveCrudRepository<Chapter/* Tipo de entidad*/, String /*typo de llave primaria*/>{

}
/*ReactiveCrudRepository extiende de Repository, 
un Spring Data Commons marker interface that signals 
Spring Data to create a concrete implementation based 
on the reactive paradigm while also capturing domain 
information. It also comes with some predefined CRUD 
operations (save, delete, deleteById, deleteAll, 
findById, findAll, and more).*/