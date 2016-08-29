package com.andreyatapin

/**
 *
 */
trait UserRepositoryComponent {
    final def repository = new UserRepository()

    class UserRepository {

        def authenticate(User user) {
            println "Authenticating user ${user}"
            user
        }

        def create(User user) {
            println "Creating user ${user}"
            user
        }

        def delete(User user) {
            println "Deleting user ${user}"
            user
        }
    }
}