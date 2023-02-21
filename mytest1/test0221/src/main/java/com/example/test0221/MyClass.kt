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
// 상속의 이점은 상위 클래스에 정의된 멤버(변수, 함수)를 하위 클래스에서 자신의 멤버처럼 사용할 수 있는 것
// 클래스 선언부 콜론 뒤에 부모클래스를 작성
// 주의) 코틀린에서는 open이라는 키워드를 사용해야. 상속이 가능합니다.

open class Super(name : String){  // open 키워드 사용

}

class Sub : Super{
    constructor(name: String) : super(name)
}

open class Super2(name : String){  // open 키워드 사용
    var superData = 10

    fun someFun(){
        println("super Class")
    }
}

class Sub2 : Super2{
    constructor(name: String) : super(name)
}
// 접근제한자
// 기본 public
// public, private, protected, internal
// 예) open class Super{
// var superData01 = 10
// protected var superData02 = 10
// private var superData03 = 10
// }
// class Sub : Super(){
// fun subFun(){
// superData01++
// superData02++
// superData03++
//  }
//}
 open class Super12{
 var superData01 = 10
 protected var superData02 = 10
 private var superData03 = 10
 }
 class Sub12 : Super12(){
 fun subFun(){
 superData01++ // public
 superData02++ // protected
// superData03++ // private
  }
}
// 데이터클래스
// data라는 키워드를 사용.
// 비교, 출력시 해당 데이터를 처리한다. (메모리 위치의 주소값이 아니라.)
// 예시) class NonDataCl(val name : String, val age : Int)
//       data DataCl(val name : String, val age : Int)

fun main(){
    var obj = Sub2("nam")
    println(obj.superData)


    var user = User("kk", 10)

    user.someFun()

    var user01 = User01("K404", 10, 123)

    //접근제한자
    println()
    var obj00 = Sub12()
    println(obj00.superData01)
    //obj00.superData02;
    //obj00.superData03;

}


















