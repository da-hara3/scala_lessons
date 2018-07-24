package com.lessons.model

// javaと違いパッケージ名とディレクトリ階層を異なる形にできる。
// そんなにする必要もないとは思うけれども。


// 同名のクラスとオブジェクトがあったあ場合、
// コンパニオンクラス、コンパニオンオブジェクトと呼ぶ
object User {
  def getInfo() = println("User Object")
  def apply(name: String) = new User(name)
}


class User (val name: String) {
  def sayhi() = {
    println(this.name);
  }
}

class AdministratorUser (name: String) extends User(name) {
  override def sayhi() = {
    println("I am AdiminUser: " + name);
  }
}
