package euler

/**
  * Created by jay on 26/05/16.
  */
class Problem2 {
  def generateSumOfEvenValueFibonacciTerms(seed1:Int, seed2:Int, valueLimt: Int):Int = {
    generateFibonacciForValueLimit(seed1, seed2, valueLimt).filter(x => x%2 == 0).sum
  }
  
  def generateFibonacci(seed1:Int, seed2:Int, termLimit: Int):Seq[Int] = {
    doFibTerm(0, termLimit, seed1, seed2, Seq())
  }

  private def doFibTerm(index: Int, limit: Int, previous:Int, current:Int, fibNumbers: Seq[Int]):Seq[Int] = {
    index match {
      case `limit` => fibNumbers
      case _ => doFibTerm(index+1, limit, current, current+previous, fibNumbers:+previous)
    }
  }

  private def generateFibonacciForValueLimit(seed1:Int, seed2:Int, valueLimit: Int):Seq[Int] = {
    doFibValue(0, valueLimit, seed1, seed2, Seq())
  }

  private def doFibValue(index: Int, limit: Int, previous:Int, current:Int, fibNumbers: Seq[Int]):Seq[Int] = {
    if(current <= limit){
      doFibValue(index+1, limit, current, current+previous, fibNumbers:+current)
    }
    else {
      fibNumbers
    }
  }



}
