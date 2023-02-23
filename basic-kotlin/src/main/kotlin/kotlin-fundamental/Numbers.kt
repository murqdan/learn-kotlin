fun main() {
    //byte 8 bit
    val byteNumber = 0b11010010

    //short 16 bit
    val shortNumber: Short = 10

    //int 32 bit
    val intNumber = 100

    //long 64 bit
    val longNumber: Long = 100

    //float 32 bit
    val floatNumber: Float = 0.123456789f

    //double 64 bit
    val doubleNumber: Double = 1.3

    val byteNumber2: Byte = 10
    val intNumber2: Int = byteNumber.toInt()

    val stringNumber = "23"
    val intNumber3 = 3
    print(intNumber3 + stringNumber.toInt())
}