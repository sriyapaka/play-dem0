
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vagrant/example-app/conf/routes
// @DATE:Sun Jun 17 09:40:04 UTC 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}