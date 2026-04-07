package uz.edu.demo.data.model

import jakarta.persistence.*
import java.time.LocalDateTime
import org.hibernate.annotations.JdbcTypeCode
import org.hibernate.type.SqlTypes

@Entity
@Table(name = "users")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(length = 60)
    var name: String = "",

    @Column(length = 60)
    var surname: String = "",

    @Column(length = 60)
    var email: String? = null,

    @Column(length = 20)
    var phone: String? = null,

    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(name = "permissions", columnDefinition = "text[]")
    var permissions: List<String>? = null,

    @Column(name = "created_at", insertable = false, updatable = false)
    val createdAt: LocalDateTime? = null
)