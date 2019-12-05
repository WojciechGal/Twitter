package pl.wojciech.twitter.author

interface AuthorService {

    fun findByAuthorNick(nick: String): Author

    fun saveAuthor(author: Author)
}