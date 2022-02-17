class `위에서 아래로` {
    fun method() {
        val n = readLine()!!.toInt()
        val array = ArrayList<Int>()

        for ( i in 1 .. n) {
            array.add(readLine()!!.toInt())
        }

        array.sortDescending()

        print(array.joinToString(" "))
    }
}
