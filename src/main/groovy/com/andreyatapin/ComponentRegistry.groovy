package com.andreyatapin

@Singleton
class ComponentRegistry implements UserServiceComponent, UserRepositoryComponent {
    UserRepositoryComponent.UserRepository userRepository = new UserRepositoryComponent.UserRepository()
    UserServiceComponent.UserService userService = new UserServiceComponent.UserService(userRepository)
}
