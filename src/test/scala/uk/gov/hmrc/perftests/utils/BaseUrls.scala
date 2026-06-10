import uk.gov.hmrc.performance.conf.ServicesConfiguration

object BaseUrls extends ServicesConfiguration {
  val authLoginApiUri: String = baseUrlFor("auth-login-api")
}
