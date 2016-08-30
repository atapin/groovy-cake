package com.andreyatapin

/**
 *
 */
class App {
    static void main(String[] args) {
        ComponentRegistry registry = ComponentRegistry.instance

        def user = registry.userService.create("TestUser")
        registry.userService.authenticate(user)
        registry.userService.delete(user)
    }
}
