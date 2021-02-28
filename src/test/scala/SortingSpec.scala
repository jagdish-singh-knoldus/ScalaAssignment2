import org.scalatest.flatspec.AnyFlatSpec

class SortingSpec extends AnyFlatSpec{

  "bubble sort" should "be found for list of integer" in {
    val res=Sorting.bubbleSortOfListOfInt(List(9,71,6,3,1))
    assert(res==List(1,3,6,9,71))
  }
}