package com.andreyatapin

import com.andreyatapin.UserRepositoryComponent.UserRepository
import groovy.transform.CompileStatic
import groovy.transform.SelfType

@CompileStatic
@SelfType([UserRepositoryComponent])
trait UserServiceComponent {
    UserService userService

    static class UserService {

        UserRepository userRepository

        public UserService(UserRepository userRepository) {
            this.userRepository = userRepository
        }

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
