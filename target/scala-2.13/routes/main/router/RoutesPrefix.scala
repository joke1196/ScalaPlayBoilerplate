// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Coding/scala-play-boilerplate/conf/routes
// @DATE:Mon Mar 09 19:59:18 CET 2020


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
