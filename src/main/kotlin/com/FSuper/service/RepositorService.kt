package com.FSuper.service

import GenericServiceImpl
import com.FSuper.model.Repositor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import com.FSuper.repository.RepositorRepository

@Service
class RepositorService : GenericServiceImpl<Repositor, Long>() {

    @Autowired
    lateinit var repositorRepository: RepositorRepository

    override val dao : CrudRepository<Repositor, Long>
        get() = repositorRepository
}