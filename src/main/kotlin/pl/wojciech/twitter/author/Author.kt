package pl.wojciech.twitter.author

import pl.wojciech.twitter.role.Role
import pl.wojciech.twitter.tweet.Tweet

import javax.persistence.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

@Entity
@Table(name = "authors")
class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @NotBlank
    @Size(min = 4, max = 15)
    @Column(unique = true)
    var nick: String? = null


    @Pattern(regexp = ".*[0-9]+.*")
    @Size(min = 5)
    var password: String? = null

    var enabled: Int = 0

    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
    @JoinTable(name = "author_role", joinColumns = [JoinColumn(name = "author_id")], inverseJoinColumns = [JoinColumn(name = "role_id")])
    var roles: Set<Role>? = null

    @OneToMany(mappedBy = "author")
    var tweets: List<Tweet> = listOf()
}
