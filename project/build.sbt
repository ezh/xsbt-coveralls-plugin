resolvers += Classpaths.typesafeResolver

resolvers ++= Seq(
  "scct-github-repository" at "http://mtkopone.github.com/scct/maven-repo",
  "sonatype-oss-repo" at "https://oss.sonatype.org/content/groups/public/"
)

addSbtPlugin("com.github.theon" %% "xsbt-coveralls-plugin-meta" % "0.0.1-SNAPSHOT")
