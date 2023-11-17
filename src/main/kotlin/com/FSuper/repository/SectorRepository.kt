package com.FSuper.repository

import com.FSuper.model.Sector
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface SectorRepository : CrudRepository<Sector, Long>