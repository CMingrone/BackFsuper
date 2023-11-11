
import java.io.Serializable

interface GenericService<T, ID : Serializable?> {
    fun save(entity: T): T

    fun delete(id: ID)

    operator fun get(id: ID): T?

    fun getAll() : MutableList<T>?
}