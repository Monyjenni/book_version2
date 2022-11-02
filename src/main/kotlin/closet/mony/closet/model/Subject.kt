package closet.mony.closet.model

import javax.persistence.*

@Entity
@Table(name = "subjects")
data class Subject(
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subjectIdSeq")
    @SequenceGenerator(name = "subjectIdSeq", sequenceName = "subjects_id_seq", allocationSize = 1)
    val id: Long = 0,

    @Column(name = "duration")
    val duration: Long,

    @Column(name = "description")
    val description: String,

    @Column(name = "professor_name")
    val professorName: String,

    @Column(name = "subject")
    val subject: String,

    @Column(name = "university")
    val university: String
)