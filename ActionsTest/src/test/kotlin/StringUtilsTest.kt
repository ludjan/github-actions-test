import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.function.Executable

internal class StringUtilsTest {

    @Test
    fun capitalizeWhole() {
        assert(StringUtils.capitalize("hei") == "HEI")
    }

    @Test
    fun capitalizeIndex() {
        assert(StringUtils.capitalize("hei", 0) == "Hei")
        assert(StringUtils.capitalize("hei", 1) == "hEi")
        assert(StringUtils.capitalize("hei", 2) == "heI")
        assert(StringUtils.capitalize("hei", 3) == "hei")
    }
}