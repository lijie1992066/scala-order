package cn.touna

/**
  * Created with IntelliJ IDEA. 
  * User: lijie
  * Email:lijiewj51137@touna.cn 
  * Date: 2017/7/19 
  * Time: 10:42  
  */
class Demo01 {

}

object Demo01 {
  def main(args: Array[String]): Unit = {

    //sortWith------------------
    val list01 = List[Person](new Person("lijie3", 25), new Person("lijie0", 99), new Person("lijie1", 24), new Person("lijie1", 1))
    val order01 = list01.sortWith((p1: Person, p2: Person) => {
      p1.name == p2.name match {
        case false => p1.name.compareTo(p2.name) < 0
        case _ => p1.age > p2.age
      }
    })
    for (x <- order01) {
      println("list01:" + x)
    }

    //sorted--------------------
    val list02 = List[Person](new Person("lijie3", 25), new Person("lijie0", 99), new Person("lijie1", 24), new Person("lijie1", 1))
    //引入隐式转换
    import MyPredef.Person2Comparable
    val order02 = list02.sorted
    for (x <- order02) {
      println("list02:" + x)
    }

    //sortby--------------------
    val list03 = List[Person](new Person("lijie3", 25), new Person("lijie0", 99), new Person("lijie1", 24), new Person("lijie1", 1))
    val order03 = list03.sortBy(p => p)
    for (x <- order03) {
      println("list03:" + x)
    }

  }
}

class Person(var name: String, var age: Int) {

  override def toString = s"Person($name, $age)"
}