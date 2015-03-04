package sfxml

import java.io.IOException

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafxml.core.{FXMLView, NoDependencyResolver}

object Main extends JFXApp {

  val resource = getClass.getResource("list.fxml")
  if (resource == null) {
    throw new IOException("Cannot load resource: list.fxml")
  }

  val root = FXMLView(resource, NoDependencyResolver)

  stage = new PrimaryStage() {
    title = "ScalaFX ListView"
    scene = new Scene(root, 400, 540)
  }

}
