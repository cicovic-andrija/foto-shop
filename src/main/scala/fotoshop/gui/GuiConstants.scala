package fotoshop.gui

import java.awt.Color
import scala.swing.Dimension

// FIXME: Remove unused constants.
object GuiConstants {
  val MI_WIDTH              : Int       = 128
  val SIDEBAR_WIDTH         : Int       = 288
  val SHR_TABLE_HEIGHT      : Int       = 192
  val LAYER_PANEL_WIDTH     : Int       = 256
  val LAYER_PANEL_HEIGHT    : Int       = 144
  val LINE_THICKNESS        : Int       = 2
  val V_GAP_SIZE            : Int       = 3
  val H_GAP_SIZE            : Int       = 5
  val OUTPUT_MIN_W_H        : Int       = 32
  val OUTPUT_MAX_W_H        : Int       = 4096
  val TEXT_FIELD_WIDTH      : Int       = 10
  val APP_VERSION           : String    = "0.1 (c) Andrija Cicovic, 2021."
  val FRAME_TITLE           : String    = "FotoShop"
  val MENU_PROJECT          : String    = "Project"
  val MENU_HELP             : String    = "Help"
  val MI_NEW_PROJECT        : String    = "New Project..."
  val MI_OPEN_PROJECT       : String    = "Open Project..."
  val MI_SAVE_PROJECT       : String    = "Save Project..."
  val MI_CLOSE_PROJECT      : String    = "Close Project"
  val MI_EXIT               : String    = "Exit"
  val MI_SHORTCUTS          : String    = "Toggle Shortcuts"
  val MI_TOOLS              : String    = "Toggle Tools"
  val MI_VERSION            : String    = "Version"
  val TB_TOOLS              : String    = "Tools"
  val TB_LAYERS             : String    = "Layers"
  val TB_SHORTCUTS          : String    = "Shortcuts"
  val NEW_PROJ_DIALOG_TITLE : String    = "New Project"
  val NEW_PROJ_DIALOG_NAME_LABEL : String = "Project Name:"
  val NEW_PROJ_DIALOG_DEST_DIR_LABEL: String = "Location:"
  val NEW_PROJ_DIALOG_WIDTH_LABEL : String = "Width:"
  val NEW_PROJ_DIALOG_HEIGHT_LABEL : String = "Height:"
  val NEW_PROJ_DIALOG_CHOOSE_BTN : String = "Choose..."
  val NEW_PROJ_DIALOG_CREATE_BTN : String = "Create"
  val NEW_PROJ_DIALOG_MIN_MAX_LBL : String = "min: %d | max: %d".format(OUTPUT_MIN_W_H, OUTPUT_MAX_W_H)
  val NEW_PROJ_DIALOG_NAME_FORMAT : String = "a-z A-Z 0-9 _"
  val EXT_XML               : String    = "xml"
  val XML_ENC_UTF_8         : String    = "UTF-8"
  val SB_ERROR_PREFIX       : String    = "ERROR: "
  val SB_INIT_TEXT          : String    = "Initializing...Done."
  val SB_TEXT_READY         : String    = "Ready."
  val SB_TEXT_PROJ_CLOSED   : String    = "Project closed."
  val SB_FMT_CORRUPTED_PROJ : String    = "Failed to open project from file %s. The file is possibly corrupted."
  val SB_FMT_SAVE_FAILED    : String    = "Failed to save the project to file %s."
  val SB_FMT_SAVE_SUCCEEDED : String    = "Project saved to file %s."
  val OPEN_DIALOG_FILE_DESC : String    = "XML Files"
  val OPEN_DIALOG_TITLE     : String    = "Select project file"
  val VER_DIALOG_TITLE      : String    = FRAME_TITLE + " " + MI_VERSION + " Information"
  val VER_MESSAGE           : String    = FRAME_TITLE + " " + APP_VERSION
  val FRAME_MIN_SIZE        : Dimension = new Dimension(768, 432)
  val FRAME_PREF_SIZE       : Dimension = new Dimension(1600, 900)
  val DIAG_MIN_SIZE         : Dimension = new Dimension(192, 108)
  val LAYER_PANEL_SIZE      : Dimension = new Dimension(LAYER_PANEL_WIDTH, LAYER_PANEL_HEIGHT)
  val DIAG_PREF_SIZE        : Dimension = DIAG_MIN_SIZE
  val COLOR_LIGHT_GRAY      : Color     = Color.LIGHT_GRAY
  val COLOR_BLACK           : Color     = new Color(0, 0, 0)
  val COLOR_WHITE           : Color     = new Color(255, 255, 255)
  val COLOR_RED             : Color     = new Color(255, 0, 0)
}
