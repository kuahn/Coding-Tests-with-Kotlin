class `왕실의 나이트` {
    fun method() {
        val n = readLine()!!.toString()
        val row = Character.getNumericValue(n[1])
        val column = n[0].code - 'a'.code + 1
        val steps = arrayOf(
            shortArrayOf(-2, -1),
            shortArrayOf(-2, 1),
            shortArrayOf(2, -1),
            shortArrayOf(2, 1),
            shortArrayOf(-1, -2),
            shortArrayOf(-1, 2),
            shortArrayOf(1, -2),
            shortArrayOf(1, 2),
        )

        var result = 0
        var nextRow: Int
        var nextColumn: Int

        for ( step in steps ) {
            nextRow = row + step[0]
            nextColumn = column + step[1]

            if ( nextRow in 1..8 && nextColumn in 1 .. 8 ) {
                result += 1
            }
        }

        println(result)
    }
}