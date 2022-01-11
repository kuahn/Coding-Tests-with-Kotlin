class 상하좌우 {
    fun method() {
        val n = readLine()!!.toInt()
        val plans = readLine()!!.split(" ".toRegex())

        var x = 1
        var y = 1
        val dx = arrayOf(0, 0, -1, 1)
        val dy = arrayOf(-1, 1, 0, 0)
        val moveTypes = arrayOf("L", "R", "U", "D")
        var nx = 0
        var ny = 0

        for ( plan in plans ) {
            for ( i in moveTypes.indices) {
                if ( plan == moveTypes[i] ) {
                    nx = x + dx[i]
                    ny = y + dy[i]
                }
            }

            if ( nx < 1 || ny < 1 || nx > n || ny > n ) {
                continue
            }

            x = nx
            y = ny
        }

        print("$x $y")
    }
}