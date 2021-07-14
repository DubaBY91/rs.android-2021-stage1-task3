package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        val m = array[0]
        val n = array[1]
        val end = n / 2 + 1
        var n_choose_x = 1
        var counter = 1
        val arr = mutableListOf<Int>()
        val result = mutableListOf<Int>()

        while (counter < end) {
            arr.add(counter)
            counter++
        }

        for (element in arr) {
            n_choose_x = n_choose_x * (n + 1 - element) / element
            if (n_choose_x >= m) {
                result.add(element)
            }
        }
        if (result.size != 0) {
            return result[0]
        } else {
            return null
        }
    }
}



