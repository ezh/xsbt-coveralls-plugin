import sbt._
object PluginDef extends Build {
  override def projects = Seq(root)
  lazy val root = Project("plugins", file(".")) dependsOn(scct)
  lazy val scct = uri("git://github.com/ezh/sbt-scct.git#dbda90348a260995dea29eee97d03457742a8a67")
}
