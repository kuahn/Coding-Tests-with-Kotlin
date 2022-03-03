class 피보나치 {
    fun method1() {
        val n = readLine()!!.toInt()

        check(n <= 78) {
            "Int Max"
        }

        fun fibo(x:Int): Int {
            return if ((x == 1) || (x == 2)) {
                1
            } else {
                fibo(x - 1) + fibo(x - 2)
            }
        }

        print(fibo(n))
    }

    fun method2() {
        val n = readLine()!!.toInt()
        val d = IntArray(100)

        check(n <= 78) {
            "Int Max"
        }

        fun fibo(x:Int): Int {

            if ((x == 1) || (x == 2)) {
                return 1
            }

            if ( d[x] != 0 ) {
                return d[x]
            } else {
                d[x] = fibo(x - 1) + fibo(x - 2)
            }

            return d[x]
        }

        print(fibo(n))
    }
}