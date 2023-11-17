package com.FSuper.repository

import com.FSuper.model.Repositor
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface RepositorRepository : CrudRepository<Repositor, Long>