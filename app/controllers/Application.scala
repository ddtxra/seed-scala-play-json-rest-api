package controllers

import play.api.libs.json._
import play.api.mvc._
import models.Book._

class Application extends Controller {

  def listBooks = Action {
    Ok(Json.toJson(javaBooks))
  }

}
