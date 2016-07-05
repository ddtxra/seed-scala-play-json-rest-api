package models

import play.api.libs.json.Json
import play.api.libs.json._

object Book {

  case class Book(name: String, author: String)

  implicit val bookWrites = Json.writes[Book]
  implicit val bookReads = Json.reads[Book]

  implicit val userDOWrite = new Writes[JavaBook] {
    def writes(jBook: JavaBook) = Json.obj(
      "title" -> jBook.getTitle
    )
  }
  
  var books = List(Book("TAOCP", "Knuth"), Book("SICP", "Sussman, Abelson"))
  var javaBooks = List(new JavaBook("hello1"), new JavaBook("hello2"))

  def addBook(b: Book) = books = books ::: List(b)
}
