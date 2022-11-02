package closet.mony.closet.service

import closet.mony.closet.model.Book
import closet.mony.closet.model.Subject
import closet.mony.closet.repository.BookRepository
import org.springframework.stereotype.Service
import javax.persistence.Column

@Service
class BookService(
    // BookRepo is just a tool that has features , so we gotta import or bind the tool or feature
    // into application ( person)
    private val bookRepository: BookRepository
){

    fun getAll() : List<Book> {

        //findAll is just a method that replaced ( select * from ...)
        val books = bookRepository.findAll()
        return books.toList()
    }

    fun showByID (id: Long): Book? {
        //or if can't find just throw null
        val book = bookRepository.findById(id).orElseGet { null }
        return book
    }

    fun createOne(description : String, name: String, author: String): Book{
        val newBook = Book (
            name= name,
            description = description,
            author = author
                )
        // newBook needs to be saved into new in bookRepo that's why we gotta create new variable name
        val savedBook = bookRepository.save(newBook)

        return savedBook
    }

    fun delete(id: Long): String {
        bookRepository.deleteById(id)
        return "BookId[$id] is already deleted"
    }


}
