package x

import io.github.binaryfoo.RootDecoder

import scala.collection.JavaConversions

object Main {
  def main(args: Array[String]) {
    val decoder = new RootDecoder
    JavaConversions.collectionAsScalaIterable(decoder.decode("ffffffffff", "EMV", "95")).foreach(println)
  }
}
