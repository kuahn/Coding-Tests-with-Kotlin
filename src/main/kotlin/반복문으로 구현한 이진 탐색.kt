class `반복문으로 구현한 이진 탐색` {
    fun method() {
        val (n, target) = readLine()!!.split(" ".toRegex()).map(String::toInt)
        val array = readLine()!!.split(" ".toRegex()).map(String::toInt).toList()
        var start = 0
        var end = n - 1
        var result = 0

        while (start <= end ) {
            val mid:Int = start + end % 2

            if (array[mid] == target) {
                result = mid
                break
            } else if (array[mid] > target) {
                end = mid - 1
            } else {
                start = mid + 1
            }
        }

        if ( result == 0 ) {
            print("원소가 존재하지 않습니다.")
        } else {
            print("${result + 1}")
        }
    }
}