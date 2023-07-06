object Pattern {
    def isEven(n:Int):Boolean = n match
        case x if x%2==0 => true
        case _ => false
    def patternMatching(n:Int):String = n match
        case x if x<= 0              => "Negetive/Zero"
        case x if isEven(x) == true  => "Even"
        case x if isEven(x) == false => "Odd"
    def main(args:Array[String])={
        val n = scala.io.StdIn.readInt()
        println(patternMatching(n))
    }                                                                         
    
    
}
