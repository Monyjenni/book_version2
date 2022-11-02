package closet.mony.closet.model

import javax.persistence.*

//@Entity specifies that the class is an entity and is mapped to a database table
@Entity
@Table(name = "books")
data class Book(

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BooksIdSeq")
    @SequenceGenerator(name = "BooksIdSeq", sequenceName = "books_id_seq", allocationSize = 1)
    val id: Long = 0,

    @Column(name = "description")
    val description: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "author")
    val author: String? = null
)