package fotoshop.gui

import scala.swing._
import javax.swing.border.{LineBorder, TitledBorder}
import scala.swing.BorderPanel.Position.Center
import scala.swing.ScrollPane.BarPolicy

class ShortcutsPanel extends BorderPanel with Toggleable {

  border = new TitledBorder(GuiConstants.TB_SHORTCUTS)
  preferredSize = new Dimension(peer.getPreferredSize.width, GuiConstants.SHR_TABLE_HEIGHT)
  maximumSize = new Dimension(peer.getMaximumSize.width, GuiConstants.SHR_TABLE_HEIGHT)
  visible = false

  val scrollPane = new ScrollPane() {
    border = null // no border
    verticalScrollBarPolicy = BarPolicy.AsNeeded
    horizontalScrollBarPolicy = BarPolicy.AsNeeded
    contents = ShortcutsPanel.table
  }
  layout(scrollPane) = Center
}

object ShortcutsPanel {

  private val shortcutsTableHeader: Seq[String] = Seq("Shortcut", "Description")
  private val shortcutsTableData: Array[Array[Any]] = Array(
    Array("Click", "Select layer"),
    Array("Esc", "Unselect all layers"),
    Array("Ctrl+Click", "Show/hide layer"),
    Array("Arrow (selected)", "Move layer"),
    Array("Ctrl+L/R Arrow (selected)", "Change transparency"),
    Array("Alt+P", "Open Project menu"),
    Array("Alt+P+N", "Create new project"),
    Array("Alt+P+O", "Open a project"),
    Array("Alt+P+S", "Save current project"),
    Array("Alt+P+I", "Save image to file"),
    Array("Alt+P+C", "Close current project"),
    Array("Alt+P+X", "Exit"),
    Array("Alt+L+L", "Load image"),
    Array("Alt+L+D", "Delete layers"),
    Array("Alt+L+G", "Show/hide guideline"),
    Array("Alt+T+A", "Add (+C) to pixels"),
    Array("Alt+T+S", "Subtract (-C) from pixels"),
    Array("Alt+T+R", "Reverse subtract (C-N) pixels"),
    Array("Alt+T+M", "Multiply (*C) with pixels"),
    Array("Alt+T+D", "Divide (/C) pixels"),
    Array("Alt+T+V", "Reverse divide (C/N) with pixels"),
    Array("Alt+H", "Open About menu"),
    Array("Alt+H+I", "Show/hide inputs"),
    Array("Alt+H+S", "Show/hide shortcuts"),
    Array("Alt+H+V", "Show version info"),
  )

  private val _table = new Table(shortcutsTableData, shortcutsTableHeader) {
    border = new LineBorder(GuiConstants.COLOR_BLACK)
    enabled = false
    autoCreateRowSorter = true
  }

  def table: Table = _table
}
