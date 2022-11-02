package closet.mony.closet.repository

import closet.mony.closet.model.Book
import org.springframework.data.jpa.repository.JpaRepository

//help us with query
//JpaRepo( SQL Injection , if it will help with queries and update for us )
interface BookRepository : JpaRepository<Book, Long>