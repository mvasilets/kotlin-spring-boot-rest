package me.example.demo.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class APIExceptionHandler {

    @ExceptionHandler(value = [PasswordNotPresentException::class])
    fun handleEmptyPassword(exception: PasswordNotPresentException) : ResponseEntity<Any> {
        val map = mapOf(("message" to exception.message.toString()))
        return ResponseEntity.badRequest().body(map)
    }

}