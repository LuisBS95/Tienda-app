package com.tienda.repositories;




import org.springframework.data.repository.PagingAndSortingRepository;

import com.tienda.entities.CategoriaEntity;

public interface CategoriaDao extends PagingAndSortingRepository<CategoriaEntity, Long> {
	
	

}
