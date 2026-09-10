resolvers += "HMRC-open-artefacts-maven" at "https://open.artefacts.tax.service.gov.uk/maven2"
resolvers += Resolver.url("HMRC-open-artefacts-ivy", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(
  Resolver.ivyStylePatterns
)

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix"   % "0.14.8")
addSbtPlugin("io.gatling"    % "gatling-sbt"    % "4.15.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt"   % "2.5.4")
addSbtPlugin("uk.gov.hmrc"   % "sbt-auto-build" % "3.24.0")
