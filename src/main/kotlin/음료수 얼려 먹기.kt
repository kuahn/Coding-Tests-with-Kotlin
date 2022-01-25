class `음료수 얼려 먹기` {
    fun method() {
        val (n, m) = readLine()!!.split(" ".toRegex()).map(String::toInt)
        val graph = ArrayList<ArrayList<Int>>()

        for ( i in 0 until n) {
            graph.add(readLine()!!.chunked(1).map(String::toInt).toList() as ArrayList<Int>)
        }

        fun dfs(x:Int, y:Int): Boolean {
            if ( x <= -1 || x >= n || y <= -1 || y >= m ) {
                return false
            }

            if ( graph[x][y] == 0 ) {
                graph[x][y] = 1
                dfs(x-1, y)
                dfs(x, y-1)
                dfs(x+1, y)
                dfs(x, y+1)
                return true
            }

            return false
        }

        var result = 0
        for ( i in 0 until n ) {
            for ( j in 0 until m ) {
                if (dfs(i, j)) {
                    result++
                }
            }
        }

        print(result)
    }
}