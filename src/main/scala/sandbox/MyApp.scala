package sandbox

import com.lessons.model.AdministratorUser
import com.lessons.model.User

// 修飾子
// なし -> public
// private -> javaと同様
// protected -> javaと同様
// ※ 同一パッケージないという概念が消えている、

// finalに関しては、javaでは次の要素があった。
// 1. 変数への再代入ができない
// 2. overrideできない
// 1に関しては、val, varで実現している状況のため役割として削られている

object MyApp {
	def main(args: Array[String]): Unit = {
		val x = 10 :Int
		println(x/3);

		val tom = new AdministratorUser("tom")
		// 同名objectでapplyを定義している場合、newを省略できる。
		val bob = User("bob")
		tom.sayhi()
		bob.sayhi()
	}

}
