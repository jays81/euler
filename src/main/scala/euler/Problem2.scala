package euler

/**
  * Created by jay on 26/05/16.
  */
class Problem2 {

  def generateFibonacci(seed1:Int, seed2:Int, limit: Int):Seq[Int] = {
    doFib(0, limit, seed1, seed2, Seq())
  }

  private def doFib(index: Int, limit: Int, previous:Int, current:Int, fibNumbers: Seq[Int]):Seq[Int] = {
    index match {
      case `limit` => fibNumbers
      case _ => doFib(index+1, limit, current, current+previous, fibNumbers:+previous)
    }
  }



}
