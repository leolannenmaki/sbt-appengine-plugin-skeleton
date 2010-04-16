import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val a = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "1.1-SNAPSHOT"
}
