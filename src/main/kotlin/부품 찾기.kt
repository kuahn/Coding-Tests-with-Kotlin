class `부품 찾기` {
    fun CountingSortMethod() {
        val n = readLine()!!.toInt()
        val parts = readLine()!!.split(" ".toRegex()).map(String::toInt).toList()
        val m = readLine()!!.toInt()
        val necessaryParts = readLine()!!.split(" ".toRegex()).map(String::toInt).toList()
        val array = IntArray((parts.maxOrNull() ?: 0) + 1)

        check(n == parts.size) {
            "Exceeded number of parts"
        }

        check(m == necessaryParts.size) {
            "Exceeded number of necessary parts"
        }

        for ( i in parts ) {
            array[i] = 1
        }

        for ( i in necessaryParts ) {
            if ( array[i] == 1 ) {
                print("YES ")
            } else {
                print("NO ")
            }
        }
    }

    fun binarySearchMethod() {
        val n = readLine()!!.toInt()
        val parts = readLine()!!.split(" ".toRegex()).map(String::toInt).toList().sorted()
        val m = readLine()!!.toInt()
        val necessaryParts = readLine()!!.split(" ".toRegex()).map(String::toInt).toList()

        check(n == parts.size) {
            "Exceeded number of parts"
        }

        check(m == necessaryParts.size) {
            "Exceeded number of necessary parts"
        }

        fun binarySearch(array:List<Int>, target:Int, start:Int, end:Int): Int? {
            var startVar = start
            var endVar = end

            while ( startVar <= endVar ) {
                val mid = (startVar + endVar) / 2

                if ( array[mid] == target ) {
                    return mid
                } else if ( array[mid] > target ) {
                    endVar = mid - 1
                } else {
                    startVar = mid + 1
                }
            }

            return null
        }

        for ( i in necessaryParts ) {
            val result = binarySearch(parts, i, 0, n - 1)

            if ( result == null ) {
                print("NO ")
            } else {
                print("YES ")
            }
        }

    }
}