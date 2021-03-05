package one.digitalinnovation.collections

class Repositorio<T> {

   private var repo = mutableMapOf<String, T>()

    fun create(id:String, value:T){
        repo[id] = value
    }

    fun remove(id:String) = repo.remove(id)

    fun groupById(id: String) = repo[id]

    fun findAll() = repo.values
}