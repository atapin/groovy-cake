package com.andreyatapin

/**
 *
 */
class UserServiceComponent {
    final def userService = new UserService()

    class UserService {

        UserRepositoryComponent.UserRepository userRepository

        def authenticate(User user) {
            userRepository.authenticate(user)
        }

        def create(String username) {
            userRepository.create(new User(username: username))
        }

        def delete(User user) {
            userRepository.delete(user)
        }
    }
}
