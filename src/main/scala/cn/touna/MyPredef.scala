package cn.touna

/**
  * Created with IntelliJ IDEA. 
  * User: lijie
  * Email:lijiewj51137@touna.cn 
  * Date: 2017/7/19 
  * Time: 11:18  
  */
object MyPredef {

  implicit object Person2Comparable extends Ordering[Person] {
    override def compare(x: Person, y: Person): Int = {
      x.name == y.name match {
        case false => x.name.compare(y.name)
        case _ => y.age - x.age
      }
    }
  }

}
