package euler

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by jay on 24/05/16.
  * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
  * Find the sum of all the multiples of 3 or 5 below 1000.
  */
class Problem1Spec extends FlatSpec with Matchers {

  "Problem1" should "sum natural numbers below 10 which are multiples of 3 and 5" in {
    val problem1 = new Problem1

    val result = problem1.sumMultiplesOfThreeAndFive(10)
    result shouldBe 23

  }

  it should "sum natural numbers below 1000 which are multiples of 3 and 5" in {
    val problem1 = new Problem1

    val result = problem1.sumMultiplesOfThreeAndFive(1000)
    result shouldBe 233168

  }


}
