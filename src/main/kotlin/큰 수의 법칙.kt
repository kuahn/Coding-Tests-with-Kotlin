class `큰 수의 법칙` {
    fun method() {
        var (n, m, k) = readLine()!!.split(" ".toRegex()).map(String::toInt)
        val data = readLine()!!.split(" ".toRegex()).map(String::toInt).toList().sorted()

        val firstHighNumber = data[n-1]
        val secondHighNumber = data[n-2]
        var result = 0

        while (true) {
            for (i in 1..k) {
                if (m == 0) {
                    break
                }

                result += firstHighNumber
                m--
            }

            if (m == 0) {
                break
            }

            result += secondHighNumber
            m--
        }

        print("$result")
    }
}
