package com.FSuper.service

import GenericServiceImpl
import com.FSuper.model.Sector
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service
import com.FSuper.repository.SectorRepository
@Service
class SectorService : GenericServiceImpl<Sector, Long>() {

    @Autowired
    lateinit var sectorRepository: SectorRepository

    override val dao : CrudRepository<Sector, Long>
        get() = sectorRepository
}