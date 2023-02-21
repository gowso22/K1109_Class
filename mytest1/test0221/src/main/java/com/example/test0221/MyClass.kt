package com.example.test0221

class MyClass {
}
// init : 객체 생성 시 init 영역 안에 코드가 실행
// 예) class User(name:String, age:Int){
// init{
// println("객체 생성할 때 마다, init 실행이 됨")
//  }
// }
// 클래스의 생성자 안에 매개변수는 지역변수라서,
// 다른 함수에서 재사용 못함(변수의 효력범위 때문)
// 그러나, 예외) >> init 키워드 본문 안에서는 해당 매개변수를 그냥 사용 가능
//             >> 주생성자에서 var, val로 지정하면, 다른 함수에서도 사용 가능
// 클래스의 멤버변수의 효과,
// 예)
// class User(val name:String,val count:Int){
// fun someFun(){
//     println("name : $name, count : $count")
//  }
// }
// fun main(){
// var user = User("kk", 10)
// user.someFun()
//}

class User(val name:String, val age:Int){
    fun someFun(){
        println("name : $name, age : $age")
    }
    init{
        println()
        println("객체 생성할 때 마다, init 실행이 됨")
    }
}


fun main(){
    var user = User("kk", 10)

    user.someFun()

    var user01 = User01("K404", 10, 123)

}

// 주생성자와 보조생성자가 같이 있다면
// 보조생성자에서 주생성자로 연결한다.
// 보조생성자 선언부 뒤에 : 붙여서 해당 주생성자를 호출
// ex) constructor(name : String, age : Int)
class User01(name:String, age: Int, phone : Int){
    // 실제작업은 주 생성자에서 선언을 해서 사용을 많이 하는 편
   // constructor(name:String, age: Int) : this(name)

  //   constructor(name:String,age: Int, phone: Int) : this(name)
}

// 상속
// 클래스 선언부 콜론 뒤에 부모클래스를 작성
// 주의) 코틀린에서는 open이라는 키워드를 사용해야. 상속이 가능합니다.

open class Super(name : String){  // open 키워드 사용

}

class Sub : Super{
    constructor(name: String) : super(name)
}






















