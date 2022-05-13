package com.clean.data

interface IFetchDataRepository<T> {
    fun getData(): T
}

interface IAddDataRepository<T, O> {
    fun addData(data: T): O
}

interface IDeleteDataRepository<T, O> {
    fun deleteData(id: T): O
}


interface IUpdateRepository : IFetchDataRepository<List<String>> {

}


class UpdateRepository : IUpdateRepository {
    override fun getData(): List<String> {
        TODO("Not yet implemented")
    }

}






