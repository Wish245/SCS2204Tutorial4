object Formatter {
    def toUpper(str:String):String = str.toUpperCase()
    def toLower(str:String):String = str.toLowerCase()
    def formatNames(name: String, formatFunc: String => String): String = {
         formatFunc(name)
    }
    def main(args:Array[String])={
        println(formatNames("Benny", toUpper))
        println(formatNames("Niroshan",(name:String)=>toUpper(name.slice(0,2))+toLower(name.slice(2,8))))
        println(formatNames("Saman", toLower))
        println(formatNames("Kumara",(name:String)=>toUpper(name.slice(0,1))+toLower(name.slice(1,5))+toUpper(name.slice(5,6))))
    }    
}
