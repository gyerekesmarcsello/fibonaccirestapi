package hu.obuda.devops.fibonaccirestapi.service

import org.springframework.stereotype.Service

@Service
class FibonacciService {
    fun fibonacci(n: Int): Int {
        return when (n) {
            0 -> 0
            1 -> 1
            else -> {
                var a = 0
                var b = 1
                var result = 0
                for (i in 2..n) {
                    result = a + b
                    a = b
                    b = result
                }
                result
            }
        }
    }
}





