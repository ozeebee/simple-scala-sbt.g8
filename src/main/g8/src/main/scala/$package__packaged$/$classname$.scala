package $organization$

import org.slf4j.LoggerFactory

object $classname$ {
	lazy val log = LoggerFactory.getLogger(this.getClass)

	def main(args: Array[String]) {
		log.info("***** Starting *****")
		println("Hello $name$!, logback version is $logback_version$")
		log.info("***** Finished *****")
	}

}