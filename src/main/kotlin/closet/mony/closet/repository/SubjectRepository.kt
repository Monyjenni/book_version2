package closet.mony.closet.repository

import closet.mony.closet.model.Subject
import org.springframework.data.jpa.repository.JpaRepository

interface SubjectRepository : JpaRepository<Subject, Long> {
}