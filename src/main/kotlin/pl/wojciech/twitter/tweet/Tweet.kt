package pl.wojciech.twitter.tweet

import pl.wojciech.twitter.author.Author
import java.time.LocalDateTime
import javax.persistence.*
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

@Entity
@Table(name = "tweets")
class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var Id: Long? = null

    @NotNull
    @ManyToOne
    var author: Author? = null

    @Size(min = 3)
    var text: String? = null

    @Column(name = "created_on")
    var createdOn: LocalDateTime? = null

    @PrePersist
    fun prePersist() {
        createdOn = LocalDateTime.now()
    }
}