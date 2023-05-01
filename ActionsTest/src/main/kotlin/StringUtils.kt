object StringUtils {

    fun capitalize(string: String) = string.uppercase()
    fun capitalize(string: String, index: Int) =
        string.take(index) + string.drop(index).take(1).uppercase() + string.drop(index+1)

}