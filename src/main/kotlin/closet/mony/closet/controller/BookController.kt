package closet.mony.closet.controller

import closet.mony.closet.model.Book
import closet.mony.closet.service.BookService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController("/books")
class BookController {
    private var bookService: BookService
    constructor(bookService: BookService){
        this.bookService =bookService
    }
}
//@GetMapping
//fun getAll():MutableList<Book> {
//   // return bookService.getAll()
//}