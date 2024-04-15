class UserViewModel @ViewModelInject constructor(private val userRepository: UserRepository) : ViewModel() {
    val users: LiveData<List<User>> = userRepository.getUsers()
}
