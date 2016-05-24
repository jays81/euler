package euler

/**
  * Created by jay on 24/05/16.
  */
class Problem1 {
  /**
    *Find the sum of all the multiples of 3 or 5 below a specified limit
    *
    */
  def sumMultiplesOfThreeAndFive(limit: Int) = {
    (1 until limit).filter(x => (x%3 == 0)  || (x%5 == 0)).sum
  }

}
