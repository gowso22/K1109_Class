package com.example.test3_2

//최상위에 선언한 변수나 클래스의 멤버 변수는 선언과 동시에 초깃값을 할당해야 하며
//함수 내부에 선언한 변수는 선언과 동시에 초깃값을 할당하지 않아도 됩니다

// lateinit 키워드는 이후에 초깃값을 할당할 것임을 명시적으로 선언
//  기초 데이터 타입에서는 안됨.
// 예) lateinit var data1 : String

// 코틀린의 모든 데이터 타입은 객체다.
// 예) var data1 : int  = 10
//      data1 = data1 +10
//      data1 = data1.plus(10)


// 문자열 표기에 삼중따옴표(""")사용
// 예) val str1  = "hi \n young"
//      val str2 = """
//              hi
//              world
//              """

class MyClass {
    var name = "홍길동"
    var age = "30"
    var name2 = "홍길동이"
}

fun main() {
    println("1123555565")
    var myClass = MyClass()
    // myClass.name2 = "honghong"


    myClass.name = "hongildong"
    println(myClass.age)
    println(myClass.name)
    println(myClass.name2)

    // Any - 모든 타입 가능(Object)
// fun some() : Unit{ }
// fun some() :  {  } >> 생략이 가능
// Unit - 반환문이 없는 함수(void)
    var data12: Any = 10
    var data2: Any = "STRING"
    var data3: Any = MyClass()

    fun test3(): Unit {
        println("data12 : $data12")
        println("data2 : $data2")
        println("data3 : $data3")
    }

    var testxx = test3()
    println(testxx)


    var data1: Int = 10
    // data1 = data1 +10
    data1 = data1.plus(10)
    println(data1)


    val str1 = "hi \n young"
    val str2 = """
            hi
              world
              """
    println("str 1: $str1")
    println("str 2: $str2")
    // 매개변수 먼저 선언한 다음 리턴타입 설정(java와 다른 점)
    fun addSum(no: Int): Int {
        var sum = 0
        for (i in 1..no) {
            sum += i
        }
        return sum
    }
    println("sum : ${addSum(10)}")

    // Nothing, ?(연산자) 널허용 연산자
    // 변수, 함수 둘다 타입 지정이 가능함.
    // ex) var data1 : Nothing = null
    // var data1 : Nothing? = null


    var data21: Nothing? = null

    // 함수 선언
    // fun 함수명(매개변수 명 : 타입) : 반환타입 {  }
    // 예) fun some(data1 : Int) : Int {  }

    // 함수 의 매개변수에 기본 default 값 선언 가능
    // 예) fun some(data1 : Int, data2 : Int = 10) : Int {
    // return data1 * data2
    //  }
    fun some(data1 : Int, data2 : Int = 10) : Int {
        return data1 * data2
    }
    println("some =  ${some(10,50)}")

    // 컬렉션 배열
    // 타입 : Array // 3>> 배열의 길이 // {0} >> 배열원소의 초기값
    // 예) val data1 : Array<Int> = Array(3, {0}) >> new 없앰

    val data00 : Array<Int> = Array(5, {0})
    data00[0] = 10
    data00[1] = 250
    data00.set(2, 30)


    println( """              array size : ${data00.size}
        array data : ${data00[0]}, ${data00[1]},${data00[2]}, ${data00[3]}
    """)

    // 컬렉션 기초타입 배열
    // val data1 : IntArray = IntArray(3, {0})
    // val data2 : BooleanArray = BooleanArray(3, {false})

    // 기초타입 arrayOf() 함수 이용
    // 예)
    val data01 = intArrayOf(10,20,30)
    val data02 = booleanArrayOf(true, false)

    println(""" array size data01 : ${data01.size}
        array data  data01 : ${data01[0]}, ${data01.get(2)}
    """)

    // 가변 리스트, 셋, 맵
    // List = listof() >> 불변, mutableListOf() >> 가변
    // Set >> setOf : 불변, mutableSetOf() : 가변
    // Map >> mapOf : 불변, mutableMapOf() : 가변

    val data07 = mutableListOf<Int>(10, 20 ,30)
    data07.add(3, 40)
    data07.set(1, 50)

    println(""" data07 size >> ${data07.size}""")
    println(""" data07 0~3 >> ${data07[0]}, ${data07.get(1)}, ${data07[2]}, ${data07.get(3)}""")

    // if 문장 표현식으로해서 변수에 대입
    var data11 = 10
    val result = if (data11>0){
        println("if 테스트")
        true
    }else{
        println("else 테스트")
        false
    }

    println("result 결과 테스트  : ${result}")
    println()
    // when
    //예)
    var data22 = "hi"
    when(data22){
        "hi" -> println("data22 is hi")
        "hello" -> println("data22 is hello")
        else -> {
            println("data22 is not valid")
        }
    }
    println()
    // in(범위 지정), is(타입 확인)
    // 예)
    var data05 : Any = "hi"
    when(data05){
        is String -> println("data05 is String")
        in 1..10 -> println("data05 is 1~10")
        else -> println("data05 is not valid")
    }
    // when 표현식
    println()
    println("when 표현식")
    var data09  = 10
    val result00 = when{
        data09 <=0 -> println("data09  <= 0")
        data09 > 100 -> println("data09 > 100")
        else -> println("data09 is not valid")
    }
    // for, while
    // for(i in 1..10){} >> 1~10 1씩 증가
    // for(i in 1 until 10){} >> 1~9 1씩 증가
    // for(i in 1..10 step 2){} >> 1~10 2씩 증가
    // for(i in 10 downTo 1){} >> 10~1까지 1씩 감소

    println()
    println("indices")
    // indices >> indices는 컬렉션 타입의 인덱스값을 의미
    // withIndex >> 인덱스와 실제 데이터를 함께 가져옴
    // 예)
    var data55 = arrayOf<Int>(10, 20 ,30)
    for(i in data55.indices){
        println(data55[i])
        if (i !== data55.size -1)
            print(",")
    }
    println()
    println("withIndex")
    for ((index, value) in data55.withIndex()){
        print(value)
        if (index !== data55.size - 1) print(",")
    }
}


