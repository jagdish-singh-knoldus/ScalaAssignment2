import scala.annotation.tailrec
object Sorting extends App{

  /**
   * function for bubble sort of list of integer
   * @param list
   * @return List[Int]
   */
  def bubbleSortOfListOfInt(list: List[Int]):List[Int] = {
    @tailrec
    def bubbleSort(listOfInt: List[Int], rest: List[Int], sorted: List[Int]): List[Int] = listOfInt match {
      case x :: Nil =>
        if (rest.isEmpty) x :: sorted
        else bubbleSort(rest, Nil, x :: sorted)
      case a :: b :: xs =>
        if (a > b) bubbleSort(a :: xs, b :: rest, sorted)
        else       bubbleSort(b :: xs, a :: rest, sorted)
      case _=>
        Nil
    }
    bubbleSort(list, Nil, Nil)
  }


  /**
   * list of int
   */
  val listOfInt=List(90,60,100,30,1000)
  print(s"Bubble sort of ${listOfInt} : ")
  bubbleSortOfListOfInt(listOfInt).map(x=>print(x+" "))
}