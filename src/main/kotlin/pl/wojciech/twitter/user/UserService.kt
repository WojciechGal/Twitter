package pl.wojciech.twitter.user

interface UserService {

    fun findByUserNick(nick: String): User

    fun saveUser(user: User)
}
