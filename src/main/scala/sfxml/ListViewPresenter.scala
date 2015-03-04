package sfxml

import scalafx.collections.ObservableBuffer
import scalafx.scene.control.ListView
import scalafx.scene.input.MouseEvent
import scalafxml.core.macros.sfxml

@sfxml
class ListViewPresenter(private val listView: ListView[String]) {
  var count = 0
  val characters = ObservableBuffer[String]("えび", "かに", "うに", "いくら", "ねこ")

  listView.items = characters

  def handleTapped(event: MouseEvent) = {
    if (event.getClickCount == 2) {
      val selectedPerson = listView.getSelectionModel.getSelectedItem
      println(s"$selectedPerson がダブルタップされました。")
      count += 1
      characters prepend selectedPerson + count
    }
  }

}

