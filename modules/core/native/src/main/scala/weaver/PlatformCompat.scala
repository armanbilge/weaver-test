package weaver
import org.typelevel.scalaccompat.annotation.unused

private[weaver] object PlatformCompat {
  val platform: Platform = Platform.Native

  def getClassLoader(@unused clazz: java.lang.Class[_]): ClassLoader =
    new ClassLoader() {}
}
